I am very sorry for my extremely coarse English.

# 1. Introduction

BreadCrumb project is a persistent bread crumb for JSF Applications. BreadCrumb is persisted into binary Base64 encoded compact token which can be passed as a GET parameter in HTTP Query String. As well binary representation of BreadCrumb can be saved into JSF view state using the saveState component from Apache Tomahawk component suite.

With breadcrumb I implemented the whole JSF application without any session scoped beans in it. All conversational state are kept by persistent breadcrumb. This leads to better scalability as session scoped session beans doesn't scale well to clusters.

I designed and implemented this component in three days...


# 2 Usage

1) Implement request scoped bean extending **net.iskandar.examples.shared.breadcrumb.BreadCrumb**:

```java
@Component
@Scope(value = "request")
public class BreadCrumbBean extends BreadCrumb {

}

```

2) Implement breadcrumb item classes. For example:


```java
public abstract class BaseProjectItem extends BaseItem {

    private Integer projectId;

    public BaseProjectItem(String viewName) {
        super(viewName);
    }

    public BaseProjectItem(String viewName, Integer projectId) {
        super(viewName);
        this.projectId = projectId;
    }

    protected Integer getProjectId() {
        return projectId;
    }

    @Override
    public void load(DataInputStream dis) throws IOException {
        projectId = dis.readInt();
    }

    @Override
    public void save(DataOutputStream dos) throws IOException {
        super.save(dos);
        dos.writeInt(projectId);
    }

    @Override
    public void applyToContext() {
        getAdapter().setProjectId(projectId);
    }

}


```


```java

public class ViewProjectItem extends BaseProjectItem {

    public ViewProjectItem() {
        super("viewProject");
    }

    public ViewProjectItem(Integer projectId) {
        super("viewProject", projectId);
    }

    @Override
    protected String createLabel() {
        Project project = getAdapter().getProject(getProjectId());
        return "View Project [" + project.getShortTitle() + "]";
    }

}



```


# 2. Goals

I developed breadcrumb component keeping the following goals in mind:

1) Conversational state persistence in application with infinite navigation (i.e. users navigation path one type of object is infinite).

2) Provide user with visual breadcrumb so that he/she can navigate back to any item of navigation stack


Very often enterprise Web Apps have complex navigation. When user can navigate from one enterprise data object to another. For example in my Project Management Sample user can perform such navigations:

1) **Projects** - Choosing "Projects" left menu item

2) **View Project [WFM]** - Choosing WFM project from project list

3) **View Employee [iskandar]** - Clicking on one of project members link

4) **View Project [Survey]** - Clicking on Survey project link in project list of Iskandar Zaynutdinov's profile

In such condition Bread Crumb will look so:

![BreadCrumb](images/BreadCrumbLayout1.png?raw=true)

To let user navigate back to one of navigation locations system must remember locations and relevant object id's (project id or employee id). So breadcrumb is just list of bread crumb item's of different type with relevant object id's.

For example this is code for the **net.iskandar.examples.project_management.jsf.breadcrumb.ViewProjectItem**:

```java
public class ViewProjectItem extends BaseProjectItem {

    public ViewProjectItem() {
        super("viewProject");
    }

    public ViewProjectItem(Integer projectId) {
        super("viewProject", projectId);
    }

    @Override
    protected String createLabel() {
        Project project = getAdapter().getProject(getProjectId());
        return "View Project [" + project.getShortTitle() + "]";
    }

}


````


# 3. Architecture

BreadCrumb provides implementation of persistent navigation history. It allows to persist navigation history needed to implement breadcrumb as URL parameter or in JSF view state.

![BreadCrumb](images/BreadCrumb.png?raw=true)

# 4. BreadCrumb

BreadCrumb methods contains the following groups of methods:

**State transfer methods**: getState, setState, getStateWithAddon, getStateSlice, getStateBinary, setStateBinary

**Navigational methods**: refresh, navigateBack, replaceCurrent, navigate

## 4.1 State transfer methods

### 4.1.1 String getState()

Returns representational state of breadcrumb as a Base64 encoded binary token/document. If you look into the **project_management** project it is used as a redirect parameter in JSF navigation rules just like that:

```xml
<navigation-rule>
  ...

  <navigation-case>
    <from-outcome>viewEmployee</from-outcome>
    <to-view-id>/viewEmployee.xhtml</to-view-id>
    <redirect>
      <redirect-param>
        <name>brcmb</name>
        <value>#{breadCrumbBean.state}</value>
        </redirect-param>
    </redirect>
  </navigation-case>

        ...
</navigation-rule>
```

**breadCrumbBean** - faces bean extending **BreadCrumb** class. In example navigation-rule I just pass Base64 encoded binary representational state of current breadcrumb as brcmb get parameter in redirect section.

### 4.1.2 void setState(String state)

Sets representation binary base64 encoded state into the breadcrumb. If you look into the **project_management** sample project it is used together with f:viewParam JSF tag:

**src/main/webapp/viewProject.xhtml**
```xml
<f:metadata>
  <f:viewParam name="brcmb" value="#{breadCrumbBean.state}" />
</f:metadata>

```

### 4.1.3 String getStateWithAddon(Item addon)

Returns state of breadcrumb as if it has additional item. Actually this method creates new breadcrumb, copies all items of existing breadcrumb one by one and adds provided item to the end of list and returns the state of new breadcrumb.

This method is used for navigation links. In **project_management** sample:

**net.iskandar.examples.project_management.jsf.BreadCrumbBean**, getStateViewProject(Project project) method uses getStateWithAddon method of BreadCrumb to return state of breadcrumb with additional ViewProjectItem (extends Item class).

```java
public String getStateViewProject(Project project){
    return getStateWithAddon(new ViewProjectItem(project.getId()));
}
```

in projects.xhtml this method is used to render project view link:

```html
<h:outputLink value="viewProject.jsf?brcmb=#{breadCrumbBean.getStateViewProject(proj)}">
    <h:outputText value="#{proj.title}" />
</h:outputLink>
```

### 4.1.4 String getStateSlice(Item item)

Creates Base64 encoded representational state of breadcrumb up to the item specified.

This method can be used to render get links in breadcrumb but, I do not have any example of this method in **project_management** sample. In **project_management** sample I use POST requests to navigate back the breadcrumb stack instead of using this method.

### 4.1.5 **byte[] getStateBinary()** and **void setStateBinary(byte[] state)**

Returns representational binary state of breadcrumb. It is used together with **t:saveState** from Apache Tomahawk component suite pass the state of beardcrumb inside the view state (it's needed for POST requests):

**project_management/src/main/webapp/WEB-INF/templates/main-menu.xhtml**

```xml
<f:view>
    <ui:insert name="metadata">

    </ui:insert>
    <t:saveState id="state" value="#{breadCrumbBean.stateBinary}" />
```


## 4.2 Navigational methods

### 4.2.1 Navigation rules

When using breadcrumb navigation rules is fairly simple. Navigation rules simply maps outcome provided by breadcrumb item to view id. Navigation always performed as a redirect not forward with breadcrumb state encoded as a GET parameter:

```xml

<navigation-case>
    <from-outcome>employees</from-outcome>
    <to-view-id>/employees.xhtml</to-view-id>
    <redirect>
        <redirect-param>
            <name>brcmb</name>
            <value>#{breadCrumbBean.state}</value>
        </redirect-param>
    </redirect>
</navigation-case>
<navigation-case>
    <from-outcome>viewEmployee</from-outcome>
    <to-view-id>/viewEmployee.xhtml</to-view-id>
    <redirect>
        <redirect-param>
            <name>brcmb</name>
            <value>#{breadCrumbBean.state}</value>
        </redirect-param>
    </redirect>
</navigation-case>
<navigation-case>
    <from-outcome>editEmployee</from-outcome>
    <to-view-id>/editEmployee.xhtml</to-view-id>
    <redirect>
        <redirect-param>
            <name>brcmb</name>
            <value>#{breadCrumbBean.state}</value>
        </redirect-param>
    </redirect>
</navigation-case>


```


### 4.2.2 String refresh()

Returns view name for current breadcrumb item. It is used inside **net.iskandar.examples.project_management.jsf.ProjectBean#addProjectDocument** to refresh current view which in this case is: viewProject.xhtml.

```java

class ProjectBean {

  public String addProjectDocument() {
      try {
          log.debug("addProjectDocument");
          log.debug("pdTitle=" + pdTitle);
          log.debug("pdDescription=" + pdDescription);
          Document document = new Document();
          log.debug(uploadedFile);
          document.setContentType(uploadedFile.getContentType());
          document.setOriginalFileName(uploadedFile.getSubmittedFileName());
          document.setInputStream(uploadedFile.getInputStream());
          service.addDocumentToProject(getProject(), pdTitle, pdDescription, document);
          pdTitle = null;
          pdDescription = null;
          uploadedFile = null;
          documents = null;
          return breadCrumbBean.refresh();
      } catch (IOException ex) {
          log.error("error adding document", ex);
          throw new RuntimeException("error adding document");
      }
  }

}


```


### 4.2.3 String navigateBack()

This method removes latest element from BreadCrumb and returns navigational outcome for new latest element (which is new top of the navigational stack). This method is used in **ProjectBean#updateProject**, **EmployeeBean#updateEmployee** and **TaskBean#updateTask**:

```java
public class TaskBean {

  ...

  public String updateTask(){
      Task task = new Task();
      task.setId(getTaskId());
      task.setAssignee(employeeDao.get(assigneeId));
      task.setStartDate(startDate);
      task.setEndDate(endDate);
      service.updateTask(task);
      return breadCrumbBean.navigateBack();
  }

  ...

}
```

### 4.2.4 String replaceCurrent(Item item)

Removes latest item from breadcrumb, adds provided item as a latest (current) item and returns outcome from newly added latest item. This method is used in (project_management sample) **ProjectBean#createProject** to navigate to the view page of newly created project so that user can add new documents or members into the project:
```java
public class ProjectBean {

  ...


  public String createProject() {
      Project project = setProjectValues();
      setProjectId(service.createProject(project));
      return breadCrumbBean.replaceCurrent(new ViewProjectItem(projectId));
  }



  ...

}
```

# Compiling

To compile project_management sample first compile it's dependency breadcrumb project:

````
breadcrumb $ mvn clean install
```

then compile project_management:

```
project_management $ mvn clean package
```

I tested the project on tomcat 8.0.28 only


## Architecture

Project Mangement Sample uses the following frameworks:

1) **Spring** to configure business object, DAO's and for transaction management. Project uses **OpenEntityManagerInViewFilter** which is part of **spring-orm** to implement Single EntityManager Per Request design pattern.

2) **JPA** backed by **Hibernate** for Object Relational
Mapping.

3) **JSF** with **PrimeFaces** at front-end

4) **Breadcrumb** my own library to implement persistent breadcrumb based navigation. Although, used with **JSF** in this project breadcrumb is not tied to **JSF** and can be used with any Web MVC framework such as Spring MVC or Struts2.

5) My own home grown Authentication system (very similar to Spring Security but simpler) - **net.iskandar.examples.project_management.authentication**. It includes: annotation-driven AuthenticateAspect, ez:has-role composite JSF component. Authenticator the object which performs authentication.

## Breadcrumb navigation

In Project Management Sample navigation can become infinite. User can navigate to project list. Open project view page for some project. Than click on one of members and open employee view page. Than click on some project link this user participates in.




**net.iskandar.examples.shared.breadcrumb.Breadcrumb** class is the heart of breadcrumb. It implements persistent breadcrumb which can be passed as a get parameter for example:

This allows to implement persistent and bookmarkable breadcrumb based navigation. Whole user navigation path persisted as binary Base64 encoded token (document). Event in the case user copies and pastes current url he/she will see that breadcrumb contains all navigation history.








I decided not to implement separate business objects (services) for every entity in this project. Instead there is only one business (transactional) object - **net.iskandar.examples.project_management.service.ProjectManagementService**


# ProjectManagementService

![Project Management Service](images/ProjectManagementService.png?raw=true)




# ProjectBean

ProjectBean depends on DAO's as well a to ProjectManagementService. It uses DAO's directly for non transactional read-only data access. ProjectManagementService implements only transactional logic.


![ProjectBean](images/ProjectBean.png?raw=true)

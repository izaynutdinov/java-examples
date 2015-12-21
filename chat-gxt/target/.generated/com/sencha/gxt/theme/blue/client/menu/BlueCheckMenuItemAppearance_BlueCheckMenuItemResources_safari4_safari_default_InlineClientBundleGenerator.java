package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemResources {
  private static BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator _instance0 = new BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator();
  private void checkStyleInitializer() {
    checkStyle = new com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "checkStyle";
      }
      public String getText() {
        return (".GCGCW0WDNRB{border:" + ("1px"+ " " +"dotted")  + " !important;padding:" + ("0")  + ";border-color:" + ("#a3bae9")  + " !important;background-color:" + ("#def8f6")  + ";}");
      }
      public java.lang.String menuItemChecked() {
        return "GCGCW0WDNRB";
      }
    }
    ;
  }
  private static class checkStyleInitializer {
    static {
      _instance0.checkStyleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemStyle get() {
      return checkStyle;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemStyle checkStyle() {
    return checkStyleInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDPSB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("right"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPSB a{color:" + ("#233d6d")  + ";}.GCGCW0WDATB{display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"27px"+ " " +"3px"+ " " +"21px")  + ";position:" + ("relative") ) + (";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDDTB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";cursor:" + ("pointer")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDCTB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:") + (("top")  + ";width:" + ("16px")  + ";position:" + ("absolute")  + ";right:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}a.GCGCW0WDATB{color:" + ("#222")  + ";}.GCGCW0WDBTB{height:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("left")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GCGCW0WDPSB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("left"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPSB a{color:" + ("#233d6d")  + ";}.GCGCW0WDATB{display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"21px"+ " " +"3px"+ " " +"27px")  + ";position:" + ("relative") ) + (";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDDTB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";cursor:" + ("pointer")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDCTB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:") + (("top")  + ";width:" + ("16px")  + ";position:" + ("absolute")  + ";left:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}a.GCGCW0WDATB{color:" + ("#222")  + ";}.GCGCW0WDBTB{height:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueCheckMenuItemAppearance_BlueCheckMenuItemResources_safari4_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("right")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String active() {
        return "GCGCW0WDPSB";
      }
      public java.lang.String menuItem() {
        return "GCGCW0WDATB";
      }
      public java.lang.String menuItemArrow() {
        return "GCGCW0WDBTB";
      }
      public java.lang.String menuItemIcon() {
        return "GCGCW0WDCTB";
      }
      public java.lang.String menuListItem() {
        return "GCGCW0WDDTB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle style() {
    return styleInitializer.get();
  }
  private void checkedInitializer() {
    checked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "checked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class checkedInitializer {
    static {
      _instance0.checkedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return checked;
    }
  }
  public com.google.gwt.resources.client.ImageResource checked() {
    return checkedInitializer.get();
  }
  private void groupCheckedInitializer() {
    groupChecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "groupChecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class groupCheckedInitializer {
    static {
      _instance0.groupCheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return groupChecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource groupChecked() {
    return groupCheckedInitializer.get();
  }
  private void itemOverInitializer() {
    itemOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 2, 21, false, false
    );
  }
  private static class itemOverInitializer {
    static {
      _instance0.itemOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemOver() {
    return itemOverInitializer.get();
  }
  private void menuParentInitializer() {
    menuParent = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuParent",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 12, 9, false, false
    );
  }
  private static class menuParentInitializer {
    static {
      _instance0.menuParentInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menuParent;
    }
  }
  public com.google.gwt.resources.client.ImageResource menuParent() {
    return menuParentInitializer.get();
  }
  private void uncheckedInitializer() {
    unchecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "unchecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class uncheckedInitializer {
    static {
      _instance0.uncheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return unchecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource unchecked() {
    return uncheckedInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemStyle checkStyle;
  private static com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle style;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABW0lEQVR42s2Ty0sCURTG/d+KstoHUZpQBC2CCLJdyzZFRpTmwkWUCAUWtKixwiIKn4xCdygdX0ONjS96jMNMm6+ZC7nInAo3HfjgXi7nd875ONdi+Rex6nLhr2oDyLLcUaqqQtM0KIpC7x0BwSOmTdFECr7ABZxL++ALD2g2m+aAOEtaSqQ41BsvGJ72oWdkHUw4Rbv4FSCZ5lAURBycsOjVkyedfpTLTz+PQO5zKAiPIHc8Xt9k2Ga30Te6gbMrDlmeNwdcR5OIsjnsBCN66w2ELgmsNjcm5v3USEI4c0C+WMLM4h6tyN4KmFoIYHDcg+MwobPzubw5IMmmkS9J6B/bhNXupsmOuV2o2jt9LwmCOeAmEkOl9oxl7ykG7B4MObZwyKRbOyCKojkgFk8gk8nqJkpY8Yaw5jvXjVRQq9dRrdYgSRVzwKeMZTGqGsYZ56+b+S2gq7/QTXwA3ngd6xuLHCkAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA20lEQVR42mNgGAU4gV/lvP88XvX/Wd3q/rsXzvxPkmafmsX/lWO6/svG9v5nC+39z+DZ/t8hZw5xhvhXzv2vAtSsm9T7XzYGaEAI0ADfnv8MTk3/3bKnEDaE17v+vwLQZjkgFowEag4CYu+u/wyuLf+ZLYsJG8DmXvufI6z3PwfQ6YxBUNs92oEuaPzPbF5I2AA3UIB5dfxn8ANq9On+z+AO1Ozc9J/Buuq/a/pE4sLBIRcYYC7N/xncWsF+B2l2SJ1CWkw4ZU7+z2RW9J/JpOC/U9qE/6MJGzcAAA5fZUJ66l+pAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAVCAYAAABsZT8HAAAAGklEQVR42mN4/fnvfxBmoJBx88Xv/yBMTwYA+d2en2a9xcEAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAJCAYAAAAGuM1UAAAAb0lEQVR42mOwaLr2n4EUYNtx979Ny2XiNWmXnvo/9fT//5bEagJp6Dv87X/X4T//HTtv/idKQ8iCl/+TVn38n77g6n+j0v3/CWoIWvDmf+iUc/+1CvcTZ4N798n/mnn7iPeDTsEB4kPJquocSfEAADQCQiRH/8LtAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABBElEQVR42s2T3UrDQBBG+/4X9k0UtKC11dKqVWyDrW7a2E0aN39NdhMSQpLbz3QvAqJuK7lx4LAwMGeGYbbT+Rdx0u3ir3wTFEVxNL8KTi/6P3LWu0avf4PB7fiwYPaif2HxZkA3TFDLxvju4XiBtlzhVd/AoFtYNoPjepg+Ph0WaMs1FuQdZE1lV+a48IMAYRhirmlqwfnlUI67MW18MFcWxXGMJEkkRF+pBVeDkRzX831wzpGmKfI8bzCtrVowHE3gej6iKJId90X7fFmW8mWOoxZM7qdNcZZlMldVVUNQ70IpeJ7NQYgOSs16BwzBbgcuBES9ByHiWs7VglaX2OovtIlPX7c5S7fSRyEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource checked;
  private static com.google.gwt.resources.client.ImageResource groupChecked;
  private static com.google.gwt.resources.client.ImageResource itemOver;
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.google.gwt.resources.client.ImageResource unchecked;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      checkStyle(), 
      style(), 
      checked(), 
      groupChecked(), 
      itemOver(), 
      menuParent(), 
      unchecked(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("checkStyle", checkStyle());
        resourceMap.put("style", style());
        resourceMap.put("checked", checked());
        resourceMap.put("groupChecked", groupChecked());
        resourceMap.put("itemOver", itemOver());
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("unchecked", unchecked());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'checkStyle': return this.@com.sencha.gxt.theme.blue.client.menu.BlueCheckMenuItemAppearance.BlueCheckMenuItemResources::checkStyle()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::style()();
      case 'checked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::checked()();
      case 'groupChecked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::groupChecked()();
      case 'itemOver': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::itemOver()();
      case 'menuParent': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::menuParent()();
      case 'unchecked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::unchecked()();
    }
    return null;
  }-*/;
}

package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources {
  private static BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator _instance0 = new BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator();
  private void itemOverInitializer() {
    itemOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDPSB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("right"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPSB a{color:" + ("#233d6d")  + ";}.GCGCW0WDATB{display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"27px"+ " " +"3px"+ " " +"21px")  + ";position:" + ("relative") ) + (";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDDTB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";cursor:" + ("pointer")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDCTB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:") + (("top")  + ";width:" + ("16px")  + ";position:" + ("absolute")  + ";right:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";vertical-align:" + ("middle")  + ";}a.GCGCW0WDATB{color:" + ("#222")  + ";}.GCGCW0WDBTB{height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("left")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GCGCW0WDPSB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("left"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPSB a{color:" + ("#233d6d")  + ";}.GCGCW0WDATB{display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"21px"+ " " +"3px"+ " " +"27px")  + ";position:" + ("relative") ) + (";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDDTB{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";cursor:" + ("pointer")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDCTB{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:") + (("top")  + ";width:" + ("16px")  + ";position:" + ("absolute")  + ";left:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";vertical-align:" + ("middle")  + ";}a.GCGCW0WDATB{color:" + ("#222")  + ";}.GCGCW0WDBTB{height:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (BlueMenuItemAppearance_BlueMenuItemResources_ie8_ie8_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("right")  + ";background-repeat:" + ("no-repeat")  + ";}"));
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
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAVCAYAAABsZT8HAAAAGklEQVR42mN4/fnvfxBmoJBx88Xv/yBMTwYA+d2en2a9xcEAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAJCAYAAAAGuM1UAAAAb0lEQVR42mOwaLr2n4EUYNtx979Ny2XiNWmXnvo/9fT//5bEagJp6Dv87X/X4T//HTtv/idKQ8iCl/+TVn38n77g6n+j0v3/CWoIWvDmf+iUc/+1CvcTZ4N798n/mnn7iPeDTsEB4kPJquocSfEAADQCQiRH/8LtAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource itemOver;
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      itemOver(), 
      menuParent(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("itemOver", itemOver());
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'itemOver': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::itemOver()();
      case 'menuParent': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::menuParent()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance.BlueMenuItemResources::style()();
    }
    return null;
  }-*/;
}

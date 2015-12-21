package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemResources {
  private static BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator _instance0 = new BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator();
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
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDETB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("right"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDETB a{color:" + ("#233d6d")  + ";}.GCGCW0WDFTB{display:" + ("block")  + ";font-size:" + ("1px")  + ";line-height:" + ("1px")  + ";margin:" + ("2px"+ " " +"3px")  + ";border-bottom:" + ("1px"+ " " +"solid")  + ";overflow:" + ("hidden") ) + (";font-size:" + ("1px")  + ";line-height:" + ("1px")  + ";background-color:" + ("#e0e0e0")  + ";border-bottom-color:" + ("#fff")  + ";}")) : ((".GCGCW0WDETB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueSeparatorMenuItemAppearance_BlueSeparatorMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("left"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDETB a{color:" + ("#233d6d")  + ";}.GCGCW0WDFTB{display:" + ("block")  + ";font-size:" + ("1px")  + ";line-height:" + ("1px")  + ";margin:" + ("2px"+ " " +"3px")  + ";border-bottom:" + ("1px"+ " " +"solid")  + ";overflow:" + ("hidden") ) + (";font-size:" + ("1px")  + ";line-height:" + ("1px")  + ";background-color:" + ("#e0e0e0")  + ";border-bottom-color:" + ("#fff")  + ";}"));
      }
      public java.lang.String active() {
        return "GCGCW0WDETB";
      }
      public java.lang.String menuSep() {
        return "GCGCW0WDFTB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAVCAYAAABsZT8HAAAAGklEQVR42mN4/fnvfxBmoJBx88Xv/yBMTwYA+d2en2a9xcEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource itemOver;
  private static com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      itemOver(), 
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
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'itemOver': return this.@com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemResources::itemOver()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueSeparatorMenuItemAppearance.BlueSeparatorMenuItemResources::style()();
    }
    return null;
  }-*/;
}

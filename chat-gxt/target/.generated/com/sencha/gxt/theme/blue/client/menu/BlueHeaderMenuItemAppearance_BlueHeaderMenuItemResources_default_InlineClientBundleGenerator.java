package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemResources {
  private static BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator _instance0 = new BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator();
  private void headerStyleInitializer() {
    headerStyle = new com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemStyle() {
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
        return "headerStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDORB{border-style:" + ("solid")  + ";background:" + ("#d6e3f2")  + ";border-color:" + ("#dae6f4"+ " " +"#dae6f4"+ " " +"#99bbe8"+ " " +"#99bbe8")  + ";border-width:" + ("1px")  + ";margin:" + ("-2px"+ " " +"-2px"+ " " +"0")  + ";color:" + ("#15428b")  + ";font:" + ("bold"+ " " +"10px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";display:" + ("block")  + ";padding:" + ("3px")  + ";}")) : ((".GCGCW0WDORB{border-style:" + ("solid")  + ";background:" + ("#d6e3f2")  + ";border-color:" + ("#dae6f4"+ " " +"#99bbe8"+ " " +"#99bbe8"+ " " +"#dae6f4")  + ";border-width:" + ("1px")  + ";margin:" + ("-2px"+ " " +"-2px"+ " " +"0")  + ";color:" + ("#15428b")  + ";font:" + ("bold"+ " " +"10px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";display:" + ("block")  + ";padding:" + ("3px")  + ";}"));
      }
      public java.lang.String menuText() {
        return "GCGCW0WDORB";
      }
    }
    ;
  }
  private static class headerStyleInitializer {
    static {
      _instance0.headerStyleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemStyle get() {
      return headerStyle;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemStyle headerStyle() {
    return headerStyleInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDPRB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("right"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";height:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd") ) + (";background-repeat:" + ("repeat-x")  + ";background-position:" + ("right"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPRB a{color:" + ("#233d6d")  + ";color:" + ("#233d6d")  + ";}")) : ((".GCGCW0WDPRB{border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";padding:" + ("0")  + " !important;height:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd")  + ";background-repeat:") + (("repeat-x")  + ";background-position:" + ("left"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";height:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";width:" + ((BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (BlueHeaderMenuItemAppearance_BlueHeaderMenuItemResources_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-color:" + ("#ebf3fd") ) + (";background-repeat:" + ("repeat-x")  + ";background-position:" + ("left"+ " " +"bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aaccf6")  + ";padding:" + ("0")  + ";}.GCGCW0WDPRB a{color:" + ("#233d6d")  + ";color:" + ("#233d6d")  + ";}"));
      }
      public java.lang.String active() {
        return "GCGCW0WDPRB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemStyle style() {
    return styleInitializer.get();
  }
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
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemStyle headerStyle;
  private static com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemStyle style;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAVCAYAAABsZT8HAAAAGklEQVR42mN4/fnvfxBmoJBx88Xv/yBMTwYA+d2en2a9xcEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource itemOver;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerStyle(), 
      style(), 
      itemOver(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("headerStyle", headerStyle());
        resourceMap.put("style", style());
        resourceMap.put("itemOver", itemOver());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerStyle': return this.@com.sencha.gxt.theme.blue.client.menu.BlueHeaderMenuItemAppearance.BlueHeaderMenuItemResources::headerStyle()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemResources::style()();
      case 'itemOver': return this.@com.sencha.gxt.theme.blue.client.menu.BlueItemAppearance.BlueItemResources::itemOver()();
    }
    return null;
  }-*/;
}

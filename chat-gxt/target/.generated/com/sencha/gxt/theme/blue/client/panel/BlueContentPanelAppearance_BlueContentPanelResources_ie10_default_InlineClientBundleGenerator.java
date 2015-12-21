package com.sencha.gxt.theme.blue.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueContentPanelAppearance_BlueContentPanelResources_ie10_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelResources {
  private static BlueContentPanelAppearance_BlueContentPanelResources_ie10_default_InlineClientBundleGenerator _instance0 = new BlueContentPanelAppearance_BlueContentPanelResources_ie10_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDGUB{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";border-color:" + ("#99bbe8")  + ";}.GCGCW0WDFUB{border-top-width:" + ("1px")  + ";}.GCGCW0WDEUB{position:" + ("relative")  + ";}.GCGCW0WDBUB{border-bottom:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:") + (("hidden")  + ";position:" + ("relative")  + ";background-color:" + ("#fff")  + ";border-color:" + ("#99bbe8")  + ";}.GCGCW0WDDUB{position:" + ("relative")  + ";}")) : ((".GCGCW0WDGUB{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";border-color:" + ("#99bbe8")  + ";}.GCGCW0WDFUB{border-top-width:" + ("1px")  + ";}.GCGCW0WDEUB{position:" + ("relative")  + ";}.GCGCW0WDBUB{border-bottom:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:") + (("hidden")  + ";position:" + ("relative")  + ";background-color:" + ("#fff")  + ";border-color:" + ("#99bbe8")  + ";}.GCGCW0WDDUB{position:" + ("relative")  + ";}"));
      }
      public java.lang.String body() {
        return "GCGCW0WDBUB";
      }
      public java.lang.String bodyWrap() {
        return "GCGCW0WDCUB";
      }
      public java.lang.String footer() {
        return "GCGCW0WDDUB";
      }
      public java.lang.String header() {
        return "GCGCW0WDEUB";
      }
      public java.lang.String noHeader() {
        return "GCGCW0WDFUB";
      }
      public java.lang.String panel() {
        return "GCGCW0WDGUB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.blue.client.panel.BlueContentPanelAppearance.BlueContentPanelResources::style()();
    }
    return null;
  }-*/;
}

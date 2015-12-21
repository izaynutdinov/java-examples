package com.sencha.gxt.theme.base.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CollapsePanelDefaultAppearance_CollapsePanelResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelResources {
  private static CollapsePanelDefaultAppearance_CollapsePanelResources_default_InlineClientBundleGenerator _instance0 = new CollapsePanelDefaultAppearance_CollapsePanelResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDPLB{border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + ";padding:" + ("2px")  + ";}.GCGCW0WDOLB,.GCGCW0WDAMB{padding-top:" + ("3px")  + ";}.GCGCW0WDBMB,.GCGCW0WDMLB{padding-top:" + ("4px")  + ";}.GCGCW0WDOLB .GCGCW0WDNLB,.GCGCW0WDAMB .GCGCW0WDNLB{float:" + ("left")  + ";}")) : ((".GCGCW0WDPLB{border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + ";padding:" + ("2px")  + ";}.GCGCW0WDOLB,.GCGCW0WDAMB{padding-top:" + ("3px")  + ";}.GCGCW0WDBMB,.GCGCW0WDMLB{padding-top:" + ("4px")  + ";}.GCGCW0WDOLB .GCGCW0WDNLB,.GCGCW0WDAMB .GCGCW0WDNLB{float:" + ("right")  + ";}"));
      }
      public java.lang.String east() {
        return "GCGCW0WDMLB";
      }
      public java.lang.String iconWrap() {
        return "GCGCW0WDNLB";
      }
      public java.lang.String north() {
        return "GCGCW0WDOLB";
      }
      public java.lang.String panel() {
        return "GCGCW0WDPLB";
      }
      public java.lang.String south() {
        return "GCGCW0WDAMB";
      }
      public java.lang.String west() {
        return "GCGCW0WDBMB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.base.client.widget.CollapsePanelDefaultAppearance.CollapsePanelResources::style()();
    }
    return null;
  }-*/;
}

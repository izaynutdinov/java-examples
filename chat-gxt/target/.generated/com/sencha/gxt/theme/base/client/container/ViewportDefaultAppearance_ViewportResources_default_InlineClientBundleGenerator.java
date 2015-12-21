package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ViewportDefaultAppearance_ViewportResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportResources {
  private static ViewportDefaultAppearance_ViewportResources_default_InlineClientBundleGenerator _instance0 = new ViewportDefaultAppearance_ViewportResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle() {
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
        return (".GCGCW0WDDQ{overflow:" + ("hidden")  + ";}");
      }
      public java.lang.String viewport() {
        return "GCGCW0WDDQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportResources::style()();
    }
    return null;
  }-*/;
}

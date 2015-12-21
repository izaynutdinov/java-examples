package com.sencha.gxt.theme.blue.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueBorderLayoutAppearance_BlueBorderLayoutResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutResources {
  private static BlueBorderLayoutAppearance_BlueBorderLayoutResources_default_InlineClientBundleGenerator _instance0 = new BlueBorderLayoutAppearance_BlueBorderLayoutResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutStyle() {
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
        return "css";
      }
      public String getText() {
        return (".GCGCW0WDCQB{background-color:" + ("#dfe8f6")  + ";}");
      }
      public java.lang.String child() {
        return "GCGCW0WDBQB";
      }
      public java.lang.String container() {
        return "GCGCW0WDCQB";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.blue.client.container.BlueBorderLayoutAppearance.BlueBorderLayoutResources::css()();
    }
    return null;
  }-*/;
}

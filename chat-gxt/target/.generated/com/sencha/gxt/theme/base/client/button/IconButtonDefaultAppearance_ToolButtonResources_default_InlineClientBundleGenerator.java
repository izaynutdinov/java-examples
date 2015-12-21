package com.sencha.gxt.theme.base.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class IconButtonDefaultAppearance_ToolButtonResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.ToolButtonResources {
  private static IconButtonDefaultAppearance_ToolButtonResources_default_InlineClientBundleGenerator _instance0 = new IconButtonDefaultAppearance_ToolButtonResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDOO{width:" + ("15px")  + ";height:" + ("15px")  + ";overflow:" + ("hidden")  + ";margin-right:" + ("2px")  + ";background-repeat:" + ("no-repeat")  + ";cursor:" + ("pointer")  + ";}")) : ((".GCGCW0WDOO{width:" + ("15px")  + ";height:" + ("15px")  + ";overflow:" + ("hidden")  + ";margin-left:" + ("2px")  + ";background-repeat:" + ("no-repeat")  + ";cursor:" + ("pointer")  + ";}"));
      }
      public java.lang.String button() {
        return "GCGCW0WDOO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.ToolButtonResources::style()();
    }
    return null;
  }-*/;
}

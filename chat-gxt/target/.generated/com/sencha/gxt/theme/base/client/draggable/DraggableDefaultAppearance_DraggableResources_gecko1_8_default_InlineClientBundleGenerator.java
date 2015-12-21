package com.sencha.gxt.theme.base.client.draggable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DraggableDefaultAppearance_DraggableResources_gecko1_8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableResources {
  private static DraggableDefaultAppearance_DraggableResources_gecko1_8_default_InlineClientBundleGenerator _instance0 = new DraggableDefaultAppearance_DraggableResources_gecko1_8_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDEQ{cursor:" + ("default")  + " !important;}.GCGCW0WDFQ{border:" + ("1px"+ " " +"dashed"+ " " +"#3b5a82")  + ";background-color:" + ("#c3daf9")  + ";z-index:" + ("20000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";cursor:" + ("move")  + ";opacity:" + ("0.5")  + ";}")) : ((".GCGCW0WDEQ{cursor:" + ("default")  + " !important;}.GCGCW0WDFQ{border:" + ("1px"+ " " +"dashed"+ " " +"#3b5a82")  + ";background-color:" + ("#c3daf9")  + ";z-index:" + ("20000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";cursor:" + ("move")  + ";opacity:" + ("0.5")  + ";}"));
      }
      public java.lang.String cursor() {
        return "GCGCW0WDEQ";
      }
      public java.lang.String proxy() {
        return "GCGCW0WDFQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.base.client.draggable.DraggableDefaultAppearance.DraggableResources::style()();
    }
    return null;
  }-*/;
}

package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Layer_LayerResourcesIe_ie8_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.dom.Layer.LayerResourcesIe {
  private static Layer_LayerResourcesIe_ie8_default_InlineClientBundleGenerator _instance0 = new Layer_LayerResourcesIe_ie8_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.core.client.dom.Layer.LayerStyleIe() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDFJ{position:" + ("absolute")  + ";visibility:" + ("hidden")  + ";right:" + ("0")  + ";top:" + ("0")  + ";overflow:" + ("hidden")  + ";filter:" + ("alpha(opacity=0)")  + ";}.GCGCW0WDDJ *{overflow:" + ("hidden")  + ";padding:" + ("0")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";clear:") + (("none")  + ";zoom:" + ("1")  + ";}.GCGCW0WDDJ{display:" + ("none")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";background-color:" + ("#777")  + ";filter:" + ("progid:DXImageTransform.Microsoft.alpha(opacity=50) progid:DXImageTransform.Microsoft.Blur(pixelradius="+ " " +"4"+ " " +")")  + ";}")) : ((".GCGCW0WDFJ{position:" + ("absolute")  + ";visibility:" + ("hidden")  + ";left:" + ("0")  + ";top:" + ("0")  + ";overflow:" + ("hidden")  + ";filter:" + ("alpha(opacity=0)")  + ";}.GCGCW0WDDJ *{overflow:" + ("hidden")  + ";padding:" + ("0")  + ";border:" + ("0")  + ";margin:" + ("0")  + ";clear:") + (("none")  + ";zoom:" + ("1")  + ";}.GCGCW0WDDJ{display:" + ("none")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";background-color:" + ("#777")  + ";filter:" + ("progid:DXImageTransform.Microsoft.alpha(opacity=50) progid:DXImageTransform.Microsoft.Blur(pixelradius="+ " " +"4"+ " " +")")  + ";}"));
      }
      public java.lang.String shadow() {
        return "GCGCW0WDDJ";
      }
      public int shadowOffset() {
        return 4;
      }
      public java.lang.String shim() {
        return "GCGCW0WDFJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.core.client.dom.Layer.LayerStyleIe get() {
      return style;
    }
  }
  public com.sencha.gxt.core.client.dom.Layer.LayerStyleIe style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.core.client.dom.Layer.LayerStyleIe style;
  
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
      case 'style': return this.@com.sencha.gxt.core.client.dom.Layer.LayerResourcesIe::style()();
    }
    return null;
  }-*/;
}

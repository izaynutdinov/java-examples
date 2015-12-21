package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskResources {
  private static Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator _instance0 = new Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator();
  private void boxBackgroundInitializer() {
    boxBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "boxBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 26, false, false
    );
  }
  private static class boxBackgroundInitializer {
    static {
      _instance0.boxBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return boxBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource boxBackground() {
    return boxBackgroundInitializer.get();
  }
  private void cssInitializer() {
    css = new com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDHJ{z-index:" + ("100")  + ";top:" + ("0")  + ";right:" + ("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";zoom:" + ("1")  + ";position:" + ("absolute")  + ";opacity:" + ("0.5")  + ";background-color:" + ("#ccc")  + ";}.GCGCW0WDGJ{z-index:" + ("101")  + ";position:") + (("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";border:" + ("1px"+ " " +"solid")  + ";padding:" + ("2px")  + ";height:" + ((Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getSafeUri().asString() + "\") -" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getLeft() + "px -" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getTop() + "px  repeat-x")  + ";border-color:" + ("#6593cf")  + ";background-color:" + ("#c3daf9")  + ";}.GCGCW0WDKJ{padding:" + ("5px"+ " " +"10px"+ " " +"5px"+ " " +"10px") ) + (";border:" + ("1px"+ " " +"solid")  + ";cursor:" + ("wait")  + ";background-color:" + ("white")  + ";border-color:" + ("#a3bad9")  + ";color:" + ("#222")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDJJ{position:" + ("relative")  + " !important;}.GCGCW0WDIJ{overflow:" + ("hidden")  + " !important;}.GCGCW0WDIJ select,.GCGCW0WDIJ object,.GCGCW0WDIJ embed{visibility:" + ("hidden")  + ";}")) : ((".GCGCW0WDHJ{z-index:" + ("100")  + ";top:" + ("0")  + ";left:" + ("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";zoom:" + ("1")  + ";position:" + ("absolute")  + ";opacity:" + ("0.5")  + ";background-color:" + ("#ccc")  + ";}.GCGCW0WDGJ{z-index:" + ("101")  + ";position:") + (("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";border:" + ("1px"+ " " +"solid")  + ";padding:" + ("2px")  + ";height:" + ((Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getSafeUri().asString() + "\") -" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getLeft() + "px -" + (Mask_MaskDefaultAppearance_MaskResources_ie9_default_InlineClientBundleGenerator.this.boxBackground()).getTop() + "px  repeat-x")  + ";border-color:" + ("#6593cf")  + ";background-color:" + ("#c3daf9")  + ";}.GCGCW0WDKJ{padding:" + ("5px"+ " " +"10px"+ " " +"5px"+ " " +"10px") ) + (";border:" + ("1px"+ " " +"solid")  + ";cursor:" + ("wait")  + ";background-color:" + ("white")  + ";border-color:" + ("#a3bad9")  + ";color:" + ("#222")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDJJ{position:" + ("relative")  + " !important;}.GCGCW0WDIJ{overflow:" + ("hidden")  + " !important;}.GCGCW0WDIJ select,.GCGCW0WDIJ object,.GCGCW0WDIJ embed{visibility:" + ("hidden")  + ";}"));
      }
      public java.lang.String box() {
        return "GCGCW0WDGJ";
      }
      public java.lang.String mask() {
        return "GCGCW0WDHJ";
      }
      public java.lang.String masked() {
        return "GCGCW0WDIJ";
      }
      public java.lang.String positioned() {
        return "GCGCW0WDJJ";
      }
      public java.lang.String text() {
        return "GCGCW0WDKJ";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAaCAYAAAB2BDbRAAAAVklEQVR42mN4/O7Pf4a7r/7+Z7jxHMi69BhInL73G5k4fPMPlNh16TeU2Hzu13+GSTu+QYnpu3/8Z5i19zuUmH8AyF18GIVYefznf4a1J39BCbABIAIAZ1Fan/xRgxAAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource boxBackground;
  private static com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      boxBackground(), 
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("boxBackground", boxBackground());
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'boxBackground': return this.@com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskResources::boxBackground()();
      case 'css': return this.@com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskResources::css()();
    }
    return null;
  }-*/;
}

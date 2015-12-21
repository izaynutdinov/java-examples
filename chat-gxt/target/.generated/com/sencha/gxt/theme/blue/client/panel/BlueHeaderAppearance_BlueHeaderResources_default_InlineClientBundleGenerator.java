package com.sencha.gxt.theme.blue.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderResources {
  private static BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator _instance0 = new BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 300, false, false
    );
  }
  private static class headerBackgroundInitializer {
    static {
      _instance0.headerBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return headerBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource headerBackground() {
    return headerBackgroundInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDKVB{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";}.GCGCW0WDNVB{float:" + ("right")  + ";}.GCGCW0WDMVB .GCGCW0WDNVB{width:" + ("18px")  + ";}.GCGCW0WDMVB .GCGCW0WDOVB{right:" + ("20px")  + ";}.GCGCW0WDOVB{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GCGCW0WDLVB{float:" + ("left")  + ";}.GCGCW0WDKVB{height:") + (((BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#15428b")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#99bbe8")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8") ) + (";border-top:" + ("none")  + ";}")) : ((".GCGCW0WDKVB{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";}.GCGCW0WDNVB{float:" + ("left")  + ";}.GCGCW0WDMVB .GCGCW0WDNVB{width:" + ("18px")  + ";}.GCGCW0WDMVB .GCGCW0WDOVB{left:" + ("20px")  + ";}.GCGCW0WDOVB{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GCGCW0WDLVB{float:" + ("right")  + ";}.GCGCW0WDKVB{height:") + (((BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (BlueHeaderAppearance_BlueHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#15428b")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#99bbe8")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8") ) + (";border-top:" + ("none")  + ";}"));
      }
      public java.lang.String header() {
        return "GCGCW0WDKVB";
      }
      public java.lang.String headerBar() {
        return "GCGCW0WDLVB";
      }
      public java.lang.String headerHasIcon() {
        return "GCGCW0WDMVB";
      }
      public java.lang.String headerIcon() {
        return "GCGCW0WDNVB";
      }
      public java.lang.String headerText() {
        return "GCGCW0WDOVB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQAsAcQAAAAAAP///5m76ISgxKvH7LjP7rrQ7rzS77/U8MHV8MLW8Mja8tTi9L3T78TY8cbZ8cnb8svd883e89Dg9M/f89Lh9NXk9djm9tfl9drn9vP3+////wAAAAAAAAAAAAAAACH5BAEAABsALAAAAAABACwBAAUyoKBl2YVZTDVRElEYR4MkivMsUCTtfO//wKBwSCwaj0hfYMlsOp/QqHRKrVqv2Kx1EAIAOw==";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerBackground(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("headerBackground", headerBackground());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerBackground': return this.@com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.panel.BlueHeaderAppearance.BlueHeaderResources::style()();
    }
    return null;
  }-*/;
}

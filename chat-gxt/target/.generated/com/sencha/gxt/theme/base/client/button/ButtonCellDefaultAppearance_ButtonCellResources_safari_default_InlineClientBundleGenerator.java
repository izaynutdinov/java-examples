package com.sencha.gxt.theme.base.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources {
  private static ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator _instance0 = new ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator();
  private void arrowInitializer() {
    arrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 10, 10, false, false
    );
  }
  private static class arrowInitializer {
    static {
      _instance0.arrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrow() {
    return arrowInitializer.get();
  }
  private void arrowBottomInitializer() {
    arrowBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrowBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 200, 14, false, false
    );
  }
  private static class arrowBottomInitializer {
    static {
      _instance0.arrowBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrowBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrowBottom() {
    return arrowBottomInitializer.get();
  }
  private void splitInitializer() {
    split = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "split",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 14, 72, false, false
    );
  }
  private static class splitInitializer {
    static {
      _instance0.splitInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return split;
    }
  }
  public com.google.gwt.resources.client.ImageResource split() {
    return splitInitializer.get();
  }
  private void splitBottomInitializer() {
    splitBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "splitBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 200, 14, false, false
    );
  }
  private static class splitBottomInitializer {
    static {
      _instance0.splitBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return splitBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource splitBottom() {
    return splitBottomInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDLM{cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDMM .GCGCW0WDDN{width:" + ("100%")  + ";}.GCGCW0WDLM td{text-align:" + ("center")  + ";}.GCGCW0WDLM td img{float:" + ("right")  + ";}.GCGCW0WDAN td img,.GCGCW0WDNM td img{float:" + ("none")  + ";}.GCGCW0WDBN{padding:" + ("0"+ " " +"2px")  + ";}.GCGCW0WDKN{padding:" + ("0"+ " " +"2px")  + ";font-family:" + ("Tahoma"+ ","+ " " +"Arial"+ ","+ " " +"Verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:") + (("normal")  + ";text-align:" + ("center")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GCGCW0WDBN div{font-size:" + ("1px")  + ";}.GCGCW0WDHN .GCGCW0WDOM td,.GCGCW0WDHN .GCGCW0WDPM td,.GCGCW0WDHN .GCGCW0WDFN td{line-height:" + ("18px")  + ";}.GCGCW0WDEN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDEN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("20px")  + ";}.GCGCW0WDEN .GCGCW0WDOM td,.GCGCW0WDEN .GCGCW0WDPM td,.GCGCW0WDEN .GCGCW0WDFN td{line-height:" + ("24px")  + ";}.GCGCW0WDEN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDEN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("26px")  + ";}.GCGCW0WDCN .GCGCW0WDOM td,.GCGCW0WDCN .GCGCW0WDPM td,.GCGCW0WDCN .GCGCW0WDFN td,.GCGCW0WDCN .GCGCW0WDBN div{line-height:" + ("32px") ) + (";}.GCGCW0WDCN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDCN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("34px")  + ";}.GCGCW0WDIN{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDJN{height:") + (((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";gwt-image:" + ("\"splitBottom\"")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDJM{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px") ) + (";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDKM{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GCGCW0WDLM{cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";}.GCGCW0WDMM .GCGCW0WDDN{width:" + ("100%")  + ";}.GCGCW0WDLM td{text-align:" + ("center")  + ";}.GCGCW0WDLM td img{float:" + ("left")  + ";}.GCGCW0WDAN td img,.GCGCW0WDNM td img{float:" + ("none")  + ";}.GCGCW0WDBN{padding:" + ("0"+ " " +"2px")  + ";}.GCGCW0WDKN{padding:" + ("0"+ " " +"2px")  + ";font-family:" + ("Tahoma"+ ","+ " " +"Arial"+ ","+ " " +"Verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:") + (("normal")  + ";text-align:" + ("center")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GCGCW0WDBN div{font-size:" + ("1px")  + ";}.GCGCW0WDHN .GCGCW0WDOM td,.GCGCW0WDHN .GCGCW0WDPM td,.GCGCW0WDHN .GCGCW0WDFN td{line-height:" + ("18px")  + ";}.GCGCW0WDEN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDEN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("20px")  + ";}.GCGCW0WDEN .GCGCW0WDOM td,.GCGCW0WDEN .GCGCW0WDPM td,.GCGCW0WDEN .GCGCW0WDFN td{line-height:" + ("24px")  + ";}.GCGCW0WDEN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDEN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("26px")  + ";}.GCGCW0WDCN .GCGCW0WDOM td,.GCGCW0WDCN .GCGCW0WDPM td,.GCGCW0WDCN .GCGCW0WDFN td,.GCGCW0WDCN .GCGCW0WDBN div{line-height:" + ("32px") ) + (";}.GCGCW0WDCN .GCGCW0WDAN .GCGCW0WDBN div,.GCGCW0WDCN .GCGCW0WDNM .GCGCW0WDBN div{height:" + ("34px")  + ";}.GCGCW0WDIN{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDJN{height:") + (((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";gwt-image:" + ("\"splitBottom\"")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDJM{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px") ) + (";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GCGCW0WDKM{height:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (ButtonCellDefaultAppearance_ButtonCellResources_safari_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String arrow() {
        return "GCGCW0WDJM";
      }
      public java.lang.String arrowBottom() {
        return "GCGCW0WDKM";
      }
      public java.lang.String button() {
        return "GCGCW0WDLM";
      }
      public java.lang.String hasWidth() {
        return "GCGCW0WDMM";
      }
      public java.lang.String iconBottom() {
        return "GCGCW0WDNM";
      }
      public java.lang.String iconLeft() {
        return "GCGCW0WDOM";
      }
      public java.lang.String iconRight() {
        return "GCGCW0WDPM";
      }
      public java.lang.String iconTop() {
        return "GCGCW0WDAN";
      }
      public java.lang.String iconWrap() {
        return "GCGCW0WDBN";
      }
      public java.lang.String large() {
        return "GCGCW0WDCN";
      }
      public java.lang.String mainTable() {
        return "GCGCW0WDDN";
      }
      public java.lang.String medium() {
        return "GCGCW0WDEN";
      }
      public java.lang.String noIcon() {
        return "GCGCW0WDFN";
      }
      public java.lang.String over() {
        return "GCGCW0WDGN";
      }
      public java.lang.String small() {
        return "GCGCW0WDHN";
      }
      public java.lang.String split() {
        return "GCGCW0WDIN";
      }
      public java.lang.String splitBottom() {
        return "GCGCW0WDJN";
      }
      public java.lang.String text() {
        return "GCGCW0WDKN";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAFklEQVR42mNgGFrgPxZMlGKiTB5MAAAf3gj4JnSxiwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAALUlEQVR42u3TMQ0AAAgEMfybBgP8xEibnISrAgAAAAAAjnoJCJMAYRIAAACeGvgeCPjeNr45AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAABICAYAAADGScSgAAAAP0lEQVR42u3RsQkAMAgEQPffzIGsTQZIwHQp7uHLQ+EjdjKzq6rjNSAIgiAIfgz70PHFOxq82uYAQRAEwV/hAtuuENY01icUAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAANklEQVR42u3VAQ0AAAjDMPzrwhcY4Apok0l4XgVk3T2S7mqAyIUCAAD8M0dAGAkQRgIAAMBTCyEZuLtPdFEgAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource arrow;
  private static com.google.gwt.resources.client.ImageResource arrowBottom;
  private static com.google.gwt.resources.client.ImageResource split;
  private static com.google.gwt.resources.client.ImageResource splitBottom;
  private static com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      arrow(), 
      arrowBottom(), 
      split(), 
      splitBottom(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("arrow", arrow());
        resourceMap.put("arrowBottom", arrowBottom());
        resourceMap.put("split", split());
        resourceMap.put("splitBottom", splitBottom());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'arrow': return this.@com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources::arrow()();
      case 'arrowBottom': return this.@com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources::arrowBottom()();
      case 'split': return this.@com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources::split()();
      case 'splitBottom': return this.@com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources::splitBottom()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance.ButtonCellResources::style()();
    }
    return null;
  }-*/;
}

package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipResources {
  private static ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator _instance0 = new ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator();
  private void anchorBottomInitializer() {
    anchorBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 9, 10, false, false
    );
  }
  private static class anchorBottomInitializer {
    static {
      _instance0.anchorBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorBottom() {
    return anchorBottomInitializer.get();
  }
  private void anchorLeftInitializer() {
    anchorLeft = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorLeft",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 10, 9, false, false
    );
  }
  private static class anchorLeftInitializer {
    static {
      _instance0.anchorLeftInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorLeft;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorLeft() {
    return anchorLeftInitializer.get();
  }
  private void anchorRightInitializer() {
    anchorRight = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorRight",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 10, 9, false, false
    );
  }
  private static class anchorRightInitializer {
    static {
      _instance0.anchorRightInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorRight;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorRight() {
    return anchorRightInitializer.get();
  }
  private void anchorTopInitializer() {
    anchorTop = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "anchorTop",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 9, 10, false, false
    );
  }
  private static class anchorTopInitializer {
    static {
      _instance0.anchorTopInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return anchorTop;
    }
  }
  public com.google.gwt.resources.client.ImageResource anchorTop() {
    return anchorTopInitializer.get();
  }
  private void errorIconInitializer() {
    errorIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "errorIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class errorIconInitializer {
    static {
      _instance0.errorIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return errorIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource errorIcon() {
    return errorIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDFT{padding:" + ("2px")  + ";font-size:" + ("12px")  + ";}.GCGCW0WDGT{float:" + ("left")  + ";}.GCGCW0WDCT{color:" + ("#444")  + ";font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDDT{color:" + ("#444")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDNS{zoom:" + ("1")  + ";}.GCGCW0WDOS{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDAT{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDPS{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDBT{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDCT{font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:" + ("#444")  + ";}.GCGCW0WDDT{font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:") + (("#444")  + ";padding-right:" + ("0")  + ";}.GCGCW0WDET{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-right:" + ("20px")  + ";}")) : ((".GCGCW0WDFT{padding:" + ("2px")  + ";font-size:" + ("12px")  + ";}.GCGCW0WDGT{float:" + ("right")  + ";}.GCGCW0WDCT{color:" + ("#444")  + ";font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDDT{color:" + ("#444")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDNS{zoom:" + ("1")  + ";}.GCGCW0WDOS{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorBottom()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDAT{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorRight()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDPS{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorLeft()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDBT{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.anchorTop()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";}.GCGCW0WDCT{font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:" + ("#444")  + ";}.GCGCW0WDDT{font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:") + (("#444")  + ";padding-left:" + ("0")  + ";}.GCGCW0WDET{height:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getHeight() + "px")  + ";width:" + ((ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getSafeUri().asString() + "\") -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getLeft() + "px -" + (ErrorTipDefaultAppearance_ErrorTipResources_ie8_default_InlineClientBundleGenerator.this.errorIcon()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("-1"+ " " +"4px")  + ";padding-left:" + ("20px")  + ";}"));
      }
      public java.lang.String anchor() {
        return "GCGCW0WDNS";
      }
      public java.lang.String anchorBottom() {
        return "GCGCW0WDOS";
      }
      public java.lang.String anchorLeft() {
        return "GCGCW0WDPS";
      }
      public java.lang.String anchorRight() {
        return "GCGCW0WDAT";
      }
      public java.lang.String anchorTop() {
        return "GCGCW0WDBT";
      }
      public java.lang.String heading() {
        return "GCGCW0WDCT";
      }
      public java.lang.String text() {
        return "GCGCW0WDDT";
      }
      public java.lang.String textWrap() {
        return "GCGCW0WDET";
      }
      public java.lang.String tip() {
        return "GCGCW0WDFT";
      }
      public java.lang.String tools() {
        return "GCGCW0WDGT";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAVElEQVR42mO4/+nHfxB+9ek/BobJMdTMOP7/5qMPWBWBxEHyYEXztlzHqggkDlYEAthMg5sCA9hMQzEFWSHMNAxTsJmG1RR003AqQDYNryKYQnQxABRnx++6FJdrAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAOklEQVR42mNgwANqZhz/D8L3P/34j1fBvC3X/9989AFTIbqCV5/+wzFBBXCFhBSQbiJJbiTZ1/jCEQBrQsfv1FZtNAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAJCAYAAAALpr0TAAAAPElEQVR42mO4/+nH/5oZx8GYAR8AKbz56MP/eVuu49fw6tP//zCMVwOyQrwasCnEpoE8E/G6kWhfExuOAKRxx+8lO1+5AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAKCAYAAABmBXS+AAAAUElEQVR42mNgQAM1M47/Z8AHQArmbbn+H69CkOTNRx9wK4KZ8urTf9ymwUwBKcJqGrIpMIxhGrIpMIxiGjZTMEzDZgqGafc//fgPwtgUweQAw0vH75rkqhIAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = GWT.getModuleBaseForStaticFiles() + "D4A6540E96842E03327A041C241D2B63.cache.png";
  private static com.google.gwt.resources.client.ImageResource anchorBottom;
  private static com.google.gwt.resources.client.ImageResource anchorLeft;
  private static com.google.gwt.resources.client.ImageResource anchorRight;
  private static com.google.gwt.resources.client.ImageResource anchorTop;
  private static com.google.gwt.resources.client.ImageResource errorIcon;
  private static com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      anchorBottom(), 
      anchorLeft(), 
      anchorRight(), 
      anchorTop(), 
      errorIcon(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("anchorBottom", anchorBottom());
        resourceMap.put("anchorLeft", anchorLeft());
        resourceMap.put("anchorRight", anchorRight());
        resourceMap.put("anchorTop", anchorTop());
        resourceMap.put("errorIcon", errorIcon());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'anchorBottom': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorBottom()();
      case 'anchorLeft': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorLeft()();
      case 'anchorRight': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorRight()();
      case 'anchorTop': return this.@com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipResources::anchorTop()();
      case 'errorIcon': return this.@com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipResources::errorIcon()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipResources::style()();
    }
    return null;
  }-*/;
}

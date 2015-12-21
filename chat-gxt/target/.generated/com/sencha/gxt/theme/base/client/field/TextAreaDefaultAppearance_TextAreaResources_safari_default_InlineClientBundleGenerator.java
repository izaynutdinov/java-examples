package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaResources {
  private static TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator _instance0 = new TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("input.GCGCW0WDOW,textarea.GCGCW0WDOW{border:" + ("1px"+ " " +"solid"+ " " +"#7eadd9")  + ";}input.GCGCW0WDPW,textarea.GCGCW0WDPW{height:" + ((TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getSafeUri().asString() + "\") -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getLeft() + "px -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getTop() + "px  repeat-x")  + ";background-color:" + ("#fff")  + ";background-position:" + ("bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c30")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";}.GCGCW0WDCX{position:" + ("relative")  + ";right:") + (("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("right")  + ";white-space:" + ("normal")  + ";}.GCGCW0WDMW{font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDLW{color:" + ("gray")  + ";}.GCGCW0WDBX{height:" + ((TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getSafeUri().asString() + "\") -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getLeft() + "px -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getTop() + "px  repeat-x") ) + (";height:" + ("auto")  + ";background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";vertical-align:" + ("top")  + ";}.GCGCW0WDKW{background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:") + (("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";overflow:" + ("visible")  + ";}")) : (("input.GCGCW0WDOW,textarea.GCGCW0WDOW{border:" + ("1px"+ " " +"solid"+ " " +"#7eadd9")  + ";}input.GCGCW0WDPW,textarea.GCGCW0WDPW{height:" + ((TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getSafeUri().asString() + "\") -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getLeft() + "px -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.invalidLine()).getTop() + "px  repeat-x")  + ";background-color:" + ("#fff")  + ";background-position:" + ("bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c30")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";}.GCGCW0WDCX{position:" + ("relative")  + ";left:") + (("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("left")  + ";white-space:" + ("normal")  + ";}.GCGCW0WDMW{font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDLW{color:" + ("gray")  + ";}.GCGCW0WDBX{height:" + ((TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getSafeUri().asString() + "\") -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getLeft() + "px -" + (TextAreaDefaultAppearance_TextAreaResources_safari_default_InlineClientBundleGenerator.this.textBackground()).getTop() + "px  repeat-x") ) + (";height:" + ("auto")  + ";background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";vertical-align:" + ("top")  + ";}.GCGCW0WDKW{background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:") + (("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";overflow:" + ("visible")  + ";}"));
      }
      public java.lang.String area() {
        return "GCGCW0WDKW";
      }
      public java.lang.String empty() {
        return "GCGCW0WDLW";
      }
      public java.lang.String field() {
        return "GCGCW0WDMW";
      }
      public java.lang.String file() {
        return "GCGCW0WDNW";
      }
      public java.lang.String focus() {
        return "GCGCW0WDOW";
      }
      public java.lang.String invalid() {
        return "GCGCW0WDPW";
      }
      public java.lang.String readonly() {
        return "GCGCW0WDAX";
      }
      public java.lang.String text() {
        return "GCGCW0WDBX";
      }
      public java.lang.String wrap() {
        return "GCGCW0WDCX";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaStyle css() {
    return cssInitializer.get();
  }
  private void invalidLineInitializer() {
    invalidLine = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "invalidLine",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 4, 3, false, false
    );
  }
  private static class invalidLineInitializer {
    static {
      _instance0.invalidLineInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return invalidLine;
    }
  }
  public com.google.gwt.resources.client.ImageResource invalidLine() {
    return invalidLineInitializer.get();
  }
  private void textBackgroundInitializer() {
    textBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "textBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 1, 18, false, false
    );
  }
  private static class textBackgroundInitializer {
    static {
      _instance0.textBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return textBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource textBackground() {
    return textBackgroundInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaStyle css;
  private static final java.lang.String externalImage = GWT.getModuleBaseForStaticFiles() + "2659A66C9CEC1586DA091ACEC4A3AE6B.cache.png";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAASCAYAAACaV7S8AAAANElEQVR42pXEuQnAQAwAwe2/SCcGxwYhhLhn7RZuguG6H3kjJDIlq6S6pceQOZesvcXfUR9VjEbUejI8wwAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource invalidLine;
  private static com.google.gwt.resources.client.ImageResource textBackground;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      invalidLine(), 
      textBackground(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("invalidLine", invalidLine());
        resourceMap.put("textBackground", textBackground());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaResources::css()();
      case 'invalidLine': return this.@com.sencha.gxt.theme.base.client.field.ValueBaseFieldDefaultAppearance.ValueBaseFieldResources::invalidLine()();
      case 'textBackground': return this.@com.sencha.gxt.theme.base.client.field.TextAreaDefaultAppearance.TextAreaResources::textBackground()();
    }
    return null;
  }-*/;
}

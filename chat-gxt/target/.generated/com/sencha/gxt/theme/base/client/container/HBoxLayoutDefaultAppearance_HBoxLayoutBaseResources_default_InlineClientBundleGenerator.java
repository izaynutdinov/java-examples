package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HBoxLayoutDefaultAppearance_HBoxLayoutBaseResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutBaseResources {
  private static HBoxLayoutDefaultAppearance_HBoxLayoutBaseResources_default_InlineClientBundleGenerator _instance0 = new HBoxLayoutDefaultAppearance_HBoxLayoutBaseResources_default_InlineClientBundleGenerator();
  private void moreIconInitializer() {
    moreIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "moreIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 12, 16, false, false
    );
  }
  private static class moreIconInitializer {
    static {
      _instance0.moreIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return moreIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource moreIcon() {
    return moreIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDMP{overflow:" + ("hidden")  + ";}.GCGCW0WDNP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}")) : ((".GCGCW0WDMP{overflow:" + ("hidden")  + ";}.GCGCW0WDNP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}"));
      }
      public java.lang.String container() {
        return "GCGCW0WDMP";
      }
      public java.lang.String inner() {
        return "GCGCW0WDNP";
      }
      public java.lang.String moreIcon() {
        return "GCGCW0WDOP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAQCAYAAAAiYZ4HAAAAHElEQVR42mNgGAUkAFGn7v8gjIs/QJpop3ikAQD36yWVz45n1AAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource moreIcon;
  private static com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      moreIcon(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("moreIcon", moreIcon());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'moreIcon': return this.@com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutBaseResources::moreIcon()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutBaseResources::style()();
    }
    return null;
  }-*/;
}

package com.sencha.gxt.theme.blue.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarResources {
  private static BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator _instance0 = new BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 56, false, false
    );
  }
  private static class backgroundInitializer {
    static {
      _instance0.backgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return background;
    }
  }
  public com.google.gwt.resources.client.ImageResource background() {
    return backgroundInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDO3B{border-style:" + ("solid")  + ";border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";display:" + ("block")  + ";background:" + ("repeat-x"+ " " +"top"+ " " +"right")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";overflow:" + ("hidden")  + ";width:" + ("auto")  + ";height:") + (("auto")  + ";border:" + ("none")  + ";}.x-toolbar-mark{border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#99b9e9")  + ";height:" + ((BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";background-color:" + ("#d0def0")  + ";height:" + ("auto")  + ";}")) : ((".GCGCW0WDO3B{border-style:" + ("solid")  + ";border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";display:" + ("block")  + ";background:" + ("repeat-x"+ " " +"top"+ " " +"left")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";overflow:" + ("hidden")  + ";width:" + ("auto")  + ";height:") + (("auto")  + ";border:" + ("none")  + ";}.x-toolbar-mark{border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#99b9e9")  + ";height:" + ((BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (BlueToolBarAppearance_BlueToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";background-color:" + ("#d0def0")  + ";height:" + ("auto")  + ";}"));
      }
      public java.lang.String moreButton() {
        return "GCGCW0WDN3B";
      }
      public java.lang.String toolBar() {
        return "GCGCW0WDO3B";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAA4CAYAAADXVynvAAAArElEQVR42o3QuRKCQBCE4Xn/N/OCBQ8EZRWvjBsTk3bagMEyMfi6/mhrQJrnCyTZYwBZpPcBpNGDZH/rQZLoJF+xu/YgjQ5ksb10IItN0YFkXbQgi/jcgqbRgCQ6NSAL5xuQRehrkAR5DbJYHWvQNCqQLA8VyGKhQzLPKpBGCZJZWoIsxnd+I8grkARew3+HHsZTx5tD/SaycDruE/oDSFyhUUwj0iGJdeI/4w2HI5Y2f7R+rgAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("background", background());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarResources::background()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.toolbar.BlueToolBarAppearance.BlueToolBarResources::style()();
    }
    return null;
  }-*/;
}

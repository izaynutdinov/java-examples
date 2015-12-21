package com.sencha.gxt.theme.blue.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources {
  private static BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator _instance0 = new BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator();
  private void itemOverInitializer() {
    itemOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 21, false, false
    );
  }
  private static class itemOverInitializer {
    static {
      _instance0.itemOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemOver() {
    return itemOverInitializer.get();
  }
  private void menuInitializer() {
    menu = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menu",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 250, 1, false, false
    );
  }
  private static class menuInitializer {
    static {
      _instance0.menuInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menu;
    }
  }
  public com.google.gwt.resources.client.ImageResource menu() {
    return menuInitializer.get();
  }
  private void miniBottomInitializer() {
    miniBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "miniBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 35, 5, false, false
    );
  }
  private static class miniBottomInitializer {
    static {
      _instance0.miniBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return miniBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource miniBottom() {
    return miniBottomInitializer.get();
  }
  private void miniTopInitializer() {
    miniTop = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "miniTop",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 35, 5, false, false
    );
  }
  private static class miniTopInitializer {
    static {
      _instance0.miniTopInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return miniTop;
    }
  }
  public com.google.gwt.resources.client.ImageResource miniTop() {
    return miniTopInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDBSB{border:" + ("1px"+ " " +"solid")  + ";z-index:" + ("15000")  + ";zoom:" + ("1")  + ";background:" + ("repeat-y")  + ";outline:" + ("0"+ " " +"none")  + ";}.GCGCW0WDBSB a{text-decoration:" + ("none")  + " !important;}.GCGCW0WDCSB{padding:" + ("2px")  + ";background:" + ("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:") + (("hidden")  + ";}.GCGCW0WDASB{padding:" + ("0")  + " !important;}.GCGCW0WDASB .GCGCW0WDCSB{padding:" + ("0")  + ";}.GCGCW0WDBSB .GCGCW0WDFSB{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";background-repeat:" + ("no-repeat")  + ";height:" + ("8px")  + ";line-height:" + ("8px")  + ";cursor:" + ("pointer")  + ";padding:" + ("0") ) + (";}.GCGCW0WDBSB .GCGCW0WDGSB{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}.GCGCW0WDDSB{padding-right:" + ("27px")  + " !important;}.GCGCW0WDJSB{background-image:" + ("none")  + ";}.GCGCW0WDBSB{width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getTop() + "px  repeat-y")  + ";width:" + ("auto")  + ";border-color:" + ("#718bb7")  + ";background-color:" + ("#f0f0f0")  + ";}.GCGCW0WDKSB{background-color:") + (("#fff")  + " !important;}.GCGCW0WDISB{height:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GCGCW0WDHSB{height:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GCGCW0WDFSB{border-width:" + ("1px"+ " " +"0")  + ";}")) : ((".GCGCW0WDBSB{border:" + ("1px"+ " " +"solid")  + ";z-index:" + ("15000")  + ";zoom:" + ("1")  + ";background:" + ("repeat-y")  + ";outline:" + ("0"+ " " +"none")  + ";}.GCGCW0WDBSB a{text-decoration:" + ("none")  + " !important;}.GCGCW0WDCSB{padding:" + ("2px")  + ";background:" + ("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:") + (("hidden")  + ";}.GCGCW0WDASB{padding:" + ("0")  + " !important;}.GCGCW0WDASB .GCGCW0WDCSB{padding:" + ("0")  + ";}.GCGCW0WDBSB .GCGCW0WDFSB{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";background-repeat:" + ("no-repeat")  + ";height:" + ("8px")  + ";line-height:" + ("8px")  + ";cursor:" + ("pointer")  + ";padding:" + ("0") ) + (";}.GCGCW0WDBSB .GCGCW0WDGSB{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}.GCGCW0WDDSB{padding-left:" + ("27px")  + " !important;}.GCGCW0WDJSB{background-image:" + ("none")  + ";}.GCGCW0WDBSB{width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.menu()).getTop() + "px  repeat-y")  + ";width:" + ("auto")  + ";border-color:" + ("#718bb7")  + ";background-color:" + ("#f0f0f0")  + ";}.GCGCW0WDKSB{background-color:") + (("#fff")  + " !important;}.GCGCW0WDISB{height:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GCGCW0WDHSB{height:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (BlueMenuAppearance_BlueMenuResources_ie9_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GCGCW0WDFSB{border-width:" + ("1px"+ " " +"0")  + ";}"));
      }
      public java.lang.String dateMenu() {
        return "GCGCW0WDASB";
      }
      public java.lang.String menu() {
        return "GCGCW0WDBSB";
      }
      public java.lang.String menuList() {
        return "GCGCW0WDCSB";
      }
      public java.lang.String menuListItemIndent() {
        return "GCGCW0WDDSB";
      }
      public java.lang.String menuRadioGroup() {
        return "GCGCW0WDESB";
      }
      public java.lang.String menuScroller() {
        return "GCGCW0WDFSB";
      }
      public java.lang.String menuScrollerActive() {
        return "GCGCW0WDGSB";
      }
      public java.lang.String menuScrollerBottom() {
        return "GCGCW0WDHSB";
      }
      public java.lang.String menuScrollerTop() {
        return "GCGCW0WDISB";
      }
      public java.lang.String noSeparator() {
        return "GCGCW0WDJSB";
      }
      public java.lang.String plain() {
        return "GCGCW0WDKSB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAVCAYAAABsZT8HAAAAGklEQVR42mN4/fnvfxBmoJBx88Xv/yBMTwYA+d2en2a9xcEAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAPoAAAABCAYAAAD3ubPnAAAAHklEQVR42mP48OHDf1riR48f/wcBWtszikfxKMaNAfI0uFl52k+EAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACMAAAAFCAYAAADPLFVyAAAANklEQVR42mO4ePHi/8GCGUAAxHjz5g3J2NnZFQOTYw7cITBADQdRxSHUcBBVHYLsILqmESQAACG6H+sTbbGtAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACMAAAAFCAYAAADPLFVyAAAANUlEQVR42mNgQAMXL178Ty/MgA+AFLx584Zk7OzsSpY+nA6ixCEwTBUHUcMhVHEQPdMIIQwAgl8f6zRdECkAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource itemOver;
  private static com.google.gwt.resources.client.ImageResource menu;
  private static com.google.gwt.resources.client.ImageResource miniBottom;
  private static com.google.gwt.resources.client.ImageResource miniTop;
  private static com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      itemOver(), 
      menu(), 
      miniBottom(), 
      miniTop(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("itemOver", itemOver());
        resourceMap.put("menu", menu());
        resourceMap.put("miniBottom", miniBottom());
        resourceMap.put("miniTop", miniTop());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'itemOver': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources::itemOver()();
      case 'menu': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources::menu()();
      case 'miniBottom': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources::miniBottom()();
      case 'miniTop': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources::miniTop()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.menu.BlueMenuAppearance.BlueMenuResources::style()();
    }
    return null;
  }-*/;
}

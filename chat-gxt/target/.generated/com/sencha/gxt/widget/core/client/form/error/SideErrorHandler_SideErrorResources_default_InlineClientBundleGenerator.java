package com.sencha.gxt.widget.core.client.form.error;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SideErrorHandler_SideErrorResources_default_InlineClientBundleGenerator implements com.sencha.gxt.widget.core.client.form.error.SideErrorHandler.SideErrorResources {
  private static SideErrorHandler_SideErrorResources_default_InlineClientBundleGenerator _instance0 = new SideErrorHandler_SideErrorResources_default_InlineClientBundleGenerator();
  private void errorIconInitializer() {
    errorIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "errorIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACEElEQVR42rWTy08TURTG+ZuMcaULNrqwPoIgVjrpA7CClTYiSKQV2o7QUWmg0lQ0pi2PWhITfICJiY/ERt0QIlETXUAstZS209phpnYcYz5mbjIzkhDChi85u/v7vnPOvbeubj/0L7UAadyN2pADVboT1eA1iG+eYk+wJB8u+7sgJEIQ52Ok+MQY8p6LKHk7djcRhy6Di9D4+3oW4tQt/GYukRInGUivkmBDA8heMe5sUrvTg0rET+Cqr5WUKv6GFbzbgj8vEyiM9CN91bTdRHr7DKzXocNeG4RBm2bAXTej0mfGr14K4sIMVlwUinOTugk/0kvmFOMBAqqJqhSw3G0C62oBd9cH9h6Db67/Rin3WyG+iEOg7QRUE1UpYLHrPAoOI/JOM7jkA3wy1usGBTmh9jyGzcF2rVUlUfr+mRgo4EbHOeTszcg5KHAzE1hsOqwb5H2dqESDECZorVUlkXs4Cn4uQcD19rPI2ppQZDzIjd3EUttJ3aAyn8SPbovcxbTWqpKoSgEz1kasmc9gczaKZetppKcj229iVV7KeqAP1SdTWmIpxMh3HyBgmmog8IrHiQ/N9Tu/ha+WY8jQPRAex8HeHsBPuwmZCy0oDHvkxcmw24l3xw/s/hqXWw340taA3Ki8j1gYpWgY2aAfS5QBqcYje/sPmUf3sWgz4P2pQ0idOIiP1FGsxsPYl5+7Bfc5zQa8V7vnAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource errorIcon;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      errorIcon(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("errorIcon", errorIcon());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'errorIcon': return this.@com.sencha.gxt.widget.core.client.form.error.SideErrorHandler.SideErrorResources::errorIcon()();
    }
    return null;
  }-*/;
}

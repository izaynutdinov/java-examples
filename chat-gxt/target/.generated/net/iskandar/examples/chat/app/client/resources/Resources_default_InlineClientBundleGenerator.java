package net.iskandar.examples.chat.app.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_InlineClientBundleGenerator implements net.iskandar.examples.chat.app.client.resources.Resources {
  private static Resources_default_InlineClientBundleGenerator _instance0 = new Resources_default_InlineClientBundleGenerator();
  private void chatIconInitializer() {
    chatIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "chatIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class chatIconInitializer {
    static {
      _instance0.chatIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return chatIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource chatIcon() {
    return chatIconInitializer.get();
  }
  private void folderIconInitializer() {
    folderIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "folderIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class folderIconInitializer {
    static {
      _instance0.folderIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return folderIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource folderIcon() {
    return folderIconInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACWElEQVR42r1TWU8TYRStT0bjqwmvGv6CD/4BE6NVgbDYSqq0Ql2AEi1ERUCCRmNStWrdqvHFqCQ+qS9ghISlpZSW1rJ0p0Vw7IIzXaZ0pvR4Sw2KC74Yv+Tkzpz7nXO/+80dieRfL42F2dnpTOlu+rOBO0GBvxcW848WVsKGkPDA6OJKNxS3mtiXD4MCnjN5GOZXcCOUhy6chz68grvzOdwO5tDt4l/9VtxiYr0vFnN4siCiJ5BDl1/ARZ+IDkKnT0CPX8T1uRz0hFZrcnKduH4wds0YzOLpgoB2r4CzbgEtswI0bpFAz+4id94j4kpAxFUyrB+IXFgzaBrhcs+o+iUSN89kcWp6GSdcy1D/gJNTGTQR3+bJ4rIvi0ZTgl8V7+39tL3dnoQhlIVmJkPCDOqd/CoavsUiirlmMurwLEM7kUTlQGSbZFdvpKRg0O3N4PQUD/WHn4XfUcgVDM7N8tBYOJTqvZuLLYyyaJvhoXKkUG1LodKWpJjGYXsaMjuPGnqvIb4QVY40zlAh5WAMa3dQ28881rr4fIMjCdlECmXjCUjHOEjNHA6MJXBonEMFcTI6tpqKtDipwJuoYd2XUA5Fo43OFI7QpjIS7Dez2Gf6goNkUDCstnKoo1abHMm8/F2M+WUOtJZgiWo4/lFpY1FNBmUWFuXUZxXFWhIfn0xATTl5f2R6t25+yx+n8dhQVFTZOBydYFdRZyWYl6AYilnL3zKyDUdZ8Xpxj3wkDiUJ5cNxVPV9vk/0pr/+QFKrdWvNe8ZYNRCFYnTJVtHH3Krsndsh+R/rK2vV723MaMGyAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABO0lEQVR42mNgoAZ4vDdD+sWuCOcXOyOdYPj59gQFog14tFjzzrMlyv+R8eNF6o9Acqv+/2cG4fr9/1m+7PUs+LLPrRCGP+5yjQEbcGp+yP8r+6ah4r3T/t84MPX/jYNA+uCM/+cXOf3/t0cTiLXg+OcOjesMn7ZbJj9eY/b/+QZrnPjJeuv/f3dp//+9ExV/26p1kuHzRo3JP7Zr/ycHf96ssZfhwwbtlq+btf+Tg9+v09jI8Hq1Rv3H9dr/P5CBgXqXMDxZpl79bo32/3erScfPl2tOZ3iwSC371Sqt/69Wko4fL1HvZLg5SzH20SLV/+TghwuV6hnOTZDyuzlT9v/NGTKkYaCeS1Ok6hiOtQnYX5go8v/CBBIxUM/JHqFCBm8DFqv+OI7TvTFsR0nBfbFsJyr82QIZBhwAABTk9J1Ps5veAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource chatIcon;
  private static com.google.gwt.resources.client.ImageResource folderIcon;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      chatIcon(), 
      folderIcon(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("chatIcon", chatIcon());
        resourceMap.put("folderIcon", folderIcon());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'chatIcon': return this.@net.iskandar.examples.chat.app.client.resources.Resources::chatIcon()();
      case 'folderIcon': return this.@net.iskandar.examples.chat.app.client.resources.Resources::folderIcon()();
    }
    return null;
  }-*/;
}

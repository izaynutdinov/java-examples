package com.sencha.gxt.theme.base.client.frame;

public class Frame_FrameOptions_frameStyle_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions, com.google.gwt.safecss.shared.SafeStyles> {
  public static final Frame_FrameOptions_frameStyle_ValueProviderImpl INSTANCE = new Frame_FrameOptions_frameStyle_ValueProviderImpl();
  public com.google.gwt.safecss.shared.SafeStyles getValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object) {
    return object.getFrameStyle();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object, com.google.gwt.safecss.shared.SafeStyles value) {
    object.setFrameStyle(value);
  }
  public String getPath() {
    return "frameStyle";
  }
}

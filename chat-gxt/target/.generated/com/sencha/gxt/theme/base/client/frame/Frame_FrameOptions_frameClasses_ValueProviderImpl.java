package com.sencha.gxt.theme.base.client.frame;

public class Frame_FrameOptions_frameClasses_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions, java.lang.String> {
  public static final Frame_FrameOptions_frameClasses_ValueProviderImpl INSTANCE = new Frame_FrameOptions_frameClasses_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object) {
    return object.getFrameClasses();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object, java.lang.String value) {
    object.setFrameClasses(value);
  }
  public String getPath() {
    return "frameClasses";
  }
}

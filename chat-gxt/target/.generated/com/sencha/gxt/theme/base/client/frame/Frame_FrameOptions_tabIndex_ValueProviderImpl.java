package com.sencha.gxt.theme.base.client.frame;

public class Frame_FrameOptions_tabIndex_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions, java.lang.String> {
  public static final Frame_FrameOptions_tabIndex_ValueProviderImpl INSTANCE = new Frame_FrameOptions_tabIndex_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object) {
    return object.getTabIndex();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.Frame.FrameOptions object, java.lang.String value) {
    object.setTabIndex(value);
  }
  public String getPath() {
    return "tabIndex";
  }
}

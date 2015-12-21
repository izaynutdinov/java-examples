package com.sencha.gxt.theme.base.client.frame;

public class NestedDivFrame_NestedDivFrameStyle_bottom_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.NestedDivFrame.NestedDivFrameStyle, java.lang.String> {
  public static final NestedDivFrame_NestedDivFrameStyle_bottom_ValueProviderImpl INSTANCE = new NestedDivFrame_NestedDivFrameStyle_bottom_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.frame.NestedDivFrame.NestedDivFrameStyle object) {
    return object.bottom();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.NestedDivFrame.NestedDivFrameStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "bottom";
  }
}

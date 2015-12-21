package com.sencha.gxt.core.client.dom;

public class Mask_MaskDefaultAppearance_MaskStyle_box_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle, java.lang.String> {
  public static final Mask_MaskDefaultAppearance_MaskStyle_box_ValueProviderImpl INSTANCE = new Mask_MaskDefaultAppearance_MaskStyle_box_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle object) {
    return object.box();
  }
  public void setValue(com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "box";
  }
}

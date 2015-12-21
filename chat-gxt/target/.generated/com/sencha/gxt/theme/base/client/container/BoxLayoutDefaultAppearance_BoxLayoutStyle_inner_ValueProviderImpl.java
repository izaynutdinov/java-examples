package com.sencha.gxt.theme.base.client.container;

public class BoxLayoutDefaultAppearance_BoxLayoutStyle_inner_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle, java.lang.String> {
  public static final BoxLayoutDefaultAppearance_BoxLayoutStyle_inner_ValueProviderImpl INSTANCE = new BoxLayoutDefaultAppearance_BoxLayoutStyle_inner_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle object) {
    return object.inner();
  }
  public void setValue(com.sencha.gxt.theme.base.client.container.BoxLayoutDefaultAppearance.BoxLayoutStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "inner";
  }
}

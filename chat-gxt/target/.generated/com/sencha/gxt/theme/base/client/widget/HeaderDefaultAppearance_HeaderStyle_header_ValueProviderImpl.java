package com.sencha.gxt.theme.base.client.widget;

public class HeaderDefaultAppearance_HeaderStyle_header_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderStyle, java.lang.String> {
  public static final HeaderDefaultAppearance_HeaderStyle_header_ValueProviderImpl INSTANCE = new HeaderDefaultAppearance_HeaderStyle_header_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderStyle object) {
    return object.header();
  }
  public void setValue(com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "header";
  }
}

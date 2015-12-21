package com.sencha.gxt.theme.base.client.panel;

public class ContentPanelBaseAppearance_ContentPanelStyle_header_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance.ContentPanelStyle, java.lang.String> {
  public static final ContentPanelBaseAppearance_ContentPanelStyle_header_ValueProviderImpl INSTANCE = new ContentPanelBaseAppearance_ContentPanelStyle_header_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance.ContentPanelStyle object) {
    return object.header();
  }
  public void setValue(com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance.ContentPanelStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "header";
  }
}

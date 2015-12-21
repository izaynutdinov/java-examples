package com.sencha.gxt.theme.base.client.container;

public class ViewportDefaultAppearance_ViewportStyle_viewport_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle, java.lang.String> {
  public static final ViewportDefaultAppearance_ViewportStyle_viewport_ValueProviderImpl INSTANCE = new ViewportDefaultAppearance_ViewportStyle_viewport_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle object) {
    return object.viewport();
  }
  public void setValue(com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "viewport";
  }
}

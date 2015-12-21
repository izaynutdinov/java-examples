package com.sencha.gxt.theme.base.client.button;

public class IconButtonDefaultAppearance_IconButtonStyle_button_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle, java.lang.String> {
  public static final IconButtonDefaultAppearance_IconButtonStyle_button_ValueProviderImpl INSTANCE = new IconButtonDefaultAppearance_IconButtonStyle_button_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle object) {
    return object.button();
  }
  public void setValue(com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "button";
  }
}

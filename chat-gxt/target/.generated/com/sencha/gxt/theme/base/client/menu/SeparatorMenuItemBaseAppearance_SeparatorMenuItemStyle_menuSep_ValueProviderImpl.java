package com.sencha.gxt.theme.base.client.menu;

public class SeparatorMenuItemBaseAppearance_SeparatorMenuItemStyle_menuSep_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance.SeparatorMenuItemStyle, java.lang.String> {
  public static final SeparatorMenuItemBaseAppearance_SeparatorMenuItemStyle_menuSep_ValueProviderImpl INSTANCE = new SeparatorMenuItemBaseAppearance_SeparatorMenuItemStyle_menuSep_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance.SeparatorMenuItemStyle object) {
    return object.menuSep();
  }
  public void setValue(com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance.SeparatorMenuItemStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "menuSep";
  }
}

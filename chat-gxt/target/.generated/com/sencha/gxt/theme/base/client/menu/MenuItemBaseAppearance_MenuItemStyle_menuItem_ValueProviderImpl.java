package com.sencha.gxt.theme.base.client.menu;

public class MenuItemBaseAppearance_MenuItemStyle_menuItem_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance.MenuItemStyle, java.lang.String> {
  public static final MenuItemBaseAppearance_MenuItemStyle_menuItem_ValueProviderImpl INSTANCE = new MenuItemBaseAppearance_MenuItemStyle_menuItem_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance.MenuItemStyle object) {
    return object.menuItem();
  }
  public void setValue(com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance.MenuItemStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "menuItem";
  }
}

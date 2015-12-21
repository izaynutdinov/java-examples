package com.sencha.gxt.theme.base.client.menu;

public class MenuBaseAppearance_MenuStyle_menu_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance.MenuStyle, java.lang.String> {
  public static final MenuBaseAppearance_MenuStyle_menu_ValueProviderImpl INSTANCE = new MenuBaseAppearance_MenuStyle_menu_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance.MenuStyle object) {
    return object.menu();
  }
  public void setValue(com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance.MenuStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "menu";
  }
}

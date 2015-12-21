package com.sencha.gxt.theme.base.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class MenuItemBaseAppearance_MenuItemTemplateImpl implements com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance.MenuItemTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance.MenuItemStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><span class="{1}" unselectable="on"></span></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemStyle_menuListItem_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemStyle_menuItem_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemTemplate_template_SafeHtml__MenuItemStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemTemplate_template_SafeHtml__MenuItemStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemStyle_menuListItem_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance_MenuItemStyle_menuItem_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

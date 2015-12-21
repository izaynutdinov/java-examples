package com.sencha.gxt.theme.base.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class MenuBaseAppearance_BaseMenuTemplateImpl implements com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance.BaseMenuTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance.MenuStyle style, java.lang.String ignoreClass){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0} {1}" tabindex="0" hideFocus="true"><div class="{2}"></div></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_MenuStyle_menu_ValueProviderImpl.INSTANCE.getValue(style), ignoreClass, com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_MenuStyle_menuList_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_BaseMenuTemplate_template_SafeHtml__MenuStyle_style__String_ignoreClass___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_BaseMenuTemplate_template_SafeHtml__MenuStyle_style__String_ignoreClass___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_MenuStyle_menu_ValueProviderImpl.INSTANCE.getValue(style), ignoreClass, com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance_MenuStyle_menuList_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

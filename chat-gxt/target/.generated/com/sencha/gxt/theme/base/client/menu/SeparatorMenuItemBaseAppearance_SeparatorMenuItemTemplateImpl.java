package com.sencha.gxt.theme.base.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class SeparatorMenuItemBaseAppearance_SeparatorMenuItemTemplateImpl implements com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance.SeparatorMenuItemTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance.SeparatorMenuItemStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <span class="{0}">&#160;</span>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance_SeparatorMenuItemStyle_menuSep_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance_SeparatorMenuItemTemplate_template_SafeHtml__SeparatorMenuItemStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance_SeparatorMenuItemTemplate_template_SafeHtml__SeparatorMenuItemStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance_SeparatorMenuItemStyle_menuSep_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

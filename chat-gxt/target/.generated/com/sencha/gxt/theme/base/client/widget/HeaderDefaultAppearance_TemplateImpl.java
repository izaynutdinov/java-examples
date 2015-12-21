package com.sencha.gxt.theme.base.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class HeaderDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"></div><div class="{2}"></div><div class="{3}">text</div></div>
     * params:
       * com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerBar_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerText_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_Template_render_SafeHtml__HeaderStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_Template_render_SafeHtml__HeaderStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerBar_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance_HeaderStyle_headerText_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

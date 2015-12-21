package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class ViewportDefaultAppearance_ViewportTemplateImpl implements com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance.ViewportStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div>
     * params:
       * com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance_ViewportStyle_viewport_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance_ViewportTemplate_template_SafeHtml__ViewportStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance_ViewportTemplate_template_SafeHtml__ViewportStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.container.ViewportDefaultAppearance_ViewportStyle_viewport_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

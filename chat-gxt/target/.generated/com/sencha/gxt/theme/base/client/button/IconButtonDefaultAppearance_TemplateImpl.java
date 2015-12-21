package com.sencha.gxt.theme.base.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class IconButtonDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance.IconButtonStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div>
     * params:
       * com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance_IconButtonStyle_button_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance_Template_render_SafeHtml__IconButtonStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance_Template_render_SafeHtml__IconButtonStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.button.IconButtonDefaultAppearance_IconButtonStyle_button_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

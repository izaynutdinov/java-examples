package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class ErrorTipDefaultAppearance_ErrorTipTemplateImpl implements com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div><div><span class="{1}"></span></div><div class="{2}"><span class="{3}"></span></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_textWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_text_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipTemplate_render_SafeHtml__ErrorTipStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipTemplate_render_SafeHtml__ErrorTipStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_textWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance_ErrorTipStyle_text_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

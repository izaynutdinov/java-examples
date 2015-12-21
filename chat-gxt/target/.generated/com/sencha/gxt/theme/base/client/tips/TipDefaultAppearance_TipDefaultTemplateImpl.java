package com.sencha.gxt.theme.base.client.tips;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class TipDefaultAppearance_TipDefaultTemplateImpl implements com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipDefaultTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"></div><div><span class="{2}"></span></div><div><span class="{3}"></span></div></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_tip_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_text_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipDefaultTemplate_render_SafeHtml__TipStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipDefaultTemplate_render_SafeHtml__TipStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_tip_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_tools_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_heading_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance_TipStyle_text_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}

package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class Mask_MessageTemplatesImpl implements com.sencha.gxt.core.client.dom.Mask.MessageTemplates {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.core.client.dom.Mask.MaskDefaultAppearance.MaskStyle style, java.lang.String message){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}">{2}</div></div>
     * params:
       * com.sencha.gxt.core.client.dom.Mask_MaskDefaultAppearance_MaskStyle_box_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.core.client.dom.Mask_MaskDefaultAppearance_MaskStyle_text_ValueProviderImpl.INSTANCE.getValue(style), message
     */
    outer = GWT.<com.sencha.gxt.core.client.dom.Mask_MessageTemplates_template_SafeHtml__MaskStyle_style__String_message___SafeHtmlTemplates>create(com.sencha.gxt.core.client.dom.Mask_MessageTemplates_template_SafeHtml__MaskStyle_style__String_message___SafeHtmlTemplates.class).template0(com.sencha.gxt.core.client.dom.Mask_MaskDefaultAppearance_MaskStyle_box_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.core.client.dom.Mask_MaskDefaultAppearance_MaskStyle_text_ValueProviderImpl.INSTANCE.getValue(style), message);
    return outer;
  }
}

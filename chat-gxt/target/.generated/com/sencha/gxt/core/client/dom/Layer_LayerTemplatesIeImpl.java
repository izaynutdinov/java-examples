package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class Layer_LayerTemplatesIeImpl implements com.sencha.gxt.core.client.dom.Layer.LayerTemplatesIe {
  public com.google.gwt.safehtml.shared.SafeHtml shadow(com.sencha.gxt.core.client.dom.Layer.LayerStyleIe style, java.lang.String ignoreClass){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0} {1}"></div>
     * params:
       * com.sencha.gxt.core.client.dom.Layer_LayerStyleIe_shadow_ValueProviderImpl.INSTANCE.getValue(style), ignoreClass
     */
    outer = GWT.<com.sencha.gxt.core.client.dom.Layer_LayerTemplatesIe_shadow_SafeHtml__LayerStyleIe_style__String_ignoreClass___SafeHtmlTemplates>create(com.sencha.gxt.core.client.dom.Layer_LayerTemplatesIe_shadow_SafeHtml__LayerStyleIe_style__String_ignoreClass___SafeHtmlTemplates.class).shadow0(com.sencha.gxt.core.client.dom.Layer_LayerStyleIe_shadow_ValueProviderImpl.INSTANCE.getValue(style), ignoreClass);
    return outer;
  }
}

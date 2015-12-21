package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class Layer_ShimTemplatesImpl implements com.sencha.gxt.core.client.dom.Layer.ShimTemplates {
  public com.google.gwt.safehtml.shared.SafeHtml template(java.lang.String shimClass, java.lang.String ignoreClass){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <iframe frameborder="no" frameBorder="no" class="{0} {1}" tabIndex="-1" style="visibility:hidden;display:none" role="presentation"></iframe>
     * params:
       * shimClass, ignoreClass
     */
    outer = GWT.<com.sencha.gxt.core.client.dom.Layer_ShimTemplates_template_SafeHtml__String_shimClass__String_ignoreClass___SafeHtmlTemplates>create(com.sencha.gxt.core.client.dom.Layer_ShimTemplates_template_SafeHtml__String_shimClass__String_ignoreClass___SafeHtmlTemplates.class).template0(shimClass, ignoreClass);
    return outer;
  }
}

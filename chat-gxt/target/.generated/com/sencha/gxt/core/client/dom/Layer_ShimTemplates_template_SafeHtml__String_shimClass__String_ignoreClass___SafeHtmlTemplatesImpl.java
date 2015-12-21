package com.sencha.gxt.core.client.dom;

public class Layer_ShimTemplates_template_SafeHtml__String_shimClass__String_ignoreClass___SafeHtmlTemplatesImpl implements com.sencha.gxt.core.client.dom.Layer_ShimTemplates_template_SafeHtml__String_shimClass__String_ignoreClass___SafeHtmlTemplates {
  
  public com.google.gwt.safehtml.shared.SafeHtml template0(java.lang.String arg0,java.lang.String arg1) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<iframe frameborder=\"no\" frameBorder=\"no\" class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append(" ");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("\" tabIndex=\"-1\" style=\"visibility:hidden;display:none\" role=\"presentation\"></iframe>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}

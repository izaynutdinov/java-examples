package com.sencha.gxt.theme.base.client.button;

public class ButtonCellDefaultAppearance_ButtonCellTemplates_textWithStyles_SafeHtml__String_textClass__SafeStyles_textStyles__SafeHtml_text___SafeHtmlTemplatesImpl implements com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance_ButtonCellTemplates_textWithStyles_SafeHtml__String_textClass__SafeStyles_textStyles__SafeHtml_text___SafeHtmlTemplates {
  
  public com.google.gwt.safehtml.shared.SafeHtml textWithStyles0(com.google.gwt.safecss.shared.SafeStyles arg0,java.lang.String arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<td valign=middle style=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
    sb.append("\"><div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("\" >");
    sb.append(arg2.asString());
    sb.append("</div></td>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}

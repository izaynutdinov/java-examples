package com.sencha.gxt.theme.base.client.field;

public class ErrorTipDefaultAppearance_ErrorTipStyle_textWrap_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle, java.lang.String> {
  public static final ErrorTipDefaultAppearance_ErrorTipStyle_textWrap_ValueProviderImpl INSTANCE = new ErrorTipDefaultAppearance_ErrorTipStyle_textWrap_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle object) {
    return object.textWrap();
  }
  public void setValue(com.sencha.gxt.theme.base.client.field.ErrorTipDefaultAppearance.ErrorTipStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "textWrap";
  }
}

package com.sencha.gxt.theme.base.client.tips;

public class TipDefaultAppearance_TipStyle_tip_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipStyle, java.lang.String> {
  public static final TipDefaultAppearance_TipStyle_tip_ValueProviderImpl INSTANCE = new TipDefaultAppearance_TipStyle_tip_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipStyle object) {
    return object.tip();
  }
  public void setValue(com.sencha.gxt.theme.base.client.tips.TipDefaultAppearance.TipStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "tip";
  }
}

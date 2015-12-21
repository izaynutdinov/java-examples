package com.sencha.gxt.core.client.dom;

public class Layer_LayerStyle_topRight_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.core.client.dom.Layer.LayerStyle, java.lang.String> {
  public static final Layer_LayerStyle_topRight_ValueProviderImpl INSTANCE = new Layer_LayerStyle_topRight_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.core.client.dom.Layer.LayerStyle object) {
    return object.topRight();
  }
  public void setValue(com.sencha.gxt.core.client.dom.Layer.LayerStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "topRight";
  }
}

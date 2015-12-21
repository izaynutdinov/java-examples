package com.sencha.gxt.theme.blue.client.tree;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueTreeAppearance_BlueTreeResources_chrome_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.tree.BlueTreeAppearance.BlueTreeResources {
  private static BlueTreeAppearance_BlueTreeResources_chrome_default_InlineClientBundleGenerator _instance0 = new BlueTreeAppearance_BlueTreeResources_chrome_default_InlineClientBundleGenerator();
  private void checkedInitializer() {
    checked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "checked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class checkedInitializer {
    static {
      _instance0.checkedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return checked;
    }
  }
  public com.google.gwt.resources.client.ImageResource checked() {
    return checkedInitializer.get();
  }
  private void folderClosedInitializer() {
    folderClosed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "folderClosed",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class folderClosedInitializer {
    static {
      _instance0.folderClosedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return folderClosed;
    }
  }
  public com.google.gwt.resources.client.ImageResource folderClosed() {
    return folderClosedInitializer.get();
  }
  private void folderOpenedInitializer() {
    folderOpened = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "folderOpened",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 16, 16, false, false
    );
  }
  private static class folderOpenedInitializer {
    static {
      _instance0.folderOpenedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return folderOpened;
    }
  }
  public com.google.gwt.resources.client.ImageResource folderOpened() {
    return folderOpenedInitializer.get();
  }
  private void jointCollapsedIconInitializer() {
    jointCollapsedIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "jointCollapsedIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 16, 16, false, false
    );
  }
  private static class jointCollapsedIconInitializer {
    static {
      _instance0.jointCollapsedIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return jointCollapsedIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource jointCollapsedIcon() {
    return jointCollapsedIconInitializer.get();
  }
  private void jointExpandedIconInitializer() {
    jointExpandedIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "jointExpandedIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class jointExpandedIconInitializer {
    static {
      _instance0.jointExpandedIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return jointExpandedIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource jointExpandedIcon() {
    return jointExpandedIconInitializer.get();
  }
  private void loadingIconInitializer() {
    loadingIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "loadingIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 16, 16, true, false
    );
  }
  private static class loadingIconInitializer {
    static {
      _instance0.loadingIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return loadingIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource loadingIcon() {
    return loadingIconInitializer.get();
  }
  private void partialCheckedInitializer() {
    partialChecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "partialChecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 16, 16, false, false
    );
  }
  private static class partialCheckedInitializer {
    static {
      _instance0.partialCheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return partialChecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource partialChecked() {
    return partialCheckedInitializer.get();
  }
  private void uncheckedInitializer() {
    unchecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "unchecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 16, 16, false, false
    );
  }
  private static class uncheckedInitializer {
    static {
      _instance0.uncheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return unchecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource unchecked() {
    return uncheckedInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeBaseStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDLLB{cursor:" + ("default")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";position:" + ("relative")  + ";padding-bottom:" + ("1px")  + ";}.GCGCW0WDHLB{cursor:" + ("default")  + ";}.GCGCW0WDELB{white-space:" + ("nowrap")  + ";height:" + ("21px")  + ";}.GCGCW0WDBLB{display:" + ("none")  + ";}.GCGCW0WDKLB{white-space:") + (("nowrap")  + ";line-height:" + ("11px")  + ";text-decoration:" + ("none")  + ";padding:" + ("0"+ " " +"3px"+ " " +"0"+ " " +"0")  + ";display:" + ("inline-block")  + ";vertical-align:" + ("top")  + ";margin-top:" + ("3px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";color:" + ("black")  + ";}.GCGCW0WDCLB{background-image:" + ("none")  + " !important;background-color:" + ("#defadc") ) + (" !important;}.GCGCW0WDILB{background-color:" + ("#eee")  + ";}.GCGCW0WDDLB{background-color:" + ("#defadc")  + ";}.GCGCW0WDJLB{background-color:" + ("#d9e8fb")  + " !important;}")) : ((".GCGCW0WDLLB{cursor:" + ("default")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";position:" + ("relative")  + ";padding-bottom:" + ("1px")  + ";}.GCGCW0WDHLB{cursor:" + ("default")  + ";}.GCGCW0WDELB{white-space:" + ("nowrap")  + ";height:" + ("21px")  + ";}.GCGCW0WDBLB{display:" + ("none")  + ";}.GCGCW0WDKLB{white-space:") + (("nowrap")  + ";line-height:" + ("11px")  + ";text-decoration:" + ("none")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"3px")  + ";display:" + ("inline-block")  + ";vertical-align:" + ("top")  + ";margin-top:" + ("3px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";color:" + ("black")  + ";}.GCGCW0WDCLB{background-image:" + ("none")  + " !important;background-color:" + ("#defadc") ) + (" !important;}.GCGCW0WDILB{background-color:" + ("#eee")  + ";}.GCGCW0WDDLB{background-color:" + ("#defadc")  + ";}.GCGCW0WDJLB{background-color:" + ("#d9e8fb")  + " !important;}"));
      }
      public java.lang.String check() {
        return "GCGCW0WDALB";
      }
      public java.lang.String container() {
        return "GCGCW0WDBLB";
      }
      public java.lang.String dragOver() {
        return "GCGCW0WDCLB";
      }
      public java.lang.String drop() {
        return "GCGCW0WDDLB";
      }
      public java.lang.String element() {
        return "GCGCW0WDELB";
      }
      public java.lang.String icon() {
        return "GCGCW0WDFLB";
      }
      public java.lang.String joint() {
        return "GCGCW0WDGLB";
      }
      public java.lang.String node() {
        return "GCGCW0WDHLB";
      }
      public java.lang.String over() {
        return "GCGCW0WDILB";
      }
      public java.lang.String selected() {
        return "GCGCW0WDJLB";
      }
      public java.lang.String text() {
        return "GCGCW0WDKLB";
      }
      public java.lang.String tree() {
        return "GCGCW0WDLLB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeBaseStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeBaseStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABW0lEQVR42s2Ty0sCURTG/d+KstoHUZpQBC2CCLJdyzZFRpTmwkWUCAUWtKixwiIKn4xCdygdX0ONjS96jMNMm6+ZC7nInAo3HfjgXi7nd875ONdi+Rex6nLhr2oDyLLcUaqqQtM0KIpC7x0BwSOmTdFECr7ABZxL++ALD2g2m+aAOEtaSqQ41BsvGJ72oWdkHUw4Rbv4FSCZ5lAURBycsOjVkyedfpTLTz+PQO5zKAiPIHc8Xt9k2Ga30Te6gbMrDlmeNwdcR5OIsjnsBCN66w2ELgmsNjcm5v3USEI4c0C+WMLM4h6tyN4KmFoIYHDcg+MwobPzubw5IMmmkS9J6B/bhNXupsmOuV2o2jt9LwmCOeAmEkOl9oxl7ykG7B4MObZwyKRbOyCKojkgFk8gk8nqJkpY8Yaw5jvXjVRQq9dRrdYgSRVzwKeMZTGqGsYZ56+b+S2gq7/QTXwA3ngd6xuLHCkAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACIElEQVR42r2TS0jUURSHTyVEiJuQaNemKGijtYiIQApauGtji6g2bSLKklQcUqsxS7NQc6MSWCS+skYzn1lDjFOImqE5WVk+Mt9pjTPOy/k6/6CFf4Jq44Uf9y7O7zv33HOuyGqtrgJpbckWmrKEJ1eEiiS581+AZzfEG/DO8XvVZQh/DMSxPcrY35XJvleFkuHMl0Z7jnTZ86NDfvfk3wGdt2WwuzyWPls8o91WvPO9hEIThPwTeBY6+fapVM8OHl00Aey3JEOvif2mKP8LPo8Dv8dJwNNB0FtLwFsJgSqmB9MgVM2DNBPAME/0nPO15xqAIVWbqllVD+EaCN4HfynTrrMKKqE61QR4miPM9Ft8bdcNwEuVZgyribuasVhNhQrIY6znCPhyqbhgArReE752JvqMVukTwXKRqkAz56kxGzyZsJjCx/Y4wj+SKU8yAZqvCmPOhEWjzyxrNo8F3Knw/TzMn4a5kzB9jPctscz2xnMv0QRotArDzw8sNVxWwGISzB6HqaMwmYDbdYiF3v2Mv4ghOBKHq2EnZWdMAGO63tZu9dZnKmDmMIwcZGlgL+6+3TC6Rxuz65cGKjfTlB0Z1hKmVgAeXxKcxZt8tnQFjMfA5x0wvA0+bMFVGUmjdV24KiXCbUtdX2LEZ8ZJxAqADsYpw1xrEYKvo+goWktdugRslg1vmrOic/5p3h+myAmtbb4iec1QTfpG66r80p8A/qHTUYlAfQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACKElEQVR42r2TS2hTURCGR6sLoaALF24Et10oirqxCwXRhe3KRXHhA9Ei+GyjEgx6pam3tKmPWCOID9pqYzGxmBTNw0eJRmJNWqypC/uI0TRtMJjcRJukTa75nQSEqxClmw78HC4z/3dnmHOI5isGrtJTZxPBfoHwREvoVtGdOQH6WimdTcfwO6wC4Z+Gjx1U2d9GgkdPNlcLDbj0y2UooiTAe41GBo3rMGzZgdBgI9LSEGR5ii1JVuH8xPqBR2dLAFyXiAu+I5fpRzJixtSHBgTfHEHQU4uxV/s4N8yK4OEZBcB9ZWHObViWD7wW8EJHSMXciI5pIE2ImEm0AdnbwIwBEX8tZqdNDBiFSa0A9LUuSGRT3mKbz5oLHYyzOoEcG2cNQOYikBaBlICgbw/n3qP7lALwXLfIGx03c2IShVUVCvDzMv+5hY1aYFrDY58EEkcx8baa8yYYVQqAs5lu+u5vzQKB4p4hu9ik5obqAOkw8O0AEN0NfN2FfLgGsdGDuHtCAXCIVOPUlsVyKRseNzAgY2HT3qIBkZ1AuAoIbQM+s0LbkXi3GR3H/tqCQ1xi8bRXovc8A5LtxUJ82cKmTawN/L0e8aHVCFhXwdZUjs7jFP4D0CvQIYduhWw5xwBJz6a1bKpA3LcS/q6lsIuL8z1qij+oJ3vp63p9jdyjIWRGquG/V87jlMnm0zRpUpH1ZSNV/Pe+e29s3M+zSV31FDTW0a15eaW/AHyTrKFh30vlAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAATklEQVR42uWSwQkAQQgDt3l78OtHtBRLEbSGHNuCwj3upoAhJDnnm0QEVgJVhbvPJWaG7oaIYJzgUlVgZowFl8wEEeH9BOsOViusf/AzHmlPUeJeP5BFAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAOklEQVR42mNgGAX0AXv27Pnf0dHxn2zNampqYEy25sjISNINQNZMsgHomkk2ABRgMH/DMNmBOAoIAwD6RzVNU133BgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/gif;base64,R0lGODlhEAAQALMMAKqooJGOhp2bk7e1rZ2bkre1rJCPhqqon8PBudDOxXd1bISCef///wAAAAAAAAAAACH/C05FVFNDQVBFMi4wAwEAAAAh+QQFAAAMACwAAAAAEAAQAAAET5DJyYyhmAZ7sxQEs1nMsmACGJKmSaVEOLXnK1PuBADepCiMg/DQ+/2GRI8RKOxJfpTCIJNIYArS6aRajWYZCASDa41Ow+Fx2YMWOyfpTAQAIfkEBQAADAAsAAAAABAAEAAABE6QyckEoZgKe7MEQMUxhoEd6FFdQWlOqTq15SlT9VQM3rQsjMKO5/n9hANixgjc9SQ/CgKRUSgw0ynFapVmGYkEg3v1gsPibg8tfk7CnggAIfkEBQAADAAsAAAAABAAEAAABE2QycnOoZjaA/IsRWV1goCBoMiUJTW8A0XMBPZmM4Ug3hQEjN2uZygahDyP0RBMEpmTRCKzWGCkUkq1SsFOFQrG1tr9gsPc3jnco4A9EQAh+QQFAAAMACwAAAAAEAAQAAAETpDJyUqhmFqbJ0LMIA7McWDfF5LmAVApOLUvLFMmlSTdJAiM3a73+wl5HYKSEET2lBSFIhMIYKRSimFriGIZiwWD2/WCw+Jt7xxeU9qZCAAh+QQFAAAMACwAAAAAEAAQAAAETZDJyRCimFqbZ0rVxgwF9n3hSJbeSQ2rCWIkpSjddBzMfee7nQ/XCfJ+OQYAQFksMgQBxumkEKLSCfVpMDCugqyW2w18xZmuwZycdDsRACH5BAUAAAwALAAAAAAQABAAAARNkMnJUqKYWpunUtXGIAj2feFIlt5JrWybkdSydNNQMLaND7pC79YBFnY+HENHMRgyhwPGaQhQotGm00oQMLBSLYPQ9QIASrLAq5x0OxEAIfkEBQAADAAsAAAAABAAEAAABE2QycmUopham+da1cYkCfZ94UiW3kmtbJuRlGF0E4Iwto3rut6tA9wFAjiJjkIgZAYDTLNJgUIpgqyAcTgwCuACJssAdL3gpLmbpLAzEQA7";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABaElEQVR42s3TSUtCYRQGYH9ICBVSt3IixK6V2gQFCRWFkmWKQRJYBDZYJBIqEun1KjSABmGDCAVJA2QhGZgtxEWDBLWIgv6A+zcTd5W3cNOBl7M6zzmL72Ox/kW5KQp/zRcgm83+Oj8CfB0Ngc5bCA2+1gOe1g3u8DK4aidqVTZmwHH9jqX4GxYvXjB98oTJgweM7aah9SdBDFiZAApLl69o3XtEy04G8uAdpIE0mtZvoKRjqO41fw9QBYCrcWHh7Dk3eA/51i2a/Sk0riZAemJQ2I/B6Z4qfkHdkBOmSCa3NZXbmgTpjUO8EkW97RDt5jAqOgwMwKAdxlAaEt8VGlznEDmOILSEwZsJghzfBFumKQ4Q/Rbo/QmInKcQWvfBn91GzcQGCIMPghEfyiTK4kBVzxzUdBR9jgi65kOQGQMQj65BqPGBUHmYAY7ChMpOI8rb9GBL1fmBfMjPrmIGSnqJVCl/oZT6AMGX1s+suGYjAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABBElEQVR42s2T3UrDQBBG+/4X9k0UtKC11dKqVWyDrW7a2E0aN39NdhMSQpLbz3QvAqJuK7lx4LAwMGeGYbbT+Rdx0u3ir3wTFEVxNL8KTi/6P3LWu0avf4PB7fiwYPaif2HxZkA3TFDLxvju4XiBtlzhVd/AoFtYNoPjepg+Ph0WaMs1FuQdZE1lV+a48IMAYRhirmlqwfnlUI67MW18MFcWxXGMJEkkRF+pBVeDkRzX831wzpGmKfI8bzCtrVowHE3gej6iKJId90X7fFmW8mWOoxZM7qdNcZZlMldVVUNQ70IpeJ7NQYgOSs16BwzBbgcuBES9ByHiWs7VglaX2OovtIlPX7c5S7fSRyEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource checked;
  private static com.google.gwt.resources.client.ImageResource folderClosed;
  private static com.google.gwt.resources.client.ImageResource folderOpened;
  private static com.google.gwt.resources.client.ImageResource jointCollapsedIcon;
  private static com.google.gwt.resources.client.ImageResource jointExpandedIcon;
  private static com.google.gwt.resources.client.ImageResource loadingIcon;
  private static com.google.gwt.resources.client.ImageResource partialChecked;
  private static com.google.gwt.resources.client.ImageResource unchecked;
  private static com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeBaseStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      checked(), 
      folderClosed(), 
      folderOpened(), 
      jointCollapsedIcon(), 
      jointExpandedIcon(), 
      loadingIcon(), 
      partialChecked(), 
      unchecked(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("checked", checked());
        resourceMap.put("folderClosed", folderClosed());
        resourceMap.put("folderOpened", folderOpened());
        resourceMap.put("jointCollapsedIcon", jointCollapsedIcon());
        resourceMap.put("jointExpandedIcon", jointExpandedIcon());
        resourceMap.put("loadingIcon", loadingIcon());
        resourceMap.put("partialChecked", partialChecked());
        resourceMap.put("unchecked", unchecked());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'checked': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::checked()();
      case 'folderClosed': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::folderClosed()();
      case 'folderOpened': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::folderOpened()();
      case 'jointCollapsedIcon': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::jointCollapsedIcon()();
      case 'jointExpandedIcon': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::jointExpandedIcon()();
      case 'loadingIcon': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::loadingIcon()();
      case 'partialChecked': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::partialChecked()();
      case 'unchecked': return this.@com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance.TreeResources::unchecked()();
      case 'style': return this.@com.sencha.gxt.theme.blue.client.tree.BlueTreeAppearance.BlueTreeResources::style()();
    }
    return null;
  }-*/;
}

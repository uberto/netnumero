package com.numhero.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle_en_StaticClientBundleGenerator implements com.numhero.client.widget.NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle {
  private static NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle_en_StaticClientBundleGenerator _instance0 = new NetNumeroButton_NetNumeroButtonUiBinderImpl_GenBundle_en_StaticClientBundleGenerator();
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
    }
    return null;
  }-*/;
}

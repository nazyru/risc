package com.risc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.risc.client.views.HelloMaterial;

/**
 * Created by nazir on 6/19/16.
 */
public class MainEntryPoint implements EntryPoint{

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new HelloMaterial());
    }
}

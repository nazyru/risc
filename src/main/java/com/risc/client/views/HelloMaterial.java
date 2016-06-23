package com.risc.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created by nazir on 6/20/16.
 */
public class HelloMaterial extends Composite {
    interface HelloMaterialUiBinder extends
        UiBinder<HTMLPanel, HelloMaterial> {
    }


    private static HelloMaterialUiBinder ourUiBinder = GWT.create(HelloMaterialUiBinder.class);

    public HelloMaterial() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}

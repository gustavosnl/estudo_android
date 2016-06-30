package com.glima.androidstudy.customview.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.glima.androidstudy.model.FormObject;

/**
 * Created by gustavo on 29/06/16.
 */
public class FormContainerViewModel extends BaseObservable {

    FormObject object;

    public FormContainerViewModel(FormObject object) {
        this.object = object;
    }

    @Bindable
    public String getName() {
        return object.getName();
    }

    @Bindable
    public String getMail() {
        return object.getMail();
    }

    @Bindable
    public String getPassword() {
        return object.getPassword();
    }

    public void build(){
//        object = new FormObject.FormBuilder().setMail();
    }

}

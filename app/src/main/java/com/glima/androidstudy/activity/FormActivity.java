package com.glima.androidstudy.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.glima.androidstudy.R;
import com.glima.androidstudy.customview.viewmodel.FormContainerViewModel;
import com.glima.androidstudy.databinding.ActivityFormBinding;
import com.glima.androidstudy.model.FormObject;

/**
 * Created by gustavo on 29/06/16.
 */
public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFormBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_form);
        FormObject object = new FormObject();
        binding.setObject(new FormContainerViewModel(object));
    }


}

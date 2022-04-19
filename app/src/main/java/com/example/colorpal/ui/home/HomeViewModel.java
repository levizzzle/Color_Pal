package com.example.colorpal.ui.home;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText,mText2;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText2 = new MutableLiveData<>();
        mText.setValue("Color Pal is an application designed to help educate you on the various " +
                "forms of color deficiencies and to provide tools that can make your life more colorful. ");

        mText2.setValue("Read about the scientific details of color blindness straight from the National Eye Institute. " +
                "Take a color blind test to learn more about your color perception. Use one of our tools to compare colors " +
                "or to ask questions about matching clothing, furniture, or anything really!");
    }

    public LiveData<String> getText(String obj) {
        if (obj.equals("title")){
            return mText;
        }
        else if (obj.equals("items")){
            return mText2;
        }
        return mText;
    }
}
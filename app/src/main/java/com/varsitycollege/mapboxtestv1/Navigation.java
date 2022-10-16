package com.varsitycollege.mapboxtestv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.services.android.navigation.v5.navigation.MapboxNavigation;

public class Navigation extends AppCompatActivity {

    private  MapboxNavigation navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        navigation = new MapboxNavigation(this,getString(R.string.mapbox_access_token));
         
    }
}
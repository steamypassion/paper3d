/*
 * Copyright 2012 - 2014 by Future Interface. 
 * This software is licensed under the terms of the MIT license.
 *
 */
package com.fi.tech.gesture;

import com.fi.tech.gesture.R;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.Log;

public class Paper3DSettings extends PreferenceActivity
    implements SharedPreferences.OnSharedPreferenceChangeListener 
{

    @Override
    protected void onCreate(Bundle icicle) 
    {
        super.onCreate(icicle);
        Log.i("Paper3D","**********************************");
        getPreferenceManager().setSharedPreferencesName("GestureSettings");
        addPreferencesFromResource(R.xml.settings);
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onResume() 
    {
        super.onResume();
    }

    @Override
    protected void onDestroy() 
    {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) 
    {
    }
}

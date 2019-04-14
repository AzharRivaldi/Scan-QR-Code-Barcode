package com.azhar.barcodeqr;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Azhar Rivaldi on 11/04/2019.
 */

public class SettingsActivity extends PreferenceActivity {

    private final static String TAG = "SettingsAcitivity";

    public SettingsActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new LocationFragment()).commit();
    }

}

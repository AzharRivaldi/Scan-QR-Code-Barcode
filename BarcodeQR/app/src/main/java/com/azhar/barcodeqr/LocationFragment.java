package com.azhar.barcodeqr;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Azhar Rivaldi on 11/04/2019.
 */

public class LocationFragment extends PreferenceFragment {

    private final static String beep = "beep";
    private final static String frontCamera = "frontCamera";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }

}

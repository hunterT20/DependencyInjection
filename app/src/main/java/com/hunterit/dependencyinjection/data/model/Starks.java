package com.hunterit.dependencyinjection.data.model;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Starks implements House {

    @Inject
    public Starks() {
    }

    @Override
    public void prepareForWar() {
        Log.e(TAG, "prepareForWar: ");
    }

    @Override
    public void reportForWar() {
        Log.e(TAG, "reportForWar: ");
    }
}

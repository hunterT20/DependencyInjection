package com.hunterit.dependencyinjection.data.model;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Boltons implements House {

    @Inject
    public Boltons() {
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

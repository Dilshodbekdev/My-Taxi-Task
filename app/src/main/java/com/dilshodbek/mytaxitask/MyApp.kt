package com.dilshodbek.mytaxitask

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(this, getString(R.string.access_token))
    }
}
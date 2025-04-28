package com.example.tabletapp

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("8dae8458-337d-46e5-9d45-1b9de5e6da3d")
        MapKitFactory.initialize(this)
    }
}
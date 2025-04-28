package com.example.tabletapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tabletapp.R.layout.map_activity
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView


private lateinit var mapView: MapView



class MapActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        MapKitFactory.initialize(this)
        super.onCreate(savedInstanceState)
        setContentView(map_activity)
        mapView = findViewById(R.id.yandex_map_view)

        val btnHomeBottomNav = findViewById<Button>(R.id.btnHomeBottomNav)
        val btnTochkovkaBottomNav = findViewById<Button>(R.id.btnTochkovkaBottomNav)
        val btnMessengerBotNav = findViewById<Button>(R.id.btnMessengerBotNav)
        val btnMapBotNav = findViewById<Button>(R.id.btnMapBotNav)
        val btnDistribBotNav =findViewById<Button>(R.id.btnDistribBotNav)
        val btnReportsBotNav = findViewById<Button>(R.id.btnReportsBotNav)

        btnHomeBottomNav.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            onStop()
        }
        btnTochkovkaBottomNav.setOnClickListener {
            val intent = Intent(this, TochovkaActivity::class.java)
            startActivity(intent)
            onPause()
        }
        btnMessengerBotNav.setOnClickListener {
            val intent = Intent(this, MessengerActivity::class.java)
            startActivity(intent)
            onDestroy()
        }
        btnMapBotNav.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            onDestroy()
        }
        btnDistribBotNav.setOnClickListener {
            val intent = Intent(this, DistributionActivity::class.java)
            startActivity(intent)
            onDestroy()
        }
        btnReportsBotNav.setOnClickListener {
            val intent = Intent(this, ReportsActivity::class.java)
            startActivity(intent)
            onDestroy()
        }
    }
    override fun onStart(){
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        MapKitFactory.getInstance().onStop()
        mapView.onStop()
    }
}
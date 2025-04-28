package com.example.tabletapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tabletapp.R.layout.home_activity


class MainActivity : AppCompatActivity(){

    private var isActivityReady = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(home_activity)

        val btnHomeBottomNav = findViewById<Button>(R.id.btnHomeBottomNav)
        val btnTochkovkaBottomNav = findViewById<Button>(R.id.btnTochkovkaBottomNav)
        val btnMessengerBotNav = findViewById<Button>(R.id.btnMessengerBotNav)
        val btnMapBotNav = findViewById<Button>(R.id.btnMapBotNav)
        val btnDistribBotNav =findViewById<Button>(R.id.btnDistribBotNav)
        val btnReportsBotNav = findViewById<Button>(R.id.btnReportsBotNav)

        btnHomeBottomNav.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnTochkovkaBottomNav.setOnClickListener {
            val intent = Intent(this, TochovkaActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnMessengerBotNav.setOnClickListener {
            val intent = Intent(this, MessengerActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnMapBotNav.setOnClickListener {
            if (isActivityReady) {
                val intent = Intent(this, MapActivity::class.java)
                startActivity(intent)
                onPause()
            }

        }
        btnDistribBotNav.setOnClickListener {
            val intent = Intent(this, DistributionActivity::class.java)
            startActivity(intent)
            finish()

        }

        btnReportsBotNav.setOnClickListener {
            val intent = Intent(this, ReportsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onStart(){
        super.onStart()
        isActivityReady = true
    }

    override fun onStop() {
        super.onStop()
        isActivityReady = false
    }
}

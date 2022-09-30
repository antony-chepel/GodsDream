package com.carxtech.goddreamwhite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.carxtech.R

class GodsResActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gods_res)
        val b_god_b = findViewById<Button>(R.id.button2)
        b_god_b.setOnClickListener {
            startActivity(Intent(this,MainGodsDream::class.java))
        }
    }
}
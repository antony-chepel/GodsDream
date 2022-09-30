package com.carxtech.goddreamwhite

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.carxtech.R
import com.carxtech.databinding.ActivityMainGodsDreamBinding

class MainGodsDream : AppCompatActivity() {
    private lateinit var binding : ActivityMainGodsDreamBinding
    private var spdoowodoqwd: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainGodsDreamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sggasdggdgwqwd()

        binding.imArt1.setOnClickListener {
            binding.imArt1.visibility = View.GONE
        }
        binding.imArt2.setOnClickListener {
            binding.imArt2.visibility = View.GONE
        }

        binding.button2.setOnClickListener {
            startActivity(
                Intent(this@MainGodsDream,GodsResActivity::class.java)
            )
        }
    }


    private fun sggasdggdgwqwd() =with(binding){
        var counter = 15
        spdoowodoqwd?.cancel()
        spdoowodoqwd = object : CountDownTimer(15000,1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                counter--
                if(counter >= 0) {
                    val count = counter.toString()
                    tvTime.text = "Time : $count sec"

                    when(counter){
                        3-> tvTime.setTextColor(resources.getColor(R.color.error_god_color))
                        2-> tvTime.setTextColor(resources.getColor(R.color.error_god_color))
                        1-> tvTime.setTextColor(resources.getColor(R.color.error_god_color))
                        0-> tvTime.setTextColor(resources.getColor(R.color.error_god_color))
                    }
                }
            }

            override fun onFinish() {
                tvTime.setTextColor(resources.getColor(R.color.white))
                if(counter==0){
                    counter = 10
                    startActivity(
                        Intent(this@MainGodsDream,GodsResActivity::class.java)
                    )
                }


            }

        }.start()
    }
}
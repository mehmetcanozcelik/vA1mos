package com.moondust.va1mos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.moondust.va1mos.KelimePaketi.KelimeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onResume() {

        super.onResume()

        ivLogo.alpha = 0.0f

        var animation = ivLogo.animate()

        animation.duration = 3000
        animation.alpha(1f)

        var timer = object : CountDownTimer(3000,1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {

                val intent = Intent(this@MainActivity, KelimeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
            }

        }.start()


    }
}
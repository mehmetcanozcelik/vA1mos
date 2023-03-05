package com.moondust.va1mos.Grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moondust.va1mos.R
import kotlinx.android.synthetic.main.activity_tiklanan_satir.*

class TiklananSatirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiklanan_satir)


        var dilbilgileri = intent?.extras?.get("grammarAnahtar") as ArrayList<Grammar>
        var positionInfo = intent?.extras?.get("position") as Int

        tvTiklananEspanol.text = dilbilgileri[positionInfo].espanol
        tvTiklananTurkce.text = dilbilgileri[positionInfo].turkce
        tvAciklama.text = dilbilgileri[positionInfo].aciklama
        ivTiklananSatirResim.setImageResource(dilbilgileri[positionInfo].resim)
    }
}
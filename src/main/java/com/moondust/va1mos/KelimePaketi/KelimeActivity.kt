package com.moondust.va1mos.KelimePaketi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.moondust.va1mos.Grammar.GrammarActivity
import com.moondust.va1mos.R
import kotlinx.android.synthetic.main.activity_kelime.*

class KelimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime)

        val kelimeDizisi = mutableListOf<Kelime>(

            Kelime("Adiós", R.drawable.adios),
            Kelime("Amor", R.drawable.amor),
            Kelime("Ayuda", R.drawable.ayuda),
            Kelime("Bienvenidos", R.drawable.bienvenidos),
            Kelime("La Ciudad", R.drawable.ciudad),
            Kelime("¿Cómo?", R.drawable.como),
            Kelime("Hora", R.drawable.hora),
            Kelime("No", R.drawable.no),
            Kelime("Perdón", R.drawable.perdon),
            Kelime("¿Por qué?", R.drawable.porque),
            Kelime("¿Qué?", R.drawable.que),
            Kelime("Señor", R.drawable.senor),
            Kelime("Señorita / señora", R.drawable.senorita),
            Kelime("Sí", R.drawable.si),

        )


        val adapter = KelimeAdapter(kelimeDizisi)
        recyclerView.adapter = adapter

        var layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager

        bottomNavigationView.menu.getItem(0).isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.bnvKelimeActivity -> {
                    val wordIntent = Intent(this, KelimeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(wordIntent)
                    return@OnNavigationItemSelectedListener true

                }

                R.id.bnvGrammarActivity -> {
                    val grammarIntent = Intent(this, GrammarActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(grammarIntent)
                    return@OnNavigationItemSelectedListener true

                }
            }
            return@OnNavigationItemSelectedListener false
        })



        }

        }






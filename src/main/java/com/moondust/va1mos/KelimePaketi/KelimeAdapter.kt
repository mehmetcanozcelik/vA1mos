package com.moondust.va1mos.KelimePaketi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.moondust.va1mos.R
import kotlinx.android.synthetic.main.kelime_satir.view.*

class KelimeAdapter(var kelimeDizisi:MutableList<Kelime>) :
    RecyclerView.Adapter<KelimeAdapter.KelimeViewHolder>() {
    class KelimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var meanings = arrayOf("Hoşçakal","Aşk","Yardım","Hoşgeldiniz","Şehir","Nasıl?","Saat","Hayır","Pardon","Neden?","Ne?","Erkek","Kadın","Evet")

        fun sendPosition(position: Int) {
            kelime_satir.setOnClickListener {

                Toast.makeText(itemView.context,meanings[position],Toast.LENGTH_SHORT).show()
                kelime_satir.animate().scaleX(2f)
                kelime_satir.animate().scaleY(2f)

            }


        }

        var kelime_satir = itemView as CardView
        var textView = kelime_satir.tvRecycler
        var imageView = kelime_satir.ivRecycler

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KelimeAdapter.KelimeViewHolder {
        var olusturulanKelime = LayoutInflater.from(parent.context).inflate(R.layout.kelime_satir,parent,false)
        return KelimeViewHolder(olusturulanKelime)
    }

    override fun onBindViewHolder(holder: KelimeAdapter.KelimeViewHolder, position: Int) {
        holder.textView.text = kelimeDizisi[position].kelime
        holder.imageView.setImageResource(kelimeDizisi[position].resim)

        holder.sendPosition(position)
    }

    override fun getItemCount(): Int {
        return kelimeDizisi.size

    }
}
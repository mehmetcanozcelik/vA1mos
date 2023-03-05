package com.moondust.va1mos.Grammar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.moondust.va1mos.R
import kotlinx.android.synthetic.main.grammar_satir.view.*

class GrammarAdapter(var dilbilgileri:ArrayList<Grammar>) : BaseAdapter() {
    override fun getCount(): Int {
       return dilbilgileri.size
    }

    override fun getItem(position: Int): Any {
        return dilbilgileri[position]
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var olusturulanGrammar = convertView
        var holder:DilbilgisiViewHolder
        if (olusturulanGrammar == null){

            olusturulanGrammar = LayoutInflater.from(parent?.context).inflate(R.layout.grammar_satir,parent,false)
            holder = DilbilgisiViewHolder(olusturulanGrammar)



            olusturulanGrammar.tag = holder
        }

        else{
            holder = olusturulanGrammar.tag as DilbilgisiViewHolder

        }

        holder.espanol.text = dilbilgileri[position].espanol
        holder.turkce.text = dilbilgileri[position].turkce
        holder.resim.setImageResource(dilbilgileri[position].resim)

            return olusturulanGrammar!!
    }

    class DilbilgisiViewHolder(olusturulanGrammar:View){
        var espanol = olusturulanGrammar.tvSpanishGrammar
        var turkce = olusturulanGrammar.tvTurkishGrammar
        var resim = olusturulanGrammar.ivGrammarPic
    }
}

package com.hellodevs.training.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(
    val countries: Array<String>,
    val itemClickListener: View.OnClickListener
) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView : CardView = itemView.findViewById(R.id.card_view)
        val icon = itemView.findViewById<ImageView>(R.id.icon)
        val name = itemView.findViewById<TextView>(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.item_country, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countries[position]
        holder.icon.setImageResource(R.mipmap.ic_launcher)
        holder.name.text = country
        holder.cardView.tag = position
        holder.cardView.setOnClickListener(itemClickListener)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}
package com.example.learnthreekotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.learnthreekotlin.R
import com.example.learnthreekotlin.model.Hero

class GridHeroAdapter(val listHeroes: ArrayList<Hero>) : RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_hero, viewGroup, false)
        return GridViewHolder(view)
    }
    override fun onBindViewHolder(p0: GridViewHolder, p1: Int) {
        Glide.with(holder.itemView.context)
            .load(listHeroes[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listHeroes.size
    }
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    }
}
package com.hit.androidmatalatwo.views.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hit.androidmatalatwo.databinding.ListItemBinding
import com.hit.androidmatalatwo.views.fragments.model.Hero

class HeroesAdapter(
    private val heroes: List<Hero>,
    private val heroCardClick:(hero: Hero) -> Unit
): RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {

    inner class HeroesViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(hero: Hero) {
            binding.name.text = hero.name
            binding.description.text = hero.description
            binding.photo.setImageResource(hero.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        holder.bind(heroes[position])
        holder.itemView.setOnClickListener {
            heroCardClick(heroes[position])
        }

    }

    override fun getItemCount(): Int {
        return heroes.size
    }
}
package com.hit.androidmatalatwo.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.hit.androidmatalatwo.R
import com.hit.androidmatalatwo.databinding.FragmentMainBinding
import com.hit.androidmatalatwo.views.fragments.adapter.HeroesAdapter
import com.hit.androidmatalatwo.views.fragments.model.Hero
import com.hit.androidmatalatwo.views.fragments.model.HeroFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        initDependencies()

        return binding.root
    }

    private fun initDependencies() {
        binding.rv.apply {
            this.adapter = HeroesAdapter(
                HeroFactory.createHeroList(),
                ::showInformativeDescription
            )
            this.layoutManager = LinearLayoutManager(this@MainFragment.context)
        }
    }

    private fun showInformativeDescription(hero: Hero) {
        Navigation.findNavController(binding.root)
            .navigate(R.id.heroDetailFragment,
                Bundle().apply {
                    putString("name", hero.name)
                    putString("desc", hero.description)
                    putInt("photo",hero.image)
                }
        )
    }
}
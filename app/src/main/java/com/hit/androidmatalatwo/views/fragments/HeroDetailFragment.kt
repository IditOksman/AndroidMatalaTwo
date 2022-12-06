package com.hit.androidmatalatwo.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hit.androidmatalatwo.R
import com.hit.androidmatalatwo.databinding.FragmentHeroDetailBinding
import com.hit.androidmatalatwo.views.fragments.model.Hero
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class HeroDetailFragment : Fragment() {

    private lateinit var binding: FragmentHeroDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeroDetailBinding.inflate(inflater, container, false)

        initListeners()
        return binding.root
    }

    private fun initListeners() {
        arguments.let { bundle ->
            binding.name.text = bundle?.getString("name")!!
            binding.description.text = bundle.getString("desc")!!
            binding.photo.setImageResource(bundle.getInt("photo"))
            }

        binding.back.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.mainFragment)
        }

        }
}
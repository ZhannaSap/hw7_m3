package com.example.hw7_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw7_m3.databinding.FragmentListBinding
import com.example.hw7_m3.databinding.ItemMusicBinding


class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val musicList = arrayListOf(
        Music("1","Blank Space","Taylor Swift","3:22"),
        Music("2","Watch Me","Silento","5:36"),
        Music("3","Earned It","The Weekend","4:51"),
        Music("4","The Hills","The Weekend","3:41"),
        Music("5","Writing’s On The Wall","The Hils","5:33"),

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList)
        binding.recyclerView.adapter = adapter
    }

}
package com.tibesoft.listsfinanceoffline.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tibesoft.listsfinanceoffline.databinding.FragmentListBinding

class ListFragment : Fragment() {

    lateinit var binding : FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)



        return binding.root
    }
}
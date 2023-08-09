package com.tibesoft.listsfinanceoffline.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tibesoft.listsfinanceoffline.adapter.ListAdapter
import com.tibesoft.listsfinanceoffline.databinding.FragmentListBinding
import com.tibesoft.listsfinanceoffline.viewmodel.ListViewModel

class ListFragment : Fragment() {

    lateinit var binding : FragmentListBinding
    private lateinit var listViewModel: ListViewModel
    private lateinit var listAdapter: ListAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())

        listAdapter = ListAdapter()
        listViewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        listViewModel.allItems.observe(viewLifecycleOwner) { items ->
            listAdapter.setItems(items)
            binding.recyclerView.adapter = listAdapter
        }

        return binding.root
    }
}
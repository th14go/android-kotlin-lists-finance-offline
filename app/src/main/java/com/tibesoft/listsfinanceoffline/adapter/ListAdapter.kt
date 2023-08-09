package com.tibesoft.listsfinanceoffline.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tibesoft.listsfinanceoffline.data.model.Item
import com.tibesoft.listsfinanceoffline.databinding.ItemFinanceBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private var items: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binfing: ItemFinanceBinding = ItemFinanceBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binfing);
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setItems(newItems: List<Item>) {
        items = newItems
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemFinanceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.textView.text = item.itemName
        }
    }
}
package com.tibesoft.listsfinanceoffline.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.tibesoft.listsfinanceoffline.data.database.FinanceDatabase
import com.tibesoft.listsfinanceoffline.data.model.Item
import com.tibesoft.listsfinanceoffline.repository.ListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ListRepository
    val allItems: LiveData<List<Item>>

    init {
        val itemDao = FinanceDatabase.getDatabase(application).listDao()
        repository = ListRepository(itemDao)
        allItems = repository.allItems
    }

    fun insert(item: Item) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(item)
    }

    fun update(item: Item) = viewModelScope.launch(Dispatchers.IO) {
        repository.update(item)
    }

    fun delete(item: Item) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(item)
    }
}
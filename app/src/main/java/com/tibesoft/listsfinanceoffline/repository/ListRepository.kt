package com.tibesoft.listsfinanceoffline.repository

import androidx.lifecycle.LiveData
import com.tibesoft.listsfinanceoffline.data.dao.ListDao
import com.tibesoft.listsfinanceoffline.data.model.Item

class ListRepository(private val listDao: ListDao) {

    val allItems: LiveData<List<Item>> = listDao.getAllItems()

    suspend fun insert(item: Item) {
        listDao.insert(item)
    }

    suspend fun update(item: Item) {
        listDao.update(item)
    }

    suspend fun delete(item: Item) {
        listDao.delete(item)
    }
}
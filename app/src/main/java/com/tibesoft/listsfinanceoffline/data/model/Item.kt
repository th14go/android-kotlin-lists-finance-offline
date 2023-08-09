package com.tibesoft.listsfinanceoffline.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val itemName: String
)
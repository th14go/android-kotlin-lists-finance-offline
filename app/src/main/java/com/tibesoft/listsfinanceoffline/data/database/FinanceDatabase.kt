package com.tibesoft.listsfinanceoffline.data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tibesoft.listsfinanceoffline.data.dao.ListDao

abstract class FinanceDatabase : RoomDatabase() {
    abstract fun listDao(): ListDao

    companion object {
        @Volatile
        private var INSTANCE: FinanceDatabase? = null

        fun getDatabase(context: Context): FinanceDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FinanceDatabase::class.java,
                    "finance_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
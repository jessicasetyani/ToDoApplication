package com.example.todoapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapplication.data.models.ToDoTask

/**
 * Created by Jessica Setyani on 16-01-2024.
 */

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun todoDao(): ToDoDao
}
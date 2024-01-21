package com.example.myapplication.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.util.Constants.DATABASE_TABLE

/**
 * Created by Jessica Setyani on 16-01-2024.
 */

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
package com.example.todoapplication.data.repositories

import com.example.todoapplication.data.ToDoDao
import javax.inject.Inject

/**
 * Created by Jessica Setyani on 29-01-2024.
 */
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {
}
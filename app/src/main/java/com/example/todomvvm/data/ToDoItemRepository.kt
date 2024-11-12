package com.example.todomvvm.data
import kotlinx.coroutines.flow.Flow

interface ToDoItemRepository {
    suspend fun insertToDo(todo: ToDoItem)
    suspend fun deleteToDo(todo: ToDoItem)
    suspend fun getToDoItemByID(id: Int): ToDoItem
    fun getAllToDoItems() : Flow<List<ToDoItem>>
}
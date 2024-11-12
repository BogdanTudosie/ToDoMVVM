package com.example.todomvvm.data

import kotlinx.coroutines.flow.Flow

class ToDoItemDaoImpl(
    private val dao: ToDoItemDao
) : ToDoItemRepository {
    override suspend fun insertToDo(todo: ToDoItem) {
        dao.insertToDo(todo)
    }

    override suspend fun deleteToDo(todo: ToDoItem) {
        dao.deleteToDo(todo)
    }

    override suspend fun getToDoItemByID(id: Int): ToDoItem {
        return dao.getToDoItemByID(id = id)
    }

    override fun getAllToDoItems(): Flow<List<ToDoItem>> {
        return dao.getAllToDoItems()
    }
}
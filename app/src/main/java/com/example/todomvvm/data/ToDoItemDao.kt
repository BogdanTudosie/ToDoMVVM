package com.example.todomvvm.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(todo: ToDoItem)

    @Delete
    suspend fun deleteToDo(todo: ToDoItem)

    @Query("SELECT * FROM todooitems WHERE id = :id")
    suspend fun getToDoItemByID(id: Int): ToDoItem

    @Query("SELECT * FROM todoitems")
    fun getAllToDoItems() : Flow<List<ToDoItem>>
}
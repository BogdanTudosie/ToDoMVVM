package com.example.todomvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ToDoItem::class],
    version = 1
)
abstract class ToDoItemDatabase : RoomDatabase() {
    abstract val toDoItemDao: ToDoItemDao
}
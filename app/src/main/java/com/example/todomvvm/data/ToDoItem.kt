package com.example.todomvvm.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDoItem(
    val name: String,
    val description: String?,
    val isComplete: Boolean,
    @PrimaryKey val id: Int? = null
)

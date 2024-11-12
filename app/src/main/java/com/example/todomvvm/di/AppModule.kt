package com.example.todomvvm.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todomvvm.data.ToDoItemDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideToDoItemDB(app: Application) : ToDoItemDatabase {
        return Room.databaseBuilder(
            app,
            ToDoItemDatabase::class.java,
            "todoitemdb").build()
    }
}
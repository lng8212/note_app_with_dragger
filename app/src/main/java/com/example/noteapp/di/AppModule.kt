package com.example.noteapp.di

import android.app.Application
import com.example.noteapp.database.NoteDatabase
import com.example.noteapp.database.dao.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    //cung cấp database từ bên ngoài
    fun provideNoteDatabase(application: Application): NoteDatabase{
        return NoteDatabase.getInstance(application)
    }

    @Singleton
    @Provides
    //cung cấp DAO từ bên ngoài
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao {
        return noteDatabase.getNoteDao()
    }
}
package com.example.noteapp.di

import android.app.Application
import com.example.noteapp.database.NoteDatabase
import com.example.noteapp.database.dao.NoteDao
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideNoteDataBase(application: Application): NoteDatabase{
        return NoteDatabase.getInstance(application)
    }

    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao{
        return noteDatabase.getNoteDao()
    }

}
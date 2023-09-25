package com.example.noteapp.di

import android.app.Activity
import android.app.Application
import com.example.noteapp.activities.MainActivity
import com.example.noteapp.viewmodel.NoteViewModel
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [AppModule::class]
)
interface AppComponent {
    fun getNoteViewModel(): NoteViewModel
    fun inject(activity: MainActivity)
    @Component.Builder
    interface  Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent


    }
}
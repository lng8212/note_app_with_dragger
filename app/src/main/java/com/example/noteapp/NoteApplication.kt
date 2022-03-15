package com.example.noteapp

import android.app.Application
import com.example.noteapp.di.AppComponent
import com.example.noteapp.di.DaggerAppComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NoteApplication : Application() {
//    lateinit var component: AppComponent
//
//    override fun onCreate() {
//        super.onCreate()
////        component = DaggerAppComponent.builder().application(this).build()
//        component = DaggerAppComponent.factory().create(this)
//    }
}
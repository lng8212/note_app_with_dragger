package com.example.noteapp.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.noteapp.database.repository.NoteRepository
import com.example.noteapp.model.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NoteViewModel @Inject constructor(private val noteRepository: NoteRepository ) : ViewModel() {



    fun insertNote(note: Note) = GlobalScope.launch {
        noteRepository.insertNote(note)
    }

    fun updateNote(note: Note) = GlobalScope.launch {
        noteRepository.updateNote(note)
    }

    fun deleteNote(note: Note) = GlobalScope.launch {
        noteRepository.deleteNote(note)
    }

    fun getAllNote(): LiveData<List<Note>> = noteRepository.getAllNote()

}
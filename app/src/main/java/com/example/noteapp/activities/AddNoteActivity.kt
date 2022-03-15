package com.example.noteapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.noteapp.NoteApplication
import com.example.noteapp.R
import com.example.noteapp.databinding.ActivityAddNoteBinding
import com.example.noteapp.di.DaggerAppComponent
import com.example.noteapp.model.Note
import com.example.noteapp.viewmodel.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_add_note.*
import javax.inject.Inject

@AndroidEntryPoint
class AddNoteActivity : AppCompatActivity() {
//    @Inject
//    lateinit var noteViewModel: NoteViewModel
    private val noteViewModel: NoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityAddNoteBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_add_note)
//        val appComponent = (application as NoteApplication).component
//        appComponent.inject(this)
        binding.btnAdd.setOnClickListener {
            val note = Note(binding.edtNoteTitle.text.toString(), binding.edtNoteDes.text.toString())
            noteViewModel.insertNote(note)
            finish()
        }

    }
}
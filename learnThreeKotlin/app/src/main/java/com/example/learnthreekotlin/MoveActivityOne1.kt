package com.example.learnthreekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MoveActivityOne1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_one1)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Google Pixel"
        }
    }
}

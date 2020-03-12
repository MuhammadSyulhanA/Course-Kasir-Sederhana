package com.example.learnthreekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MoveActivityTwo : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_two)

        val tvDataReceived: TextView = findViewById(R.id.tv_result)
        val hasilnya = intent.getIntExtra(HASIL, 0)

        //bisa tanpa text2
        val text2 = "Hasilnya : $hasilnya"

        tvDataReceived.setText(text2)
    }

    companion object {
        const val HASIL = "hasil"
    }

}

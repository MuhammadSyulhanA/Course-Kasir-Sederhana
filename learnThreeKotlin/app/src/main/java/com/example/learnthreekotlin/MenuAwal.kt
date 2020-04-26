package com.example.learnthreekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuAwal : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_awal)

        val btnBelanja: Button = this.findViewById(R.id.btn_belanja)
        btnBelanja.setOnClickListener(this)

        val btnCekhp: Button = this.findViewById(R.id.btn_cekhp)
        btnCekhp.setOnClickListener(this)

        val btnCekhero: Button = this.findViewById(R.id.btn_cekhero)
        btnCekhero.setOnClickListener(this)

    }

    override fun onClick(v: View) {
            if (v.id  == R.id.btn_belanja) {
                val Intent = Intent(this@MenuAwal, MoveActivityOne::class.java)
                startActivity(Intent)
            }

            else if (v.id  == R.id.btn_cekhp) {
                val Intent = Intent(this@MenuAwal, MoveActivityOne1::class.java)
                startActivity(Intent)
            }
            else if (v.id  == R.id.btn_cekhero) {
                val Intent = Intent(this@MenuAwal, MoveActivityOne2::class.java)
                startActivity(Intent)
            }

    }
}

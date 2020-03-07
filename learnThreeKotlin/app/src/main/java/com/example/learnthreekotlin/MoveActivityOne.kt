package com.example.learnthreekotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MoveActivityOne : AppCompatActivity(), AdapterView.OnItemSelectedListener{

//    var hasilnya: EditText? = null
//    var isiBuah: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_one)

        val DataReceived1: TextView = findViewById(R.id.data_received1)
        val DataReceived2: TextView = findViewById(R.id.data_received2)

        val usname = intent.getStringExtra(EXTRA_UNAME)
        val angka = intent.getIntExtra(EXTRA_ANGKA, 0)

        val text1 = "Name : $usname"
        val text2 = "Your Age : $angka"
        DataReceived1.text = text1
        DataReceived2.text = text2

        val spinner: Spinner = findViewById(R.id.spinner)
        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this

        isiBuah = findViewById<TextView>(R.id.detailbuah)
        isiBuah.setVisibility(View.GONE)



    }
    companion object {
        const val EXTRA_UNAME = "extra_uname"
        const val EXTRA_ANGKA = "extra_angka"
        lateinit var isiBuah: TextView
        var adapter: ArrayAdapter<CharSequence?>? = null
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        isiBuah.setVisibility(View.VISIBLE)
        isiBuah.setText("detail buah " + adapter!!.getItem(position))
    }

}




package com.example.learnthreekotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNREACHABLE_CODE")
class MoveActivityOne : AppCompatActivity(), AdapterView.OnItemSelectedListener, View.OnClickListener{

//    var hasilnya: EditText? = null
//    var isiBuah: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_one)

        val dataReceived1: TextView = findViewById(R.id.data_received1)
        val dataReceived2: TextView = findViewById(R.id.data_received2)

        val usname = intent.getStringExtra(EXTRA_UNAME)
        val angka = intent.getIntExtra(EXTRA_ANGKA, 0)

        val text1 = "Name : $usname"
        val text2 = "Your Age : $angka"
        dataReceived1.setText(text1)
        dataReceived2.setText(text2)

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

        jmlh = findViewById(R.id.jmlh_buah)
        btnCalculate = findViewById(R.id.btn_calculate)

        btnCalculate.setOnClickListener(this)

    }
    companion object {
        const val EXTRA_UNAME = "extra_uname"
        const val EXTRA_ANGKA = "extra_angka"
        lateinit var jmlh: EditText
        lateinit var btnCalculate: Button
        lateinit var isiBuah: TextView
        var adapter: ArrayAdapter<CharSequence?>? = null
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

//    udah bisa method yg ini
    @SuppressLint("SetTextI18n")
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        isiBuah.setVisibility(View.VISIBLE)
        isiBuah.setText("detail buah " + adapter!!.getItem(position))
    }

    override fun onClick(v: View) {
        if (v.id  == R.id.btn_calculate) {
//            val inputJmlh = jmlh.text.toString()
            val inputJmlh = Integer.valueOf(jmlh.getText().toString())

            var isEmptyFields = false

            if (TextUtils.isEmpty(inputJmlh.toString())) {
                isEmptyFields = true
                jmlh.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val total = inputJmlh * 5
//                tvResult.text = volume.toString()
                val moveWithDataIntent = Intent(this@MoveActivityOne, MoveActivityTwo::class.java)
                moveWithDataIntent.putExtra(MoveActivityTwo.HASIL, total)
                startActivity(moveWithDataIntent)
            }
        }
    }

    private fun toDouble(str: String): Double? {
        try {
            return java.lang.Double.valueOf(str)
        } catch (e: NumberFormatException) {
            return null
        }

    }

}




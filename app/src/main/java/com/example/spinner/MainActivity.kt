package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var spinner: Spinner
    lateinit var spinner2: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        spinner2 = findViewById(R.id.spinner2)

        // create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this,
        R.array.city_list, android.R.layout.simple_spinner_item)

        // specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // apply adapter to the spinner
        spinner.adapter = adapter
    }

    fun getValues(view: View) {
        val spinnerValue = spinner.selectedItem.toString()
        val spinner2Value = spinner2.selectedItem.toString()

        Toast.makeText(
            this, "Spinner 1 " + spinnerValue
                    + "\nSpinner 2 " + spinner2Value,
            Toast.LENGTH_LONG
        ).show()
    }
}
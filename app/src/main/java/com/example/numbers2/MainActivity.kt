package com.example.numbers2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun pr(view: View) {
            var number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            var number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()
            if (!number1.equals("") && !number2.equals("")) {
                val pr = number1.toFloat()/ number2.toFloat()
                val toast = Toast.makeText(this, "Произведение чисел: $number1 / $number2 = $pr", Toast.LENGTH_SHORT).show()
            } else {
                val toast = Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_LONG).show()
            }
        }

        fun ab(view: View) {
            var number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            var number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()
            if (!number1.equals("") && !number2.equals("")) {
                val ab = abs(number1.toInt() - number2.toInt())
                val toast = Toast.makeText(this, " Значение абсолютной разности между числами: $ab", Toast.LENGTH_SHORT).show()
            } else {
                val toast = Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_LONG).show()
            }
        }

        fun sum(view: View) {
            var number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
            var number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()
            if (!number1.equals("") && !number2.equals("")) {
                val sum = number1.toInt() + number2.toInt()
                val toast = Toast.makeText(this, "Сумма чисел: $number1 + $number2 = $sum", Toast.LENGTH_SHORT).show()
            } else {
                val toast = Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_LONG).show()
            }
        }
}

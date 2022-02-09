package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById (R.id.buGetAge)
        rollButton. setOnClickListener { rollDice () }
    }
    private fun rollDice() {
        val etDOB: EditText = findViewById (R.id.etDOB)
        val userDOB : Int =Integer.parseInt(etDOB.text.toString())
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeIntYears : Int = currentYear - userDOB
        val tvShowAge : TextView = findViewById (R.id.tvShowAge)
        tvShowAge.text= "You Age is $userAgeIntYears Years"

            }
}
            

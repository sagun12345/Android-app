package com.sagun.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirst:EditText=findViewById(R.id.etFirst)
        val etSecond:EditText=findViewById(R.id.etSecond)
        val btnCalculate: Button =findViewById(R.id.btnCalculate)
        val tvResult:TextView=findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener{
            val first:Int=etFirst.text.toString().toInt()
            val second:Int=etSecond.text.toString().toInt()
            val result:Int=first+second
            tvResult.text=result.toString()
            Toast.makeText(this, "Sum is $result", Toast.LENGTH_LONG).show()
        }





    }

}
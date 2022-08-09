package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val convert: Button=findViewById(R.id.convert)
        var value1 : TextView=findViewById(R.id.value1)
        var value2: TextView=findViewById(R.id.value2)
        var value3: TextView=findViewById(R.id.value3)
        var value4: TextView=findViewById(R.id.value4)
        val value5: TextView=findViewById(R.id.value5)
        var value6: TextView=findViewById(R.id.value6)
        var value7: TextView=findViewById(R.id.value7)
        var value8: TextView=findViewById(R.id.value8)
        val Text1: EditText=findViewById(R.id.Text1)
        val Text2: EditText=findViewById(R.id.Text2)
        val Text3: EditText=findViewById(R.id.Text3)
        val Text4: EditText=findViewById(R.id.Text4)
        val level_2: Button=findViewById(R.id.level_2)
        Toast.makeText(this,"Fill all the blanks for conversion",Toast.LENGTH_LONG).show()



        convert.setOnClickListener{
            Toast.makeText(this,"Conversion Successful",Toast.LENGTH_SHORT).show()
            val t1:Double=Text1.text.toString().toDouble()
            val t2:Double=Text2.text.toString().toDouble()
            val t3:Double=Text3.text.toString().toDouble()
            val t4:Double=Text4.text.toString().toDouble()

            value1.text=((((t1 * 9) / 5) + 32)).toString()
            value2.text=(t1+273).toString()
            value3.text=(t2/100).toString()
            value4.text=(t2/2.54).toString()
            value5.text=(t3*1000).toString()
            value6.text=(t3*2.204).toString()
            value7.text=(t4*0.44).toString()
            value8.text=(t4*1.6).toString()

        }
        level_2.setOnClickListener{
            val intent = Intent(this, Check_Feature::class.java)
            startActivity(intent)

        }







    }


}





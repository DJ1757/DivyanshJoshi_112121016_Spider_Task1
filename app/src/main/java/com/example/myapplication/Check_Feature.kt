package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.*
import com.example.myapplication.R.color
import com.example.myapplication.R.color.*

class Check_Feature : AppCompatActivity() {
    @SuppressLint("RestrictedApi", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionbar=supportActionBar
        actionbar!!.title="Checking Window"
        actionbar.setDefaultDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_check_feature)
        val relativeLayout:RelativeLayout=findViewById(R.id.relativeLayout)
        val input1:EditText=findViewById(R.id.input1)
        val input2:EditText=findViewById(R.id.input2)
        val input3:EditText=findViewById(R.id.input3)
        val input4:EditText=findViewById(R.id.input4)
        val input5:EditText=findViewById(R.id.input5)
        val input6:EditText=findViewById(R.id.input6)
        val input7:EditText=findViewById(R.id.input7)
        val input8:EditText=findViewById(R.id.input8)
        val check1:TextView=findViewById(R.id.check1)
        val check2:TextView=findViewById(R.id.check2)
        val check3:TextView=findViewById(R.id.check3)
        val check4:TextView=findViewById(R.id.check4)
        val check_button:Button=findViewById(R.id.check_button)
        check1.text= (1..50).random().toString()
        check2.text=(1..50).random().toString()
        check3.text=(1..50).random().toString()
        check4.text=(1..50).random().toString()
        Toast.makeText(this,"Fill all the blanks for correction",Toast.LENGTH_LONG).show()



        check_button.setOnClickListener{

            val i1=input1.text.toString().toDouble()
            val i2=input2.text.toString().toDouble()
            val i3=input3.text.toString().toDouble()
            val i4=input4.text.toString().toDouble()
            val i5=input5.text.toString().toDouble()
            val i6=input6.text.toString().toDouble()
            val i7=input7.text.toString().toDouble()
            val i8=input8.text.toString().toDouble()
            val c1=check1.text.toString()
            val c2=check2.text.toString()
            val c3=check3.text.toString()
            val c4=check4.text.toString()

            val s1=((i1-32)*5/9).toString()
            val s2=(i2-273).toString()
            val s3=(i3*100).toString()
            val s4=(i4/2.54).toString()
            val s5=(i5/1000).toString()
            val s6=(i6*0.45359237).toString()
            val s7=(i7/0.44704).toString()
            val s8=(i8/ 1.609344).toString()
            if(s1.equals(c1)&&s2.equals(c1)&&s3.equals(c2)&&s4.equals(c2)&&s5.equals(c3)&&s6.equals(c3)&&s7.equals(c4)&&s8.equals(c4)){
                Toast.makeText(this,"Correct Conversions",Toast.LENGTH_LONG).show()
                relativeLayout.setBackgroundColor(green)
            }
            else{
                Toast.makeText(this,"Incorrect Conversions",Toast.LENGTH_LONG).show()
                val v = (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator)
                v.vibrate(500)
                relativeLayout.setBackgroundColor(red)
            }






        }

    }
}
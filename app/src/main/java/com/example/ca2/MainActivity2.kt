package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         val ed_1=findViewById<EditText>(R.id.edit1)
        val rb_1=findViewById<RadioButton>(R.id.radio1)
         val rb_2=findViewById<RadioButton>(R.id.radio2)
         val cb_1=findViewById<CheckBox>(R.id.check1)
         val cb_2=findViewById<CheckBox>(R.id.check2)
         val button1=findViewById<Button>(R.id.Button1)
         val radio_G=findViewById<RadioGroup>(R.id.radioG)

         button1.setOnClickListener {
             var out:String=" ${ed_1.text} Selected  "
             val radioCheck=radio_G.checkedRadioButtonId
             val radio=findViewById<RadioButton>(radioCheck)
             out= out+radio.text.toString()
             if(cb_1.isChecked){
                 out=out+" Checkbox1"
             }
             if(cb_2.isChecked){
                 out=out+" Checkbox2"
             }
             Toast.makeText(this,out,Toast.LENGTH_SHORT).show()

    }
}
}
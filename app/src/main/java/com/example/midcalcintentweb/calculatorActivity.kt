package com.example.midcalcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubrtact:Button
    lateinit var buttonmultiply:Button
    lateinit var buttondivide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Tv_answer=findViewById(R.id.txt_answer)
        edt_firstnumber=findViewById(R.id.edt_firstnumber)
        edt_secondnumber=findViewById(R.id.edt_secondnumber)
        buttonadd=findViewById(R.id.btn_Add)
        buttonsubrtact=findViewById(R.id.btn_subtract)
        buttonmultiply=findViewById(R.id.btn_multiply)
        buttondivide=findViewById(R.id.btn_divide)
        buttonadd.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        buttonsubrtact.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="please fill all the inputs"
            }else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        buttonmultiply.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        buttondivide.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
    }
}
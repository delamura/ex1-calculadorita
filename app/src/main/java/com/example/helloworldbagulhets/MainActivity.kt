package com.example.helloworldbagulhets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val editText = findViewById<EditText>(R.id.editText)
        //val button = findViewById<Button>(R.id.buttonToast)
        btnAdd.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val n1temp: String? = n1.text.toString()
                val n2temp: String? = n2.text.toString()
                val num1 = n1temp?.toInt() ?: 0
                val num2 = n2temp?.toInt() ?: 0
                callToast(oper(num1, num2, 1))
            }
        })
        btnSub.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                callToast(oper(num1, num2, 2))
            }
        })
        btnMul.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                callToast(oper(num1, num2, 3))
            }
        })
        btnDiv.setOnClickListener (object: View.OnClickListener{
            override fun onClick(v: View?) {
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                callToast(oper(num1, num2, 4))
            }
        })
    }

    fun oper(n1: Int = 0, n2: Int = 0, op: Int = 0) : Int {
        return when (op) {
            1 -> n1 + n2
            2 -> n1 - n2
            3 -> n1 * n2
            4 -> if (n2 == 0) 0 else n1 / n2
            else -> 0
        }
    }

    fun callToast(res: Int) {
        Toast.makeText(this@MainActivity,res.toString(),Toast.LENGTH_SHORT).show()
    }

}


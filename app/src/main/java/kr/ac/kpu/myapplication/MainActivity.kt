package kr.ac.kpu.myapplication


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    lateinit var num1: EditText;
    lateinit var num2: EditText
    lateinit var btnAdd: Button;
    lateinit var btnSub: Button
    lateinit var btnMul: Button;
    lateinit var btnDiv: Button
    lateinit var result: TextView
    lateinit var giho: TextView
    lateinit var Num1: String;
    lateinit var Num2: String
    var result2: Int? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        num1 = findViewById<EditText>(R.id.num1)
        num2 = findViewById<EditText>(R.id.num2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        result = findViewById<TextView>(R.id.result)
        giho = findViewById<TextView>(R.id.giho)

        btnAdd.setOnTouchListener { view, motionEvent ->
            Num1 = num1.text.toString()
            Num2 = num2.text.toString()
            result2 = Integer.parseInt(Num1) + Integer.parseInt(Num2)
            giho.text ="+"
            result.text = "계산 결과 : " + result2.toString()
            false
        }

        btnSub.setOnTouchListener { view, motionEvent ->
            Num1 = num1.text.toString()
            Num2 = num2.text.toString()
            result2 = Integer.parseInt(Num1) - Integer.parseInt(Num2)
            giho.text ="-"
            result.text = "계산 결과 : " + result2.toString()
            false
        }

        btnMul.setOnTouchListener { view, motionEvent ->
            Num1 = num1.text.toString()
            Num2 = num2.text.toString()
            result2 = Integer.parseInt(Num1) * Integer.parseInt(Num2)
            giho.text ="*"
            result.text = "계산 결과 : " + result2.toString()
            false
        }
        btnDiv.setOnTouchListener { view, motionEvent ->
            Num1 = num1.text.toString()
            Num2 = num2.text.toString()
            result2 = Integer.parseInt(Num1) / Integer.parseInt(Num2)
            giho.text ="/"
            result.text = "계산 결과 : " + result2.toString()
            false
        }

    }
}

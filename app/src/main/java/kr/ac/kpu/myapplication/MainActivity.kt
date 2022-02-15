package kr.ac.kpu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(applicationContext,"학과:컴퓨터공학부(소프트웨어전공)", Toast.LENGTH_SHORT).show()
        }
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "이름:홍길동", Toast.LENGTH_SHORT).show()
        }
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            Toast.makeText(applicationContext, "학번:2000202020", Toast.LENGTH_SHORT).show()
        }
    }
}
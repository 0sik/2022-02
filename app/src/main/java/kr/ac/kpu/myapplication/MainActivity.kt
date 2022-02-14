package kr.ac.kpu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(applicationContext,"버튼을 눌렀어요", Toast.LENGTH_SHORT).show()
        }
        button2=findViewById(R.id.button1)
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "버튼2가 눌렸어요", Toast.LENGTH_SHORT).show()
        }
        button2=findViewById(R.id.button1)
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "버튼2가 눌렸어요", Toast.LENGTH_SHORT).show()
        }
    }
}
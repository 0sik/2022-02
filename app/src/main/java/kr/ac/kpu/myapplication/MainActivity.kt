package kr.ac.kpu.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button1)
        button1.setOnClickListener {
            val mlntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"))
            startActivity(mlntent)
        }
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val mlntent = Intent(Intent.ACTION_VIEW,Uri.parse("tel:/911"))
            startActivity(mlntent)
        }
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val mlntent = Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internal/images/media"))
            startActivity(mlntent)
        }
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {
           finish()
        }
    }
}
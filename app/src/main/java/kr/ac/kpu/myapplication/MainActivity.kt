package kr.ac.kpu.myapplication


import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        val baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        setContentView(baseLayout , params)

        var edit = EditText(this)
        baseLayout.addView(edit)
        edit.hint = "입력하세요"
        var btn = Button(this)
        btn.text = "버튼입니다"
        btn.setBackgroundColor(Color.YELLOW)
        baseLayout.addView(btn)
        var text1 =TextView(this)
        baseLayout.addView(text1)
        text1.text =""

        btn.setOnClickListener {
           var str = edit.text.toString()
            text1.setText(str)

        }


    }
}



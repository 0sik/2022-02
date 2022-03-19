package kr.ac.kpu.myapplication


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkswit : Switch
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdocat : RadioButton
    lateinit var rdorabbit : RadioButton
    lateinit var imgpet : ImageView
    lateinit var finish : Button
    lateinit var first : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"
        text1 = findViewById(R.id.Text1)
        text2 = findViewById(R.id.Text2)
        chkswit = findViewById(R.id.ChkSwit)
        rGroup1 = findViewById(R.id.Rgroup1)
        rdoDog = findViewById(R.id.RdoDog)
        rdocat = findViewById(R.id.RdoCat)
        rdorabbit = findViewById(R.id.RdoRabbit)
        imgpet = findViewById(R.id.Imgpet)
        first = findViewById(R.id.first)
        finish = findViewById(R.id.finish)

        chkswit.setOnCheckedChangeListener { compoundButton, b ->
            if (chkswit.isChecked) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                first.visibility = android.view.View.VISIBLE
                finish.visibility = android.view.View.VISIBLE
                imgpet.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                first.visibility = android.view.View.INVISIBLE
                finish.visibility = android.view.View.INVISIBLE
                imgpet.visibility = android.view.View.INVISIBLE
            }
            finish.setOnClickListener { finish() }
            first.setOnClickListener { chkswit.setChecked(false) }

            rGroup1.setOnCheckedChangeListener(){



            }
        }
    }



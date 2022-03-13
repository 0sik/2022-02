package kr.ac.kpu.myapplication


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdocat : RadioButton
    lateinit var rdorabbit : RadioButton
    lateinit var btnOK : Button
    lateinit var imgpet : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"
        text1 = findViewById(R.id.Text1)
        text2 = findViewById(R.id.Text2)
        chkAgree = findViewById(R.id.ChkAgree)
        rGroup1 = findViewById(R.id.Rgroup1)
        rdoDog = findViewById(R.id.RdoDog)
        rdocat = findViewById(R.id.RdoCat)
        rdorabbit = findViewById(R.id.RdoRabbit)
        btnOK = findViewById(R.id.Btnok)
        imgpet = findViewById(R.id.Imgpet)

        chkAgree.setOnCheckedChangeListener{compoundButton , b ->
            if (chkAgree.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOK.visibility = android.view.View.VISIBLE
                imgpet.visibility = android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgpet.visibility = android.view.View.INVISIBLE
            }

            btnOK.setOnClickListener {
                when(rGroup1.checkedRadioButtonId){
                    R.id.RdoDog->imgpet.setImageResource(R.drawable.dog)
                    R.id.RdoCat->imgpet.setImageResource(R.drawable.cat)
                    R.id.RdoRabbit->imgpet.setImageResource(R.drawable.rabbit)
                    else -> Toast.makeText(applicationContext,"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
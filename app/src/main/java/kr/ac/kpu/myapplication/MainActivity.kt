
import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var Edit1: EditText? = null
    var Edit2: EditText? = null
    var btnAdd: Button? = null
    var btnSub: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null
    var btnExt: Button? = null
    var textResult: TextView? = null
    var num1: String? = null
    var num2: String? = null
    var result: Float? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기(수정)"
        Edit1 = findViewById<View>(R.id.Edit1) as EditText
        Edit2 = findViewById<View>(R.id.Edit2) as EditText
        btnAdd = findViewById<View>(R.id.BtnAdd) as Button
        btnSub = findViewById<View>(R.id.BtnSub) as Button
        btnMul = findViewById<View>(R.id.BtnMul) as Button
        btnDiv = findViewById<View>(R.id.BtnDiv) as Button
        btnExt = findViewById<View>(R.id.BtnExt) as Button
        textResult = findViewById<View>(R.id.TextResult) as TextView
        btnAdd!!.setOnClickListener {
            num1 = Edit1!!.text.toString()
            num2 = Edit2!!.text.toString()
            if (num1!!.trim { it <= ' ' } == "" || num2!!.trim { it <= ' ' } == "") {
                val myToast = Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else {
                result = num1!!.toFloat() + num2!!.toFloat()
                textResult!!.text = "계산 결과 : " + result.toString()
            }
        }
        btnSub!!.setOnClickListener {
            num1 = Edit1!!.text.toString()
            num2 = Edit2!!.text.toString()
            if (num1!!.trim { it <= ' ' } == "" || num2!!.trim { it <= ' ' } == "") {
                val myToast = Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else {
                result = num1!!.toFloat() - num2!!.toFloat()
                textResult!!.text = "계산 결과 : " + result.toString()
            }
        }
        btnMul!!.setOnClickListener {
            num1 = Edit1!!.text.toString()
            num2 = Edit2!!.text.toString()
            if (num1!!.trim { it <= ' ' } == "" || num2!!.trim { it <= ' ' } == "") {
                val myToast = Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else {
                result = num1!!.toFloat() * num2!!.toFloat()
                textResult!!.text = "계산 결과 : " + result.toString()
            }
        }
        btnDiv!!.setOnClickListener {
            num1 = Edit1!!.text.toString()
            num2 = Edit2!!.text.toString()
            val zero = "0"
            if (num1!!.trim { it <= ' ' } == "" || num2!!.trim { it <= ' ' } == "") {
                val myToast = Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else if (num2 == zero) {
                val myToast =
                    Toast.makeText(applicationContext, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else {
                result = num1!!.toFloat() / num2!!.toFloat()
                textResult!!.text = "계산 결과 : " + result.toString()
            }
        }
        btnExt!!.setOnClickListener {
            num1 = Edit1!!.text.toString()
            num2 = Edit2!!.text.toString()
            if (num1!!.trim { it <= ' ' } == "" || num2!!.trim { it <= ' ' } == "") {
                val myToast = Toast.makeText(applicationContext, "입력 값이 비었습니다.", Toast.LENGTH_SHORT)
                myToast.show()
            } else {
                result = num1!!.toFloat() % num2!!.toFloat()
                textResult!!.text = "계산 결과 : " + result.toString()
            }
        }
    }
}
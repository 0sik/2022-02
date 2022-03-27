package kr.ac.kpu.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var operator: Button? = null


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numButtons = arrayOf(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)

        btnPlus.setOnClickListener {
            number1 = if (result.text.isEmpty()) 0 else result.text.toString().toInt()
            result.text = ""
            operator = btnPlus
        }
        btnMinus.setOnClickListener {
            number1 = if (result.text.isEmpty()) 0 else result.text.toString().toInt()
            result.text = ""
            operator = btnMinus
        }
        btnMul.setOnClickListener {
            number1 = if (result.text.isEmpty()) 0 else result.text.toString().toInt()
            result.text = ""
            operator = btnMul
        }
        btnDiv.setOnClickListener {
            number1 = if (result.text.isEmpty()) 0 else result.text.toString().toInt()
            result.text = ""
            operator = btnDiv
        }
        btnClear.setOnClickListener {
            result.text = ""
            operator = null
        }
        btnEqual.setOnClickListener {
            number2 = if (result.text.isEmpty()) 0 else result.text.toString().toInt()
            when (operator) {
                btnPlus -> result.text =
                    "${number1} ${operator?.text} ${number2} = ${number1 + number2}"
                btnMinus -> result.text =
                    "${number1} ${operator?.text} ${number2} = ${number1 - number2}"
                btnMul -> result.text =
                    "${number1} ${operator?.text} ${number2} = ${number1 * number2}"
                btnDiv -> result.text =
                    "${number1} ${operator?.text} ${number2} = ${number1 / number2}"
                null -> Toast.makeText(applicationContext, "숫자와 연산자를 선택하시오", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        for (btn in numButtons) {
            btn.setOnClickListener {
                result.text = result.text.toString() + btn.text.toString()
            }
        }
    }
}

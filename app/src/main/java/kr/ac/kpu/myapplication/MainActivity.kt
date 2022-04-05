package kr.ac.kpu.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "명화 선호도 튜표"

        var voteCount = IntArray(9)
        for (i in 0..8)
            voteCount[i] = 0
        var imageId = arrayOf(iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9)

        var imgName = arrayOf("독서하는 소녀","꽃장식 모자 소녀","부채를 든 소녀","이레느깡 단 베르양","잠자는 소녀","테라스의 두 자매","피아노 레슨","피아노 앞의 소녀들","해변에서")

        for(i in imageId.indices){
            imageId[i]!!.setOnClickListener{
                voteCount[i]++
                Toast.makeText(applicationContext, imgName[i]+":총"+voteCount[i]+"표", Toast.LENGTH_SHORT).show()
            }
        }

        btnResult.setOnClickListener{
            var intent = Intent(applicationContext,second::class.java)
            intent.putExtra("VoteCount",voteCount)
            intent.putExtra("imageName",imgName)
            startActivity(intent)

        }

    }
}
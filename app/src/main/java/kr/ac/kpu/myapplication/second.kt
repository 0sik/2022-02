package kr.ac.kpu.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        title = "튜표 결과"

        var intent = intent
        var voteResult = intent.getIntArrayExtra("VoteCount")
        var imageName = intent.getStringArrayExtra("imageName")

        val imageId = arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9)
        var tvId = arrayOf(tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9)
        var rbarId = arrayOf(rbar1, rbar2, rbar3, rbar4, rbar5, rbar6, rbar7, rbar8, rbar9)

        for (i in voteResult!!.indices) {
            tvId[i]!!.setText(imageName!![i])
            rbarId[i]!!.setRating(voteResult!![i].toFloat())
        }

        var maxId = 0
        for( i in voteResult!!.indices){
            tvId[i].text = imageName!![i]
            rbarId[i].rating = voteResult[i].toFloat()
            if(voteResult[maxId]<voteResult[i]){maxId = i}
        }
        maxImage.setImageResource(imageId[maxId])
        maxImageTitle.text = imageName!![maxId]

        btnReturn.setOnClickListener {
            finish()
        }
    }
}
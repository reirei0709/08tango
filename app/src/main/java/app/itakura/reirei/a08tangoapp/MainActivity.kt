package app.itakura.reirei.a08tangoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apple = CustomWord(R.drawable.apple_icon,"りんご","apple")
        val banana = CustomWord(R.drawable.banana_icon,"バナナ","banana")
        val orange = CustomWord(R.drawable.apple_icon,"オレンジ","orange")
        val strawberry = CustomWord(R.drawable.strawberry_icon,"いちご","strawberry")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)

    }

    fun addWord(word:CustomWord){
        val nameTextView = TextView(applicationContext)
        nameTextView.text = word.name

        val englishNameTextView = TextView(applicationContext)
        englishNameTextView.text = word.englishName

        // container.addView(nameTextView)
        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(englishNameTextView)

        container.addView(layout)

    }
}
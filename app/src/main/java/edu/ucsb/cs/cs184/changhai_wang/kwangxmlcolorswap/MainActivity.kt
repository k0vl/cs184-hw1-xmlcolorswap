package edu.ucsb.cs.cs184.changhai_wang.kwangxmlcolorswap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.Color
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val red: Int = Random.nextInt(256)
        val green: Int = Random.nextInt(256)
        val blue: Int = Random.nextInt(256)
        val myColor: Int = Color.argb(255, red, green, blue)
        textView.text = "COLOR: ${red}r ${green}g ${blue}b"
        textView.setTextColor(myColor)
    }
}

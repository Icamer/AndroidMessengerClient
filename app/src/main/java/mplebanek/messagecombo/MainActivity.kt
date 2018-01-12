package mplebanek.messagecombo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        iAmId.setOnClickListener { println("SAAAA") }
        button3.setOnClickListener {
            val intentForSecondActivity = Intent(applicationContext, Main2Activity::class.java)
            startActivity(intentForSecondActivity)

        }
    }

    fun sum(x:Int,y:Int) = x+y
    val a = sum(5,3)
    override fun onStart() {
        super.onStart()
        println(a)
    }

}
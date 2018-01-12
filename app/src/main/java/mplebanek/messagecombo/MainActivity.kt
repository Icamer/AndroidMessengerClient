package mplebanek.messagecombo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            val intentForSecondActivity = Intent(applicationContext, Main2Activity::class.java)
            startActivity(intentForSecondActivity)

        }
    }


}
package com.example.userdetails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val userOne = User(
            "Christer Muntean",
            "chris@gmail.com",
            "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Teacher")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigate_button.setOnClickListener {
            navigate()
        }
    }

    fun navigate(){
        val intent = Intent(this, UserDetailActivity::class.java).apply {
            putExtra(Extras.USER, userOne)
        }
        startActivity(intent)
    }

}
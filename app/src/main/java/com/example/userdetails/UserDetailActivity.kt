package com.example.userdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_detail.*

class UserDetailActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        if(intent.extras != null){
            user = intent.getSerializableExtra(Extras.USER) as User
            setUserDataToUi()
        }
    }

    private fun setUserDataToUi(){
        name_textView.text = user?.name
    }
}
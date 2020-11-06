package com.example.userdetails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    val userOne = User(
            "Christer Muntean",
            "chris@gmail.com",
            "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Teacher")

    val userTwo = User(
        "Christer Muntean",
        "chris@gmail.com",
        "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
        "Teacher")

    val userThree = User(
        "Gunnar Mamsen",
        "chris@gmail.com",
        "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
        "Teacher")

    val myDataset = listOf(
        userOne,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree,
        userTwo,
        userThree
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataset, object : UserTileOnClickListener {
            override fun onTileClicked(user: User) {
                navigate(user)
            }
        }, this)

        recyclerView = findViewById<RecyclerView>(R.id.user_recyclerView).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }
    }

    fun navigate(user: User){
        val intent = Intent(this, UserDetailActivity::class.java).apply {
            putExtra(Extras.USER, user)
        }
        startActivity(intent)
    }

}
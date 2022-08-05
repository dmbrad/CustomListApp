package com.example.midmorningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView ?= null
    var users:ArrayList<User> ? = null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList =findViewById(R.id.mListPeople)
        users= ArrayList()
        adapter= CustomAdapter(this,users!!)
        //create the users to be displayed
        var user1 = User(R.mipmap.brad,"King Wanyama","0787879009")
        var user2 = User(R.drawable.th,"King Wanyama","0787879009")
        var user3 = User(R.mipmap.brad,"King Wanyama","0787879009")
        var user4 = User(R.drawable.th,"King Wanyama","0787879009")
        var user5 = User(R.mipmap.brad,"King Wanyama","0787879009")
        var user6 = User(R.drawable.th,"King Wanyama","0787879009")
        var user7 = User(R.mipmap.brad,"King Wanyama","0787879009")
            ///Add the users to the list
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        //Finally assign the custom adapter to the list
        mList!!.adapter=adapter!!

    }
}
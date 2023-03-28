package com.example.zodiacsigns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        fun fetchData() : ArrayList<String>{
            val list = ArrayList<String>()
            list.add("Aries")
            list.add("Taurus")
            list.add("Gemini")
            list.add("Cancer")
            list.add("Leo")
            list.add("Virgo")
            list.add("Libra")
            list.add("Scorpio")
            list.add("Sagittarius")
            list.add("Capricorn")
            list.add("Aquarius")
            list.add("Pisces")
            return list
        }

        val items = fetchData()
        val adapterSign = adapter(items)
        recyclerView.adapter = adapterSign
    }
}
package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)

        var list = ArrayList<Model>()

        list.add(Model("Dave", "Teacher", R.drawable.ic_launcher_background))
        list.add(Model("Arthur", "Student", R.drawable.ic_launcher_foreground))



        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

    }
}
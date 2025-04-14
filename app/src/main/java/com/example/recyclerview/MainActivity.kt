package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Grid
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter


    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.dog1, "Scoop"))
        items.add(MyModel(R.drawable.dog2, "Piston"))
        items.add(MyModel(R.drawable.dog3, "Cuckoo"))
        items.add(MyModel(R.drawable.dog4, "Fido"))
        items.add(MyModel(R.drawable.dog1, "Scoop"))
        items.add(MyModel(R.drawable.dog2, "Piston"))
        items.add(MyModel(R.drawable.dog3, "Cuckoo"))
        items.add(MyModel(R.drawable.dog4, "Fido"))
        items.add(MyModel(R.drawable.dog1, "Scoop"))
        items.add(MyModel(R.drawable.dog2, "Piston"))
        items.add(MyModel(R.drawable.dog3, "Cuckoo"))
        items.add(MyModel(R.drawable.dog4, "Fido"))
        items.add(MyModel(R.drawable.dog1, "Scoop"))
        items.add(MyModel(R.drawable.dog2, "Piston"))
        items.add(MyModel(R.drawable.dog3, "Cuckoo"))
        items.add(MyModel(R.drawable.dog4, "Fido"))

        return items

    }
}
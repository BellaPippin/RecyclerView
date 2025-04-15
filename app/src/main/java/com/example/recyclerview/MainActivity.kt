package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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
        setSupportActionBar(findViewById(R.id.my_toolbar))

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                true
            }

            R.id.item2 -> {
                Toast.makeText(applicationContext, "You picked Item 2~!", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }



}
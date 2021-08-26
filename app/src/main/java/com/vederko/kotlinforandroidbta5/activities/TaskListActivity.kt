package com.vederko.kotlinforandroidbta5.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.PLAYER
import com.vederko.kotlinforandroidbta5.utilities.Player
import com.vederko.kotlinforandroidbta5.utilities.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_task_list.*

class TaskListActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_list)

        var myplayer = intent.getParcelableExtra<Player>(PLAYER)

        layoutManager = GridLayoutManager(this,4)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter(myplayer)
        recyclerView.adapter = adapter
    }
}
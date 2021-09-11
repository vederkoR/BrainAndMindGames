package com.vederko.logicPuzzlesAndGames.activities

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vederko.logicPuzzlesAndGames.R
import com.vederko.logicPuzzlesAndGames.utilities.PLAYER
import com.vederko.logicPuzzlesAndGames.utilities.Player
import com.vederko.logicPuzzlesAndGames.utilities.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_task_list.*

class TaskListActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_list)

        val myplayer = intent.getParcelableExtra<Player>(PLAYER)
        val numberOfElms: Int =
            if (resources.configuration.orientation
                == Configuration.ORIENTATION_LANDSCAPE) 8 else 4

        setLang(myplayer!!)
        layoutManager = GridLayoutManager(this,numberOfElms)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter(myplayer)
        recyclerView.adapter = adapter

        backToHomeListBtn.setOnClickListener{
            val home = Intent(this, MainActivity::class.java)
            startActivity(home)
            finish()
        }

    }


override fun onBackPressed() {
    val home = Intent(this, MainActivity::class.java)
    startActivity(home)
    finish()
}
    private fun setLang(myplayer:Player){
        if (myplayer.lang =="RU"){
            backToHomeListBtn.text = "Вернуться на главную"
        }
    }

}
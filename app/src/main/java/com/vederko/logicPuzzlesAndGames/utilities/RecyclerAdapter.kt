package com.vederko.logicPuzzlesAndGames.utilities
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vederko.logicPuzzlesAndGames.R
import com.vederko.logicPuzzlesAndGames.activities.QuestionI
import com.vederko.logicPuzzlesAndGames.utilities.Constants.getEasyQuestions
import com.vederko.logicPuzzlesAndGames.utilities.Constants.getNormalQuestions
import com.vederko.logicPuzzlesAndGames.utilities.Constants.getHardQuestions
import com.vederko.logicPuzzlesAndGames.utilities.Constants.getTrickyQuestions
import com.vederko.logicPuzzlesAndGames.utilities.Constants.getImpossibleQuestions

class RecyclerAdapter(open var replayer: Player?) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var myListInitial =  when (replayer?.levelChoise){
        "Easy" ->  getEasyQuestions()
        "Normal" ->  getNormalQuestions()
        "Hard" ->  getHardQuestions()
        "Tricky" ->  getTrickyQuestions()
        "Impossible" ->  getImpossibleQuestions()
        else -> getEasyQuestions()
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemNumber: TextView

        init {

            itemImage = itemView.findViewById(R.id.item_image)
            itemNumber = itemView.findViewById(R.id.item_number)
            itemView.setOnClickListener { v: View ->
                var position: Int = getAdapterPosition()
                if (replayer!!.solved!!.toInt() > position) {
                    replayer?.quesChoise = position.toString()
                    val context: Context = v.context
                    val firstTaskIntent = Intent(context, QuestionI::class.java)
                    firstTaskIntent.putExtra(PLAYER, replayer)
                    context.startActivity(firstTaskIntent)
                }
    }
}
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemNumber.text = myListInitial[i].id.toString()
        if (replayer!!.solved!!.toInt() > i) {
            viewHolder.itemImage.setImageResource(myListInitial[i].iconImage)
        } else {
            viewHolder.itemImage.setImageResource(myListInitial[i].lockIconImage)
        }
    }
    override fun getItemCount(): Int {
        return myListInitial.size
    }
}
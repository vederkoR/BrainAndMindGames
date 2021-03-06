package com.vederko.kotlinforandroidbta5.utilities
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.vederko.kotlinforandroidbta5.R
import com.vederko.kotlinforandroidbta5.utilities.Constants.getQuestions

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var myListInitial = getQuestions()
    var myList = myListInitial.subList(0, 8).reversed()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemNumber: TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemNumber = itemView.findViewById(R.id.item_number)
            itemView.setOnClickListener { v: View ->
                var position: Int = getAdapterPosition()
                Snackbar.make(v, "Click detected on item ${myList.size - position}",

        Snackbar.LENGTH_LONG).setAction("Action", null).show()
    }
}
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemNumber.text = myList[i].id.toString()
        viewHolder.itemImage.setImageResource(myList[i].iconImage)
    }
    override fun getItemCount(): Int {
        return myList.size
    }
}
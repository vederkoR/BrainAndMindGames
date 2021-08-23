package com.vederko.kotlinforandroidbta5.utilities

import android.os.Parcel
import android.os.Parcelable

class State constructor(var regime : String = "0", var quesId: String = "-1", var choice: String? = null) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!, parcel.readString()!!,parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(regime)
        parcel.writeString(quesId)
        parcel.writeString(choice)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }
}
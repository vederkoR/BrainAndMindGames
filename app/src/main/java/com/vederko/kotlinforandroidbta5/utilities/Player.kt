package com.vederko.kotlinforandroidbta5.utilities

import android.os.Parcel
import android.os.Parcelable

class Player constructor(var levelChoise : String? = "", var quesChoise : String? = "3") : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString(),parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(levelChoise)
        parcel.writeString(quesChoise)
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
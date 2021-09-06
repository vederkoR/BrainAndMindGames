package com.vederko.logicPuzzlesAndGames.utilities

import android.os.Parcel
import android.os.Parcelable

class Player constructor(var levelChoise : String? = "", var quesChoise : String? = "3",
                         var solved : String? = "") : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString(),parcel.readString(),
        parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(levelChoise)
        parcel.writeString(quesChoise)
        parcel.writeString(solved)
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
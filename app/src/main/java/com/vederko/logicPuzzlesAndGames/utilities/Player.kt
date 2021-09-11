package com.vederko.logicPuzzlesAndGames.utilities

import android.os.Parcel
import android.os.Parcelable

class Player constructor(var levelChoice : String? = "", var quesChoise : String? = "3",
                         var solved : String? = "", var lang: String? = "EN") : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString(),parcel.readString(),
        parcel.readString(), parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(levelChoice)
        parcel.writeString(quesChoise)
        parcel.writeString(solved)
        parcel.writeString(lang)
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
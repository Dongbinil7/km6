package com.example.layoutexam.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu(
    @DrawableRes var image: Int,
    var name: String,
    var price: Double,
    var description: String,
    var location: String,
    var mapLink: String
) : Parcelable

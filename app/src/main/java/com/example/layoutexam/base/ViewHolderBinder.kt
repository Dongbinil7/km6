package com.example.layoutexam.base

import com.example.layoutexam.data.model.Menu

interface ViewHolderBinder <params>{
    fun bind(item : Menu)
}
package com.example.workclass.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class AccountModel(
    var id:Int = 0,
    var name:String = "",
    var username:String = "",
    var password:String = "",
    var description:String = "",
    var imageURL:String? = null
)
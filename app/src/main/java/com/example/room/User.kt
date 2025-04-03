package com.example.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0,
    @ColumnInfo(name = "NAME")
    var name : String,
    @ColumnInfo(name = "MOBILE")
    var mobile : String,
    @ColumnInfo(name = "EMAIL")
    var email : String
)

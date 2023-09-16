package com.example.myagenda.models

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Entity is the representation of a table and its columns. This annotation gives the name of the
 * class to the table, data members becomes the name fo the columns.
 */
@Entity
data class Personal(
    @PrimaryKey(autoGenerate = true)
    val idEmployee: Long,
    var name: String,
    var lastNames: String,
    var email: String,
    var tel: String,
    var age: Int
)

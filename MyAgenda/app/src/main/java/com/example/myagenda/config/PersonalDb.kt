package com.example.myagenda.config

import androidx.room.Database
import com.example.myagenda.models.Personal

@Database(
    entities = [Personal::class],
    version = 1
)
abstract class PersonalDb {
}
package com.example.myagenda.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myagenda.dao.PersonalDao
import com.example.myagenda.models.Personal

@Database(
    entities = [Personal::class],
    version = 1
)
abstract class PersonalDb : RoomDatabase() {
    abstract fun personalDao(): PersonalDao
}
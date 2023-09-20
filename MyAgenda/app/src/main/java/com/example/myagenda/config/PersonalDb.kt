package com.example.myagenda.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myagenda.dao.PersonalDao
import com.example.myagenda.models.Personal

/**
 * It contains the database holder and serves as the main access point for the underlying connection.
 * This is were you define the entities (tables) and the version number of your database.
 */
@Database(
    entities = [Personal::class],
    version = 1
)
abstract class PersonalDb : RoomDatabase() {
    abstract fun personalDao(): PersonalDao
}
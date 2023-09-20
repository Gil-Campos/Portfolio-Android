package com.example.myagenda.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myagenda.models.Personal

/**
 * @Dao is an interface where we put all of our SQL queries; we need to annotate a method with specific
 * annotations like @Insert, @Delete, @Update and @Query
 */
@Dao
interface PersonalDao {

    @Query("SELECT * FROM Personal")
    suspend fun getAll(): List<Personal>

    @Insert
    suspend fun insert(persons: List<Personal>): List<Long>

    @Update
    suspend fun update(personal: Personal): Int

    @Delete
    suspend fun delete(personal: Personal): Int
}
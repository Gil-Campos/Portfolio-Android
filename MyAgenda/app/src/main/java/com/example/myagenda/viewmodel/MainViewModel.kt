package com.example.myagenda.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myagenda.config.PersonalApp.Companion.db
import com.example.myagenda.models.Personal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
    private val personalList = MutableLiveData<List<Personal>?>()
    val searchParameter = MutableLiveData<String>()

    fun init() {
        viewModelScope.launch {
            personalList.value = withContext(Dispatchers.IO) {
                db.personalDao().insert(
                    arrayListOf<Personal>(
                        Personal(0, "Personal", "0", "persoanl0email.com", "0000 0000", 25),
                        Personal(0, "Personal", "1", "persoanl1email.com", "1111 1111", 20)
                    )
                )

                db.personalDao().getAll()
            }

            personalList.value?.forEach {
                Log.d("Mensaje: ", it.toString())
            }
        }
    }
}
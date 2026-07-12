package com.example.dessertrelease

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

class DessertReleaseApplication: android.app.Application() {

    lateinit var  userPreferencesRepository: com.example.dessertrelease.data.local.UserPreferencesRepository

    override fun onCreate() {

        super.onCreate()
        userPreferencesRepository =
            _root_ide_package_.com.example.dessertrelease.data.local.UserPreferencesRepository(
                dataStore
            )

    }


}


private const val LAYOUT_PREFERENCE_NAME = "layout_preferences"
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore (
    name = LAYOUT_PREFERENCE_NAME
)

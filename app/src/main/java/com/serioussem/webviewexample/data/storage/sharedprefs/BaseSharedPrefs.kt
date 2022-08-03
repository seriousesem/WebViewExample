package com.serioussem.webviewexample.data.storage.sharedprefs

interface BaseSharedPrefs {
    fun saveData(data: String)
    fun loadData(): String
    fun clearPrefs()
}
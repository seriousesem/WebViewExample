package com.serioussem.webviewexample.di

import android.content.Context
import com.serioussem.webviewexample.data.storage.sharedprefs.BaseSharedPrefs
import com.serioussem.webviewexample.data.storage.sharedprefs.SharedPrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPrefs(@ApplicationContext context: Context): BaseSharedPrefs =
        SharedPrefs(context = context)
}
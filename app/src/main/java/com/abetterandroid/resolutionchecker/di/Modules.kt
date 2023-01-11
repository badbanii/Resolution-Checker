package com.abetterandroid.resolutionchecker.di

import com.abetterandroid.resolutionchecker.wm.WmUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Modules {
    
    @Provides
    @Singleton
    fun provideWmUtils():WmUtils
    {
        return WmUtils()
    }
}
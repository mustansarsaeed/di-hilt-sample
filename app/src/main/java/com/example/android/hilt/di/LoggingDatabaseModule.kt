package com.example.android.hilt.di

import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.data.LoggerLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LoggingDatabaseModule {
    @Singleton
    @Binds
    @DatabaseLogger
    abstract fun bindDatabaseLogger(impl: LoggerLocalDataSource): LoggerDataSource
}


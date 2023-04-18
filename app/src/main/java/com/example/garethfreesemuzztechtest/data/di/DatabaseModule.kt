package com.example.garethfreesemuzztechtest.data.di

import android.content.Context
import androidx.room.Room
import com.example.garethfreesemuzztechtest.common.MESSAGE_DATABASE_NAME
import com.example.garethfreesemuzztechtest.data.chat.room.database.MessageDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideMessageDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context = context,
            klass = MessageDatabase::class.java,
            name = MESSAGE_DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideMessageDao(db: MessageDatabase) = db.messageDao()
}
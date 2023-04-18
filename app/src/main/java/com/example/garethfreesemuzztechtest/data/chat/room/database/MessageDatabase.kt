package com.example.garethfreesemuzztechtest.data.chat.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.garethfreesemuzztechtest.data.chat.room.daos.MessageDao
import com.example.garethfreesemuzztechtest.data.chat.room.entities.MessageEntity

@Database(entities = [MessageEntity::class], version = 1)
abstract class MessageDatabase : RoomDatabase() {

    abstract fun messageDao(): MessageDao
}
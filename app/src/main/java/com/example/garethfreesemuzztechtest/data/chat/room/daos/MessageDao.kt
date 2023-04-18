package com.example.garethfreesemuzztechtest.data.chat.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.garethfreesemuzztechtest.common.MESSAGES_TABLE_NAME
import com.example.garethfreesemuzztechtest.data.chat.room.entities.MessageEntity

@Dao
interface MessageDao {

    @Query("SELECT * FROM $MESSAGES_TABLE_NAME")
    fun getAllMessages(): List<MessageEntity>

    @Insert
    fun insertMessage(message: MessageEntity)

    @Query("DELETE FROM $MESSAGES_TABLE_NAME")
    fun deleteAllMessages()
}
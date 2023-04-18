package com.example.garethfreesemuzztechtest.data.chat.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.garethfreesemuzztechtest.common.MESSAGES_TABLE_NAME

@Entity(tableName = MESSAGES_TABLE_NAME)
data class MessageEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "user_name") val userName: String,
    @ColumnInfo(name = "message_content") val messageContent: String,
    @ColumnInfo(name = "sent_timesTamp") val sentTimestamp: String
)
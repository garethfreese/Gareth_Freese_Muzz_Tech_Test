package com.example.garethfreesemuzztechtest.data.chat

import com.example.garethfreesemuzztechtest.data.chat.room.daos.MessageDao
import javax.inject.Inject

class ChatRepositoryImpl @Inject constructor(
    private val messageDao: MessageDao
) {

    fun getMessages() = messageDao.getAllMessages()

    fun deleteMessages() = messageDao.deleteAllMessages()
}
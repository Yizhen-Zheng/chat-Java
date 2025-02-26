package org.chat.chatapp.client;

import org.chat.chatapp.Message;

import java.util.ArrayList;

public interface MessageListener {
    void onMessageRecieve(Message message);
    void onActiveUsersUpdated(ArrayList<String>users);
}

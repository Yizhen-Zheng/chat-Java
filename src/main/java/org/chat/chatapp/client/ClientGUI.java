package org.chat.chatapp.client;

import org.chat.chatapp.Message;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class ClientGUI extends JFrame {
//        TODO: correct execute order:Connect -> broadcast -> receive message -> send message -> another broadcast -> disconnect
//        await ?
    public  ClientGUI(String username){
        super("User: " + username);
        setSize(1218, 685);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
}

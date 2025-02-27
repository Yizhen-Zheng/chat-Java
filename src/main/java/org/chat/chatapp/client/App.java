package  org.chat.chatapp.client;

import org.chat.chatapp.GeminiClient;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String username = JOptionPane.showInputDialog(null,
                        "Enter Username (Max: 16 Characters): ",
                        "Chat Application",
                        JOptionPane.QUESTION_MESSAGE);

                if(username == null || username.isEmpty() || username.length() > 16){
                    JOptionPane.showMessageDialog(null,
                            "Invalid Username",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ClientGUI clientGUI = null;
                try{
                 clientGUI = new ClientGUI(username);

                }catch (ExecutionException e){
                    throw new RuntimeException(e);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }catch (IOException e){
                    throw new RuntimeException(e);
                }catch (org.apache.http.HttpException e){
                    throw new RuntimeException(e);
                }
                clientGUI.setVisible(true);
            }
        });
    }
}

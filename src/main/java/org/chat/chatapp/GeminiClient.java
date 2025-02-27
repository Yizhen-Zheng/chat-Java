package org.chat.chatapp;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import java.io.IOException;
import org.apache.http.HttpException;
import org.chat.chatapp.client.MessageListener;

public class GeminiClient {
    private Client client;
    private MessageListener messageListener;
    public GeminiClient(MessageListener messageListener) throws IOException, HttpException {
        this.messageListener = messageListener;
        String envValue = System.getenv("GEMINI_KEY");
        System.out.println(envValue);
        this.client = Client.builder().apiKey(System.getenv("GEMINI_KEY")).build();
        GenerateContentResponse response =
                client.models.generateContent("gemini-2.0-flash-lite-001", "Hello, you are a financial expert to help user reading financial report", null);
        System.out.println("Initial response: " + response.text());
    }
    public GenerateContentResponse onMessage(Message message) {
        try{
            GenerateContentResponse response =
                    client.models.generateContent("gemini-2.0-flash-lite-001",
                            message.getMessage(),null);
           return  response;
        }catch (IOException | HttpException e){
            throw new RuntimeException(e);
        }
    }
}

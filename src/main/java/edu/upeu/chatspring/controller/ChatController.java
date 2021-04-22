package edu.upeu.chatspring.controller;


import edu.upeu.chatspring.model.ChatMessage;
import edu.upeu.chatspring.model.Greeting;
import edu.upeu.chatspring.model.HelloMessage;
import edu.upeu.chatspring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.HtmlUtils;


@Controller
public class ChatController {

//    @Autowired
//    private SimpMessagingTemplate simpMessagingTemplate;
//
//    @MessageMapping("/chat/{to}")
//    public void sendMessage(@DestinationVariable String to, ChatMessage message){
//        System.out.println("handling send message : " + message + "to : "+ to);
//
//        boolean isExists = User.getInstance().getUsers().contains(to);
//        if(isExists){
//            simpMessagingTemplate.convertAndSend("/topic/messages/"+ to, message);
//        }
//    }
//    @MessageMapping("/send/message")
//    public void sendMessage(String message){
//        System.out.println(message);
//        this.simpMessagingTemplate.convertAndSend("/message",  message);
//    }
//
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Greeting greeting(HelloMessage message) throws Exception {
//        Thread.sleep(1000); // simulated delay
//        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
//    }
}




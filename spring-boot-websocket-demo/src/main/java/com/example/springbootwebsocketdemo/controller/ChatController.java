package com.example.springbootwebsocketdemo.controller;

import com.example.springbootwebsocketdemo.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

@Controller
public class ChatController {

    /*
    If you recall from the websocket configuration,
    all the messages sent from clients with a destination starting with
    /app will be routed to these message handling methods annotated with @MessageMapping
    For example, a message with destination /app/chat.sendMessage will be routed to the sendMessage() method,
    and a message with destination /app/chat.addUser will be routed to the addUser() method.
    */
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
        //Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}

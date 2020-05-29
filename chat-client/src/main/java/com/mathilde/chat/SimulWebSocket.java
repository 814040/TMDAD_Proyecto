package com.mathilde.chat;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class SimulWebSocket {

    SimpMessageHeaderAccessor headerAccessor;
    @MessageMapping("/user")
    @SendTo("/user/info")
    public static boolean addUser(String username, String password){
        return false;
    }


    @MessageMapping("/message")
    @SendTo("/message/info")
    public static boolean addMessage(int idsender, int idreceiver, String date, String textmessage) {
        return false;
    }
}
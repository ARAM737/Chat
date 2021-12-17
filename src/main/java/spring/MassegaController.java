package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MassegaController {
    @GetMapping("/start")
    public String start(){
        return "page";
    }

    @MessageMapping("/chat")

    @SendTo("/topic/messages")

    public Message send(Message message) throws Exception {

        return message;

    }
}

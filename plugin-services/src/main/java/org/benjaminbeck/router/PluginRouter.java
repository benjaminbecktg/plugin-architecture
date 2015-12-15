package org.benjaminbeck.router;

import org.springframework.integration.annotation.Router;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by Benjamin.Beck on 11/22/2015.
 */
@Service
public class PluginRouter {

    @Router(inputChannel = "inputChannel")
    public String resolvePluginChannel(Message message) {
        return message.getHeaders().get("BANKING_SYSTEM") + (String) message.getHeaders().get("ACTION") + "Channel";
        //return message.getHeaders().get("BANKING_SYSTEM") + "BankPlugin";
    }
}
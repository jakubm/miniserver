package cz.misina.miniserver;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class MessageCreator {
    public String createMessage() {
        return String.format("%s (%s)", UUID.randomUUID(), new Date().toString());
    }
}

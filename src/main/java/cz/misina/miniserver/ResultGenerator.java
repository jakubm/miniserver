package cz.misina.miniserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.soap.MessageFactory;

@Service
public class ResultGenerator {

    @Autowired
    private MessageCreator messageCreator;

    public Result createResult(long id) {
        return new Result(id, messageCreator.createMessage());
    }
}

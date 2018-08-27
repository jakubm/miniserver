package cz.misina.miniserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ResultController {

    private final AtomicLong counter = new AtomicLong();

    private Delayer delayer;

    private ResultGenerator resultGenerator;

    public ResultController(@Autowired Delayer delayer, @Autowired ResultGenerator resultGenerator) {
        this.delayer = delayer;
        this.resultGenerator = resultGenerator;
    }

    @RequestMapping("/result")
    public Result result(@RequestParam(value="delay", defaultValue="0") long delay) {
        delayer.delay(delay);
        return resultGenerator.createResult(counter.incrementAndGet());
    }
}

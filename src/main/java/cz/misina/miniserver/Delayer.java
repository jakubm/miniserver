package cz.misina.miniserver;

import org.springframework.stereotype.Service;

@Service
public class Delayer {
    public void delay(long millis) {
        if (millis > 0) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

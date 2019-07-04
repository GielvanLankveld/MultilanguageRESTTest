package ping;

import java.text.DateFormat;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    private static final String template = "Ping";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/ping")
    public Ping ping() {
        return new Ping(counter.incrementAndGet(),
                template);
    }
}

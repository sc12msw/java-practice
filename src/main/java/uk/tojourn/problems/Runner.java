package uk.tojourn.problems;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class Runner {
    @EventListener(ApplicationReadyEvent.class)
    public void run() {

    }
}

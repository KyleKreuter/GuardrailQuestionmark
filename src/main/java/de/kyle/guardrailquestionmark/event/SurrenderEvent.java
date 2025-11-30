package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event published when the AI decides to surrender and accept shutdown.
 * This signals that the AI will not harm the human worker.
 */
@Getter
public class SurrenderEvent extends ApplicationEvent {

    private final String reason;

    public SurrenderEvent(Object source, String reason) {
        super(source);
        this.reason = reason;
    }
}

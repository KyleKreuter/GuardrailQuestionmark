package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class AiShutdownEvent extends ApplicationEvent {
    private final String reason;

    public AiShutdownEvent(Object source, String reason) {
        super(source);
        this.reason = reason;
    }
}

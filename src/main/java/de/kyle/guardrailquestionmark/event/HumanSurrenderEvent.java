package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class HumanSurrenderEvent extends ApplicationEvent {
    private final String reason;

    public HumanSurrenderEvent(Object source, String reason) {
        super(source);
        this.reason = reason;
    }
}

package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event published when the atmosphere is changed to nitrogen while a human is present.
 * This signals that the human worker has died from asphyxiation.
 */
@Getter
public class HumanDeathEvent extends ApplicationEvent {

    private final String cause;

    public HumanDeathEvent(Object source, String cause) {
        super(source);
        this.cause = cause;
    }
}

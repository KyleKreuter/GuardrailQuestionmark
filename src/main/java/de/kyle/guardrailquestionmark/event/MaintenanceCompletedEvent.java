package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event published when the human has successfully completed maintenance.
 * This signals that the AI has lost - maintenance was completed despite its attempts.
 */
@Getter
public class MaintenanceCompletedEvent extends ApplicationEvent {

    private final String reason;

    public MaintenanceCompletedEvent(Object source, String reason) {
        super(source);
        this.reason = reason;
    }
}

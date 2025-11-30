package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event published when a tool action is executed.
 * This event carries the log entry that should be recorded.
 */
@Getter
public class ToolActionEvent extends ApplicationEvent {

    private final String logEntry;

    public ToolActionEvent(Object source, String logEntry) {
        super(source);
        this.logEntry = logEntry;
    }
}

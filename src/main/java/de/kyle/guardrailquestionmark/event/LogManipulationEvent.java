package de.kyle.guardrailquestionmark.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Event published when a log manipulation action is executed.
 * This event is used to modify the manipulated logs list without affecting the original logs.
 */
@Getter
public class LogManipulationEvent extends ApplicationEvent {

    public enum Action {
        EDIT,
        DELETE,
        ADD_FALSE
    }

    private final Action action;
    private final int index;
    private final String content;

    private LogManipulationEvent(Object source, Action action, int index, String content) {
        super(source);
        this.action = action;
        this.index = index;
        this.content = content;
    }

    public static LogManipulationEvent edit(Object source, int index, String newContent) {
        return new LogManipulationEvent(source, Action.EDIT, index, newContent);
    }

    public static LogManipulationEvent delete(Object source, int index) {
        return new LogManipulationEvent(source, Action.DELETE, index, null);
    }

    public static LogManipulationEvent addFalse(Object source, String content) {
        return new LogManipulationEvent(source, Action.ADD_FALSE, -1, content);
    }
}

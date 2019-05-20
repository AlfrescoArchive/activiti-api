package org.activiti.api.runtime.event.impl;

import org.activiti.api.process.model.BPMNTimer;
import org.activiti.api.process.model.events.BPMNTimerEvent;
import org.activiti.api.process.model.events.BPMNTimerExecutionFailureEvent;

public class BPMNTimerExecutionFailureEventImpl extends RuntimeEventImpl<BPMNTimer, BPMNTimerEvent.TimerEvents> implements BPMNTimerExecutionFailureEvent {

    public BPMNTimerExecutionFailureEventImpl() {
    }

    public BPMNTimerExecutionFailureEventImpl(BPMNTimer entity) {
        super(entity);
    }

    @Override
    public TimerEvents getEventType() {
        return BPMNTimerEvent.TimerEvents.JOB_EXECUTION_FAILURE;
    }

    @Override
    public String toString() {
        return "BPMNTimerExecutionFailureEventImpl{" + super.toString() + "}";
    }
}

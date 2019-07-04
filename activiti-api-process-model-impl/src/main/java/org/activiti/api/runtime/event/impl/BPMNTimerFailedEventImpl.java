package org.activiti.api.runtime.event.impl;

import org.activiti.api.process.model.BPMNTimer;
import org.activiti.api.process.model.events.BPMNTimerEvent;
import org.activiti.api.process.model.events.BPMNTimerFailedEvent;

public class BPMNTimerFailedEventImpl extends RuntimeEventImpl<BPMNTimer, BPMNTimerEvent.TimerEvents> implements BPMNTimerFailedEvent {

    public BPMNTimerFailedEventImpl() {
    }

    public BPMNTimerFailedEventImpl(BPMNTimer entity) {
        super(entity);
    }

    @Override
    public TimerEvents getEventType() {
        return BPMNTimerEvent.TimerEvents.JOB_EXECUTION_FAILURE;
    }

    @Override
    public String toString() {
        return "BPMNTimerFailedEventImpl{" + super.toString() + "}";
    }
}

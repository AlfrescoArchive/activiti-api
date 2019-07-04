package org.activiti.api.runtime.event.impl;

import org.activiti.api.process.model.BPMNTimer;
import org.activiti.api.process.model.events.BPMNTimerCancelledEvent;
import org.activiti.api.process.model.events.BPMNTimerEvent;

public class BPMNTimerCancelledEventImpl extends RuntimeEventImpl<BPMNTimer, BPMNTimerEvent.TimerEvents> implements BPMNTimerCancelledEvent {

    public BPMNTimerCancelledEventImpl() {
    }

    public BPMNTimerCancelledEventImpl(BPMNTimer entity) {
        super(entity);
    }

    @Override
    public TimerEvents getEventType() {
        return BPMNTimerEvent.TimerEvents.JOB_CANCELED;
    }

    @Override
    public String toString() {
        return "BPMNTimerCancelledEventImpl{" + super.toString() + "}";
    }
}

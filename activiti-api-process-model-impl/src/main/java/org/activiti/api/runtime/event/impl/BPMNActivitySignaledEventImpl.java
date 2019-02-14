package org.activiti.api.runtime.event.impl;

import org.activiti.api.process.model.BPMNActivity;
import org.activiti.api.process.model.events.BPMNActivityEvent;
import org.activiti.api.process.model.events.BPMNActivitySignaledEvent;

public class BPMNActivitySignaledEventImpl extends BPMNActivityEventImpl implements BPMNActivitySignaledEvent {

    public BPMNActivitySignaledEventImpl() {
    }

    public BPMNActivitySignaledEventImpl(BPMNActivity entity) {
        super(entity);
    }

    @Override
    public BPMNActivityEvent.ActivityEvents getEventType() {
        return BPMNActivityEvent.ActivityEvents.ACTIVITY_SIGNALED;
    }

    @Override
    public String toString() {
        return "BPMNActivitySignaledEventImpl{" + super.toString() + "}";
    }
}

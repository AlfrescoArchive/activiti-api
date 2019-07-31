package org.activiti.api.runtime.event.impl;

import org.activiti.api.process.model.BPMNMessage;
import org.activiti.api.process.model.events.BPMNMessageEvent;
import org.activiti.api.process.model.events.BPMNMessageThrownEvent;

public class BPMNMessageThrownEventImpl extends RuntimeEventImpl<BPMNMessage, BPMNMessageEvent.MessageEvents> implements BPMNMessageThrownEvent {

    public BPMNMessageThrownEventImpl() {
    }

    public BPMNMessageThrownEventImpl(BPMNMessage entity) {
        super(entity);
    }

    @Override
    public MessageEvents getEventType() {
        return BPMNMessageEvent.MessageEvents.ACTIVITY_MESSAGE_THROWN;
    }

    @Override
    public String toString() {
        return "BPMNMessageThrownEventImpl{" + super.toString() + "}";
    }
}

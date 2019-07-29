package org.activiti.api.process.model.payloads;

import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class MessagePayload implements Payload {

    private String id;
    private String messageName;
    private Object messageData;

    public MessagePayload() {
        this.id = UUID.randomUUID().toString();
    }

    public MessagePayload(String messageName,
                          Object messageData) {
        this();
        this.messageName = messageName;
        this.messageData = messageData;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageData(Object messageData) {
        this.messageData = messageData;
    }

    public Object getMessageData() {
        return messageData;
    }
}

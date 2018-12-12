package org.activiti.api.process.model.payloads;

import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class GetSubprocessesPayload implements Payload {

    private String id;
    private String processInstanceId;

    public GetSubprocessesPayload() {
        this.id = UUID.randomUUID().toString();
    }

    public GetSubprocessesPayload(String processInstanceId) {
        this();
        this.processInstanceId = processInstanceId;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }
}

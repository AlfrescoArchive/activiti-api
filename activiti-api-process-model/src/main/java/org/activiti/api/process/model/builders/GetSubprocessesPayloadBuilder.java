package org.activiti.api.process.model.builders;

import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.payloads.GetSubprocessesPayload;

public class GetSubprocessesPayloadBuilder {

    private String processInstanceId;

    public GetSubprocessesPayloadBuilder withProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    public GetSubprocessesPayloadBuilder withProcessInstance(ProcessInstance processInstance) {
        this.processInstanceId = processInstance.getId();
        return this;
    }

    public GetSubprocessesPayload build() {
        return new GetSubprocessesPayload(processInstanceId);
    }
}

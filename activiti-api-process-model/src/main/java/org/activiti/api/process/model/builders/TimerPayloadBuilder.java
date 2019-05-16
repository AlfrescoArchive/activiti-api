package org.activiti.api.process.model.builders;

import java.util.Date;

import org.activiti.api.process.model.payloads.TimerPayload;

public class TimerPayloadBuilder {

    private String id;
    
    private Date dueDate;
    private Date endDate;

    private String executionId;
    private String processInstanceId;
    private String processDefinitionId;

    private boolean isExclusive;

    private int retries;   
    
    private int maxIterations;
    private String repeat;

    protected String jobHandlerType;
    protected String jobHandlerConfiguration;
    
    protected String exceptionMessage;

    protected String tenantId;
    protected String jobType; 
    
    public TimerPayloadBuilder withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    
    public TimerPayloadBuilder withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }
    
    public TimerPayloadBuilder withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    
    public TimerPayloadBuilder withProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    
    public TimerPayloadBuilder withProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    

    public TimerPayload build() {
        return new TimerPayload();
    }
}

package org.activiti.api.process.model.payloads;

import java.util.Date;
import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class TimerPayload implements Payload {

    private String id;
    
    private Date duedate;
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

    public TimerPayload() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }
    
    public Date getDuedate() {
        return duedate;
    }

    
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    
    public Date getEndDate() {
        return endDate;
    }

    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    public String getExecutionId() {
        return executionId;
    }

    
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    
    public boolean isExclusive() {
        return isExclusive;
    }

    
    public void setExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
    }

    
    public int getRetries() {
        return retries;
    }

    
    public void setRetries(int retries) {
        this.retries = retries;
    }

    
    public int getMaxIterations() {
        return maxIterations;
    }

    
    public void setMaxIterations(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    
    public String getRepeat() {
        return repeat;
    }

    
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    
    public String getJobHandlerType() {
        return jobHandlerType;
    }

    
    public void setJobHandlerType(String jobHandlerType) {
        this.jobHandlerType = jobHandlerType;
    }

    
    public String getJobHandlerConfiguration() {
        return jobHandlerConfiguration;
    }

    
    public void setJobHandlerConfiguration(String jobHandlerConfiguration) {
        this.jobHandlerConfiguration = jobHandlerConfiguration;
    }

    
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    
    public String getTenantId() {
        return tenantId;
    }

    
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    
    public String getJobType() {
        return jobType;
    }

    
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

 
}

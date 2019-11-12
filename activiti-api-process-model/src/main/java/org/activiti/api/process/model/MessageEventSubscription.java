package org.activiti.api.process.model;

import java.util.Date;

public interface MessageEventSubscription {

    String getId();

    String getEventName();

    String getExecutionId();

    String getProcessInstanceId();

    String getConfiguration();

    String getActivityId();

    Date getCreated();

    String getProcessDefinitionId();

}

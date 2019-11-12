/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.api.runtime.model.impl;

import java.util.Date;
import java.util.Objects;

import org.activiti.api.process.model.MessageEventSubscription;

public class MessageEventSubscriptionImpl implements MessageEventSubscription {
    
    private String id;
    private String eventName;
    private String executionId;
    private String processInstanceId;
    private String processDefinitionId;
    private String configuration;
    private String activityId;
    private Date created;

    private MessageEventSubscriptionImpl(Builder builder) {
        this.id = builder.id;
        this.eventName = builder.eventName;
        this.processDefinitionId = builder.processDefinitionId;
        this.configuration = builder.configuration;
        this.activityId = builder.activityId;
        this.executionId = builder.executionId;
        this.processInstanceId = builder.processInstanceId;
        this.created = builder.created;
    }
    
    MessageEventSubscriptionImpl() {
    }
    
    public String getId() {
        return id;
    }
    
    public String getEventName() {
        return eventName;
    }
    
    public String getExecutionId() {
        return executionId;
    }
    
    public String getProcessInstanceId() {
        return processInstanceId;
    }
    
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }
    
    public String getConfiguration() {
        return configuration;
    }
    
    public String getActivityId() {
        return activityId;
    }
    
    public Date getCreated() {
        return created;
    }

    /**
     * Creates builder to build {@link MessageEventSubscriptionImpl}.
     * @return created builder
     */
    public static IIdStage builder() {
        return new Builder();
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IIdStage {

        /**
        * Builder method for id parameter.
        * @param id field to set
        * @return builder
        */
        public IEventNameStage withId(String id);
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IEventNameStage {

        /**
        * Builder method for eventName parameter.
        * @param eventName field to set
        * @return builder
        */
        public IProcessDefinitionIdStage withEventName(String eventName);
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IProcessDefinitionIdStage {

        /**
        * Builder method for processDefinitionId parameter.
        * @param processDefinitionId field to set
        * @return builder
        */
        public IConfigurationStage withProcessDefinitionId(String processDefinitionId);
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IConfigurationStage {

        /**
        * Builder method for configuration parameter.
        * @param configuration field to set
        * @return builder
        */
        public IActivityIdStage withConfiguration(String configuration);
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IActivityIdStage {

        /**
        * Builder method for activityId parameter.
        * @param activityId field to set
        * @return builder
        */
        public IBuildStage withActivityId(String activityId);
    }

    /**
     * Definition of a stage for staged builder.
     */
    public interface IBuildStage {

        /**
        * Builder method for executionId parameter.
        * @param executionId field to set
        * @return builder
        */
        public IBuildStage withExecutionId(String executionId);

        /**
        * Builder method for processInstanceId parameter.
        * @param processInstanceId field to set
        * @return builder
        */
        public IBuildStage withProcessInstanceId(String processInstanceId);

        /**
        * Builder method for created parameter.
        * @param created field to set
        * @return builder
        */
        public IBuildStage withCreated(Date created);

        /**
        * Builder method of the builder.
        * @return built class
        */
        public MessageEventSubscriptionImpl build();
    }

    /**
     * Builder to build {@link MessageEventSubscriptionImpl}.
     */
    public static final class Builder implements IIdStage, IEventNameStage, IProcessDefinitionIdStage, IConfigurationStage, IActivityIdStage, IBuildStage {

        private String id;
        private String eventName;
        private String processDefinitionId;
        private String configuration;
        private String activityId;
        private String executionId;
        private String processInstanceId;
        private Date created;

        private Builder() {
        }

        @Override
        public IEventNameStage withId(String id) {
            this.id = id;
            return this;
        }

        @Override
        public IProcessDefinitionIdStage withEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        @Override
        public IConfigurationStage withProcessDefinitionId(String processDefinitionId) {
            this.processDefinitionId = processDefinitionId;
            return this;
        }

        @Override
        public IActivityIdStage withConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        @Override
        public IBuildStage withActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        @Override
        public IBuildStage withExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        @Override
        public IBuildStage withProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }

        @Override
        public IBuildStage withCreated(Date created) {
            this.created = created;
            return this;
        }

        @Override
        public MessageEventSubscriptionImpl build() {
            return new MessageEventSubscriptionImpl(this);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId,
                            configuration,
                            created,
                            eventName,
                            executionId,
                            id,
                            processDefinitionId,
                            processInstanceId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MessageEventSubscriptionImpl other = (MessageEventSubscriptionImpl) obj;
        return Objects.equals(activityId, other.activityId) && 
                Objects.equals(configuration, other.configuration) && 
                Objects.equals(created, other.created) && 
                Objects.equals(eventName, other.eventName) && 
                Objects.equals(executionId, other.executionId) && 
                Objects.equals(id, other.id) && 
                Objects.equals(processDefinitionId, other.processDefinitionId) && 
                Objects.equals(processInstanceId, other.processInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("MessageEventSubscriptionImpl [id=")
                .append(id)
                .append(", eventName=")
                .append(eventName)
                .append(", executionId=")
                .append(executionId)
                .append(", processInstanceId=")
                .append(processInstanceId)
                .append(", processDefinitionId=")
                .append(processDefinitionId)
                .append(", configuration=")
                .append(configuration)
                .append(", activityId=")
                .append(activityId)
                .append(", created=")
                .append(created)
                .append("]");
        return builder2.toString();
    }
}

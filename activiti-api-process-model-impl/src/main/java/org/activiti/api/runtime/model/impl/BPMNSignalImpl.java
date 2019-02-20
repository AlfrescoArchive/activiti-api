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

import java.util.Objects;

import org.activiti.api.process.model.BPMNSignal;
import org.activiti.api.process.model.payloads.SignalPayload;

public class BPMNSignalImpl extends BPMNElementImpl implements BPMNSignal {
	
	private SignalPayload signalPayload;
	private String activityName;
    private String activityType;


    public BPMNSignalImpl() {
    }

    public BPMNSignalImpl(String elementId,
                          String activityName,
                          String activityType
                          ) {
        this.setElementId(elementId);
        this.activityName = activityName;
        this.activityType = activityType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }
    
    public SignalPayload getSignalPayload() {
        return signalPayload;
    }

    public void setSignalPayload(SignalPayload signalPayload) {
        this.signalPayload = signalPayload;
    }

    public String getSignalName() {
        return (signalPayload != null ? signalPayload.getName() : null);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BPMNSignalImpl that = (BPMNSignalImpl) o;

        return Objects.equals(getElementId(),
                that.getElementId()) &&
                Objects.equals(activityName,
                        that.activityName) &&
                Objects.equals(activityType,
                        that.activityType) &&
                Objects.equals(getSignalName(),
                        that.getSignalName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getElementId(),
                activityName,
                activityType,
                getSignalName());
    }

    @Override
    public String toString() {
        return "BPMNActivityImpl{" +
                "activityName='" + activityName + '\'' +
                ", activityType='" + activityType + '\'' +
                ", elementId='" + getElementId() + '\'' +
                ", signalName='" + getSignalName() + '\'' +
                '}';
    }

}

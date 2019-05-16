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

import org.activiti.api.process.model.BPMNTimer;
import org.activiti.api.process.model.payloads.TimerPayload;

public class BPMNTimerImpl extends BPMNElementImpl implements BPMNTimer {

    private TimerPayload timerPayload;

    public BPMNTimerImpl() {
    }

    public BPMNTimerImpl(String elementId) {
        this.setElementId(elementId);
    }

    public TimerPayload getTimerPayload() {
        return timerPayload;
    }

    public void setTimerPayload(TimerPayload timerPayload) {
        this.timerPayload = timerPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BPMNTimerImpl that = (BPMNTimerImpl) o;

        return Objects.equals(getElementId(),
                              that.getElementId()) &&
                Objects.equals(timerPayload,
                               that.getTimerPayload());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getElementId(),
                            timerPayload != null ? timerPayload.getId() : null,
                            timerPayload != null ? timerPayload.getName() : null);
    }

    @Override
    public String toString() {
        return "BPMNActivityImpl{" +
                ", elementId='" + getElementId() + '\'' +
                ", timerPayload='" + (timerPayload != null ? timerPayload.toString() : null) + '\'' +
                '}';
    }
}

package org.activiti.api.runtime.model.impl;

import org.activiti.api.model.shared.model.ActivitiError;

public class ActivitiErrorImpl implements ActivitiError {

    private int status;
    private String message;

    public ActivitiErrorImpl () {
    }

    public ActivitiErrorImpl (int status,
                              String message){
        this.status = status;
        this.message = message;
    }

    @Override
    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    @Override
    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }



}

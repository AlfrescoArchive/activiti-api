package org.activiti.api.runtime.model.impl;

import org.activiti.api.model.shared.model.ActivitiError;
import org.springframework.http.HttpStatus;

public class ActivitiErrorImpl implements ActivitiError {

    private HttpStatus status;
    private String message;

    public ActivitiErrorImpl () {
    }

    public ActivitiErrorImpl (HttpStatus status,
                              String message){
        this.status = status;
        this.message = message;
    }

    @Override
    public HttpStatus getStatus(){
        return status;
    }

    public void setStatus(HttpStatus status){
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

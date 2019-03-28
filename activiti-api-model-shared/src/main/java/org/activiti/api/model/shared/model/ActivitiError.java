package org.activiti.api.model.shared.model;

import org.springframework.http.HttpStatus;

public interface ActivitiError {

    HttpStatus getStatus();

    String getMessage();

}

package org.activiti.api.runtime.shared.security;

import java.util.Collections;
import java.util.List;

public interface SecurityManager {

    String getAuthenticatedUserId();
    
    default List<String> getAuthenticatedUserGroups() {
        return Collections.emptyList();
    }

}

package org.activiti.api.runtime.shared.security;

import java.util.Collection;

public interface SecurityManager {

    /**
     * Get currently authenticated user id from application security context  
     * 
     * @return currently authenticate user id or empty string if anonymous user
     * 
     */
    String getAuthenticatedUserId();
    
    /**
     * Get currently authenticated user group names from application security context 
     * 
     * @return list of group names the current user is member of
     * 
     * @throws SecurityException if principal security context does not exists.
     */
    Collection<String> getAuthenticatedUserGroups() throws SecurityException;
    
    /**
     * Get currently authenticated user list of role names from application security context 
     * 
     * @return list of roles names or empty collection
     * 
     * @throws SecurityException if principal security context does not exists.
     */
    Collection<String> getAuthenticatedUserRoles() throws SecurityException;

}

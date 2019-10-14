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

package org.activiti.api.runtime.shared.security;

import java.util.List;

public abstract class AbstractSecurityManager implements SecurityManager {
    
    private static final String INVALID_AUTHENTICATED_PRINCIPAL = "Invalid authenticated principal";

    private final SecurityContextPrincipalProvider securityContextPrincipalProvider;
    private final PrincipalIdentityProvider principalIdentityProvider;
    private final PrincipalDetailsProvider principalDetailsProvider;

    public AbstractSecurityManager(SecurityContextPrincipalProvider securityContextPrincipalProvider,
                                   PrincipalIdentityProvider principalIdentityProvider,
                                   PrincipalDetailsProvider principalDetailsProvider) {
        this.securityContextPrincipalProvider = securityContextPrincipalProvider;
        this.principalIdentityProvider = principalIdentityProvider;
        this.principalDetailsProvider = principalDetailsProvider;
    }

    @Override
    public String getAuthenticatedUserId() {
        return securityContextPrincipalProvider.getCurrentPrincipal()
                                               .map(principalIdentityProvider::getUserId)
                                               .orElseThrow(this::securityException);
    }

    @Override
    public List<String> getAuthenticatedUserGroups() {
        return securityContextPrincipalProvider.getCurrentPrincipal()
                                               .map(principalDetailsProvider::getGroups)
                                               .orElseThrow(this::securityException);
    }

    @Override
    public List<String> getAuthenticatedUserRoles() {
        return securityContextPrincipalProvider.getCurrentPrincipal()
                                               .map(principalDetailsProvider::getRoles)
                                               .orElseThrow(this::securityException);
    }
    
    protected SecurityException securityException() {
        return new SecurityException(INVALID_AUTHENTICATED_PRINCIPAL);
    }
    
}

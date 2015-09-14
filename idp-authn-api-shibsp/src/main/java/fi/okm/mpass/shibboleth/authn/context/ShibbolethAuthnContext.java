/*
 * The MIT License
 * Copyright (c) 2015 CSC - IT Center for Science, http://www.csc.fi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package fi.okm.mpass.shibboleth.authn.context;

import javax.annotation.Nonnull;

import net.shibboleth.utilities.java.support.annotation.constraint.NotEmpty;

import org.opensaml.messaging.context.BaseContext;

/**
 * This context stores attributes coming from Shibboleth SP.
 */
public class ShibbolethAuthnContext extends BaseContext {

    /** Shibboleth SP session index attribute name. */
    public static final String SHIB_SP_SESSION_INDEX = "Shib-Session-Index";

    /** Shibbolet SP application id attribute name. */
    public static final String SHIB_SP_APPLICATION_ID = "Shib-Application-ID";

    /** Shibbolet SP session id attribute name. */
    public static final String SHIB_SP_SESSION_ID = "Shib-Session-ID";

    /** Shibbolet SP authentication instant attribute name. */
    public static final String SHIB_SP_AUTHENTICATION_INSTANT = "Shib-Authentication-Instant";

    /** Shibbolet SP authentication method attribute name. */
    public static final String SHIB_SP_AUTHENTICATION_METHOD = "Shib-Authentication-Method";

    /** Shibbolet SP identity provider attribute name. */
    public static final String SHIB_SP_IDENTITY_PROVIDER = "Shib-Identity-Provider";

    /** Shibbolet SP authentication context class attribute name. */
    public static final String SHIB_SP_AUTHN_CONTEXT_CLASS = "Shib-AuthnContext-Class";

    /** The IdP who authenticated the user. */
    @Nonnull @NotEmpty private String idp;

    /** The authentication instant when user was authenticated at the IdP. */
    @Nonnull @NotEmpty private String instant;

    /** The authentication method how user was authenticated at the IdP. */
    @Nonnull @NotEmpty private String method;

    /** The authentication context class how user was authenticated at the IdP. */
    @Nonnull @NotEmpty private String contextClass;

    /**
     * Get the IdP who authenticated the user.
     * 
     * @return idp
     */
    @Nonnull @NotEmpty public String getIdp() {
        return idp;
    }

    /**
     * Set the IdP who authenticated the user.
     * 
     * @param identityProvider What to set.
     * @return idp
     */
    @Nonnull @NotEmpty public String setIdp(@Nonnull @NotEmpty final String identityProvider) {
        idp = identityProvider;
        return idp;
    }

    /**
     * Get the authentication instant when user was authenticated at the IdP.
     * 
     * @return instant
     */
    @Nonnull @NotEmpty public String getInstant() {
        return instant;
    }

    /**
     * Set the authentication instant when user was authenticated at the IdP.
     * 
     * @param authnInstant What to set.
     * @return authnInstant
     */
    @Nonnull @NotEmpty public String setInstant(@Nonnull @NotEmpty final String authnInstant) {
        instant = authnInstant;
        return instant;
    }

    /**
     * Get the authentication method how user was authenticated at the IdP.
     * 
     * @return method
     */
    @Nonnull @NotEmpty public String getMethod() {
        return method;
    }

    /**
     * Set the authentication method how user was authenticated at the IdP.
     * 
     * @param authnMethod What to set.
     * @return method
     */
    @Nonnull @NotEmpty public String setMethod(@Nonnull @NotEmpty final String authnMethod) {
        method = authnMethod;
        return method;
    }

    /**
     * Get the authentication context class how user was authenticated at the IdP.
     * 
     * @return contextClass
     */
    @Nonnull @NotEmpty public String getContextClass() {
        return contextClass;
    }

    /**
     * Set the authentication context class how user was authenticated at the IdP.
     * 
     * @param authnContextClass What to set.
     * @return contextClass
     */
    @Nonnull @NotEmpty public String setContextClass(@Nonnull @NotEmpty final String authnContextClass) {
        contextClass = authnContextClass;
        return contextClass;
    }
}
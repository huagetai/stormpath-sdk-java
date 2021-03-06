/*
 * Copyright 2017 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.spring.cloud.zuul.config;

import com.stormpath.sdk.lang.Assert;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.Key;

/**
 * @since 1.3.0
 */
public class DefaultJwkResult implements JwkResult {

    private final SignatureAlgorithm signatureAlgorithm;
    private final Key key;
    private final String keyId;

    public DefaultJwkResult(SignatureAlgorithm signatureAlgorithm, Key key, String keyId) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Key cannot be null.");
        this.signatureAlgorithm = signatureAlgorithm;
        this.key = key;
        this.keyId = keyId;
    }

    @Override
    public SignatureAlgorithm getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @Override
    public Key getKey() {
        return this.key;
    }

    @Override
    public String getKeyId() {
        return this.keyId;
    }
}

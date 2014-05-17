/*
 * Copyright 2014 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.instagram;

import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.service.OAuthEncoder;
import org.agorava.api.service.Preconditions;
import org.agorava.spi.ProviderConfigOauth20Final;

/**
 * @author Werner Keil
 * Date: 17/05/14
 * Time: 22:35
 */
@Instagram
public class InstagramApi extends ProviderConfigOauth20Final {

    private static final String MEDIA_NAME = "Instagram";
    private static final String AUTHORIZE_URL = "https://instagram.com/oauth/authorize/?client_id=%s&redirect_uri=%s&response_type=token";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";

    @Override
    public String getAccessTokenEndpoint() {
        return "https://api.instagram.com/oauth/access_token";
    }

    @Override
    public String getAuthorizationUrl(OAuthAppSettings oAuthAppSettings) {
        Preconditions.checkValidUrl(oAuthAppSettings.getCallback(), "Must provide a valid url as callback. Instagram does not support OOB");

        // Append scope if present
        if (oAuthAppSettings.hasScope()) {
            return String.format(SCOPED_AUTHORIZE_URL, oAuthAppSettings.getApiKey(), OAuthEncoder.encode(oAuthAppSettings.getCallback()), OAuthEncoder.encode(oAuthAppSettings.getScope()));
        } else {
            return String.format(AUTHORIZE_URL, oAuthAppSettings.getApiKey(), OAuthEncoder.encode(oAuthAppSettings.getCallback()));
        }
    }

    @Override
    public String getProviderName() {
        return MEDIA_NAME;
    }
}

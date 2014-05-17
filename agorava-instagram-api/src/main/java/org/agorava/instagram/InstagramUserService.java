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

import org.agorava.instagram.model.InstagramProfile;
import org.agorava.instagram.model.InstagramProfileList;
import org.agorava.spi.UserProfileService;

/**
 * @author Werner Keil
 * Date: 17/05/14
 * Time: 22:26
 */
public interface InstagramUserService extends UserProfileService {

    InstagramProfile getUserProfile();

    InstagramProfile getUserProfile(String userId);

    /**
     * Search a user matching the String passed in args.
     * @param query : String to search
     * @return List of {@link InstagramProfile}
     */
    InstagramProfileList search(String query);

    /**
     * the API has an issue. No matter how much we put for the count, it always return 16 results
     * @param query : string to search
     * @param count : number of result
     * @return List of {@link InstagramProfile}
     */
    InstagramProfileList search(String query, int count);
}

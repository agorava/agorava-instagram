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

package org.agorava.instagram.model;

import org.agorava.spi.UserProfile;

/**
 * @author Dje
 * @author Werner Keil
 * Date: 05/05/14
 * Time: 02:38
 */
public class InstagramProfile extends UserProfile {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5831319742362178758L;
	private final String userName;
    private final String fullName;
    private final String profileImageUrl;
    private String bio;
    private String website;
    private Count count;

    public InstagramProfile(String id, String userName, String fullName, String profileImageUrl) {
        super(id);
        this.userName = userName;
        this.fullName = fullName;
        this.profileImageUrl = profileImageUrl;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstagramProfile{");
        sb.append("bio='").append(bio).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", profileImageUrl='").append(profileImageUrl).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

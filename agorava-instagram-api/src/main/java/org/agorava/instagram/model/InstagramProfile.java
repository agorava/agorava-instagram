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
 * Date: 06/07/14
 * Time: 17:31
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
    private String email;

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
    
    public void setEmail(String mail) {
        this.email = mail;
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
    
    static enum Part {
    	First, Last
    }
    
    private String getFullNamePart(Part part) {
    	if (fullName!= null && fullName.length()>0) {
    		final String[] nameParts = fullName.split(" ");
    		switch (part) {
    		case First:
    			// TODO add better bound checks
    			return nameParts[0];
			default:
				return nameParts[1];
    		}
    	} else {
    		return "";
    	}
    }

	public String getFirstName() {
		return getFullNamePart(Part.First);
	}

	public String getLastName() {
		return getFullNamePart(Part.Last);
	}

	public String getEmail() {
		return email;
	}
}

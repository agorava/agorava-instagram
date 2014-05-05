package org.agorava.instagram.model;

import org.agorava.api.storage.Identifiable;

/**
 * @author Dje
 * @author Werner Keil
 * Date: 05/05/14
 * Time: 02:40
 */
public class Comment implements Identifiable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6039490325640989084L;
	private final String id;
    private final Long createdTime;
    private final String text;
    private final InstagramProfile from;

    public Comment(Long createdTime, String id, String text, InstagramProfile from) {
        this.createdTime = createdTime;
        this.id = id;
        this.text = text;
        this.from = from;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public InstagramProfile getFrom() {
        return from;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}

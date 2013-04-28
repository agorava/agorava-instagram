package org.agorava.instagram.impl;

import org.agorava.InstagramBaseService;
import org.agorava.instagram.InstagramCommentsService;
import org.agorava.instagram.jackson.InstagramCommentListHolder;
import org.agorava.instagram.model.Comment;
import org.agorava.instagram.model.CommentList;

import java.util.List;

/**
 * User: Dje
 * Date: 28/04/13
 * Time: 18:48
 */
public class InstagramCommentsServiceImpl extends InstagramBaseService implements InstagramCommentsService {

    @Override
    public List<Comment> getComments(String mediaId) {
        List<Comment> list = getService().get(buildUri("/media/" + mediaId + "/comments"), InstagramCommentListHolder.class).getList();
        return list;
    }
}
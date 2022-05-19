package com.zyh.service;

import com.zyh.po.Comment;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.service
 * @date 2022/5/12 9:20
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}

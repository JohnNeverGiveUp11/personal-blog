package com.zyh.dao;

import com.zyh.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.dao
 * @date 2022/5/12 9:23
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByBlogIdAndParentCommentNull(Long BlogId, Sort sort);

}

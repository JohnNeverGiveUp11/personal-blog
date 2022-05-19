package com.zyh.dao;

import com.zyh.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.dao
 * @date 2022/4/20 14:47
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}

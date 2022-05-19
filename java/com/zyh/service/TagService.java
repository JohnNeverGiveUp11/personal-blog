package com.zyh.service;

import com.zyh.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.service
 * @date 2022/4/20 11:23
 */
public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

    Tag updateTag(Long id,Tag tag);

    void deleteTag(Long id);

    Tag getTagByName(String name);
}

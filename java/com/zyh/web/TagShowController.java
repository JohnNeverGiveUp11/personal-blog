package com.zyh.web;

import com.zyh.dao.TagRepository;
import com.zyh.po.Tag;
import com.zyh.service.BlogService;
import com.zyh.service.TagService;
import com.zyh.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.web
 * @date 2022/5/14 14:54
 */
@Controller
public class TagShowController {

    @Autowired
    private TagService tagService;

    @Autowired
    private BlogService blogService;
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tags/{id}")
    public  String tags(@PageableDefault(size = 8,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                         @PathVariable Long id, Model model){
        List<Tag> tags = tagService.listTagTop(10000);
        if (id == -1){
            id = tags.get(0).getId();
        }
        BlogQuery blogQuery = new BlogQuery();

        model.addAttribute("tags",tags);
        model.addAttribute("page",blogService.listBlog(id,pageable));
        model.addAttribute("activeTagId",id);
        return "tags";
    }
}

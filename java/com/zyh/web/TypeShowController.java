package com.zyh.web;

import com.zyh.dao.TypeRepository;
import com.zyh.po.Type;
import com.zyh.service.BlogService;
import com.zyh.service.TypeService;
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
public class TypeShowController {

    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/types/{id}")
    public  String types(@PageableDefault(size = 8,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                         @PathVariable Long id, Model model){
        List<Type> types = typeService.listTypeTop(10000);
        if (id == -1){
            id = types.get(0).getId();
        }
        BlogQuery blogQuery = new BlogQuery();
        blogQuery.setTypeId(id);
        model.addAttribute("types",types);
        model.addAttribute("page",blogService.listBlog(pageable,blogQuery));
        model.addAttribute("activeTypeId",id);
        return "types";
    }
}

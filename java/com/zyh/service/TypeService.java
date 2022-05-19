package com.zyh.service;

import com.zyh.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.service
 * @date 2022/4/13 14:18
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id,Type type);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    void deleteType(Long id);

    Type getTypeByName(String name);
}

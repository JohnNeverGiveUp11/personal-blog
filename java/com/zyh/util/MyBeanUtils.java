package com.zyh.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.util
 * @date 2022/5/6 16:41
 */
public class MyBeanUtils {

    public static String[] getNullPropertyNames(Object source){
        BeanWrapper beanWrapper = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = beanWrapper.getPropertyDescriptors();
        List<String> nullPropertyNames = new ArrayList<>();
        for (PropertyDescriptor pd : pds){
            String propertyName = pd.getName();
            if (beanWrapper.getPropertyValue(propertyName)==null){
                nullPropertyNames.add(propertyName);
            }
        }
        return nullPropertyNames.toArray(new  String[nullPropertyNames.size()]);
    }
}

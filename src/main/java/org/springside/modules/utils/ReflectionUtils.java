/**
 * Copyright (c) 2005-2012 springside.org.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package org.springside.modules.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 反射工具类.
 * 提供调用getter/setter方法, 访问私有变量, 调用私有方法, 获取泛型类型Class, 被AOP过的真实类等工具函数.
 * @author calvin
 * @version 2013-01-15
 */
@SuppressWarnings("rawtypes")
public class ReflectionUtils {

	
	/**
     * 提取集合中的对象的属性,组合成List.
     * 
     * @param collection
     *            来源集合.
     * @param propertityName
     *            要提取的属性名.
     */
    @SuppressWarnings("unchecked")
    public static List fetchElementPropertyToList(final Collection collection, final String propertyName) throws Exception {
 
        List list = new ArrayList();
 
        for (Object obj : collection) {
            list.add(PropertyUtils.getProperty(obj, propertyName));
        }
 
        return list;
    }
	
	
	 /**
     * 提取集合中的对象的属性,组合成由分割符分隔的字符串.
     * 
     * @param collection
     *            来源集合.
     * @param propertityName
     *            要提取的属性名.
     * @param separator
     *            分隔符.
     */
    public static String fetchElementPropertyToString(final Collection collection, final String propertyName, final String separator) throws Exception {
        List list = fetchElementPropertyToList(collection, propertyName);
        return StringUtils.join(list.toArray(), separator);
    }
}
package com.neunzwei.common.base.util;

import com.alibaba.fastjson.JSON;

public class CloneUtil {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object jsonClone(Object t, Class clazz) {
		Object obj = JSON.parseObject(JSON.toJSONString(t), clazz);
		return obj;
	}

}

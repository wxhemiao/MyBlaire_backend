package com.myBlaire.dao;

import java.util.Map;

import com.myBlaire.util.PageInfo;

public interface TFeedbackDao {

	/**
	 * 获取吐槽列表
	 * @return
	 */
	public PageInfo<Map<String,String>> getList(Integer page,Integer size)throws Exception;
}

package com.myBlaire.dao;

import java.util.List;

import com.myBlaire.domain.TUser;
import com.myBlaire.domain.TUserCollect;
import com.myBlaire.util.PageInfo;

public interface TUserDao {

	/**
	 * 获取会员用户列表
	 * @param user
	 * @param page
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public PageInfo<TUser> getList(TUser user,Integer page,Integer size)throws Exception;
	
	/**
	 * 保存或修改用户信息
	 * @throws Exception
	 */
	public void saveorupdateTUser(TUser user)throws Exception;
	
	
	/**
	 * 根据获取商品信息
	 * @param user
	 * @throws Exception
	 */
	public List<TUserCollect> queryGoodsByUser(TUser user)throws Exception;
	
	/**
	 * 根据用户名获取用户信息
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public TUser getUserByUserName(String userName)throws Exception;
	
	/**
	 * 正常登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public TUser normalLogin(TUser user)throws Exception;
	
	/**
	 * 第三方登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public TUser thirdPartyLogin(TUser user)throws Exception;
	
	
	/**
	 * 根据通讯id获取用户信息
	 * @param communicationId
	 * @return
	 * @throws Exception
	 */
	public TUser getUserByCommunicationId(String communicationId)throws Exception;
	
	
	/**
	 * 修改用户属性
	 * @param userId
	 * @param upName
	 * @param upVlaue
	 */
	public void updateUserProperty(String userId,String upName,String upVlaue)throws Exception;
	
	
	/**
	 * 根据email获取用户信息
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public TUser getUserByEmail(String email)throws Exception;
}

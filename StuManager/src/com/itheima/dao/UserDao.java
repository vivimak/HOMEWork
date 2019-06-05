package com.itheima.dao;

public interface UserDao {

	/***
	 * 这里简单就是返回一个boolean类型，成功或者失败即可。
	 * 但是开发的时候，登录方法一旦成功，这里应该返回用户的个人信息
	 *@param userName
	 *@param password
	 *@return true:登录成功，false:登陆失败***/
	boolean login(String userName,String password);
	
}

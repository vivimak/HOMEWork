package com.itheima.dao;

public interface UserDao {

	/***
	 * ����򵥾��Ƿ���һ��boolean���ͣ��ɹ�����ʧ�ܼ��ɡ�
	 * ���ǿ�����ʱ�򣬵�¼����һ���ɹ�������Ӧ�÷����û��ĸ�����Ϣ
	 *@param userName
	 *@param password
	 *@return true:��¼�ɹ���false:��½ʧ��***/
	boolean login(String userName,String password);
	
}

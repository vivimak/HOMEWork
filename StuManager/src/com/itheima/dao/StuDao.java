package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Student;

public interface StuDao {

	/**
	 * ��ѯ�������е�ѧ����Ϣ
	 * @return List����
	 */
	List<Student> findAll();
}
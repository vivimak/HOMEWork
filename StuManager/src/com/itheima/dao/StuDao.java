package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Student;

public interface StuDao {

	/**
	 * 查询出来所有的学生信息
	 * @return List集合
	 */
	List<Student> findAll();
}
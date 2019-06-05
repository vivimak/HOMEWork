package com.itheima.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.uitl.JDBCUtil;

public class UserDaoImpl implements UserDao {

	public boolean login(String userName,String password) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//1.�õ����Ӷ���
			conn = JDBCUtil.getConn();
			
			String sql = "select * from t_user where username=? and password=?";
			
			//2.����ps����
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			
			//3.��ʼִ��
			rs = ps.executeQuery();
			
		    return rs.next();
		    
		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
			JDBCUtil.release(conn,ps,rs);
			
		}
		
		return false;
	}

}

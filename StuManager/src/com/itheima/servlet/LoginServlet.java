package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;


/**
 * 这是用于处理登录的servlet
 *
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//提交的数据有可能有中文
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1.获取客户端提交的信息
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		//2.去访问dao,看看是否满足登录
		UserDao dao = new UserDaoImpl();
		boolean isSuccess = dao.login(userName, password);
		
		//3.针对dao的返回结果，做出响应
		if(isSuccess){
			//response.getWriter().write("登陆成功");
			
			//1.重定向
			response.sendRedirect("stu_list.jsp");
			
		}else{
			response.getWriter().write("用户名或密码错误");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

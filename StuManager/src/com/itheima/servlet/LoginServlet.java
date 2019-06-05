package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;


/**
 * �������ڴ����¼��servlet
 *
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//�ύ�������п���������
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1.��ȡ�ͻ����ύ����Ϣ
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		//2.ȥ����dao,�����Ƿ������¼
		UserDao dao = new UserDaoImpl();
		boolean isSuccess = dao.login(userName, password);
		
		//3.���dao�ķ��ؽ����������Ӧ
		if(isSuccess){
			//response.getWriter().write("��½�ɹ�");
			
			//1.�ض���
			response.sendRedirect("stu_list.jsp");
			
		}else{
			response.getWriter().write("�û������������");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

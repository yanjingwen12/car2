package com.Cars.Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YuDing
 */
@WebServlet("/YuDing")
public class YuDing extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String method=request.getParameter("method");
	   switch(method) {
	   case"listAll":{
		   System.out.println("��ѯ��ʾ���к�̨����");
		   	   break;
	   } case"addYu":{
		   System.out.println("���Ԥ������");
	   	   break;
       } case"delete":{
    	   System.out.println("ɾ��Ԥ������");
	   	   break;
       } case"update":{
    	   System.out.println("�޸�Ԥ������");
	   	   break;
       }
	
		   }
	}

}

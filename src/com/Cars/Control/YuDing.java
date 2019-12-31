package com.Cars.Control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Cars.Model.YuDingDao;


/**
 * Servlet implementation class YuDing
 */
@WebServlet("/YuDing")
public class YuDing extends HttpServlet {
	private YuDingDao dao=new YuDingDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String method=request.getParameter("method");
	   switch(method) {
	   case"listAll":{
		   System.out.println("��ѯ��ʾ���к�̨����");
		   //����dao������ѯ���е�Ԥ����Ϣ
		   List<com.Cars.Model.YuDing> yudings = dao.listAll();
		   System.out.println(yudings.size());
		   //����ѯ���������ݴ��浽request��Χ��
		   request.setAttribute("yudings",yudings);
		   //��ת����ʾ����Ԥ����Ϣ��jspҳ����
		   request.getRequestDispatcher("YuDing_list.jsp").forward(request,response);
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

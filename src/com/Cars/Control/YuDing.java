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
		   System.out.println("查询显示所有后台方法");
		   //调运dao方法查询所有的预定信息
		   List<com.Cars.Model.YuDing> yudings = dao.listAll();
		   System.out.println(yudings.size());
		   //将查询出来的数据储存到request范围内
		   request.setAttribute("yudings",yudings);
		   //跳转到显示所有预定信息的jsp页面上
		   request.getRequestDispatcher("YuDing_list.jsp").forward(request,response);
		   	   break;
	   } case"addYu":{
		   System.out.println("添加预订方法");
	   	   break;
       } case"delete":{
    	   System.out.println("删除预订方法");
	   	   break;
       } case"update":{
    	   System.out.println("修改预订方法");
	   	   break;
       }
	
		   }
	}

}

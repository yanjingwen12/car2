package com.Cars.Model;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import org.apache.catalina.Manager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


/**
 * ����Ԥ��ģ���dao�࣬�����ṩ��������ص����ݿ��������
 * @author Administrator
 *
 */

public class YuDingDao {
   public List<YuDing> listAll(){
	 List<YuDing> yudings = null;
	   try {
		Class.forName("com.mysql.jdbc.Driver.class");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car2","root","root");
		QueryRunner run = new QueryRunner();
		ResultSetHandler<List<YuDing>> h = new BeanListHandler(YuDing.class);
		yudings = run.query(connection,"select * from YuDing",h);
	} catch (Exception e) {
		yudings=new ArrayList<>();
		e.printStackTrace();
	}
	   return yudings;
   }
}
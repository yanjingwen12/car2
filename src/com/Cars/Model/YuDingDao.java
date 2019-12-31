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
 * 这是预订模块的dao类，里面提供与汽车相关的数据库操作方法
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
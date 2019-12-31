package com.Cars.Model;
/**
 * 这是预订模块的dao类，里面提供与汽车相关的数据库操作方法
 * @author Administrator
 *
 */

public class YuDing {
   public List<YuDing> listAll(){
	 List<YuDing> yudings = null;
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=Driver Manager.getConnection("jdbc:mysql://localhost:3306/YuDing","root","root");
		QueryRunner run = new QueryRunner();
		ResultSetHandler<List<YuDing>> h = new BeanListHandler(YuDing,class);
		yudings = run.query(connection,"select * from YuDing",h);
	} catch (Exception e) {
		yudings=new ArrayList<>();
		e.printStackTrace();
	}
   }
}

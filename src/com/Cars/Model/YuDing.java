package com.Cars.Model;
/**
 * ����Ԥ��ģ���dao�࣬�����ṩ��������ص����ݿ��������
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

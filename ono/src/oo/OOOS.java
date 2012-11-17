package oo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OOOS {

	/**
	 *
	 * @param args
	 * @author xjs
	 * @date 2012-11-16 下午12:42:24
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "book", "book");
		Statement stm=conn.createStatement();
//		String sql="delete from user where userId='"+1+"'";
//		stm.executeUpdate(sql);
		ResultSet rs = stm.executeQuery("select * from employees");
		while(rs.next()){
		System.out.println("ok ..ol ok..ok ");
		}

	}

}

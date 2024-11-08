package db1;

import java.sql.*;
public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("sairam");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@loaclhost:1521:orcl","system","sai1234");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from customer64");
			while(rs.next()) {
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}

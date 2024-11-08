package sai;
import java.sql.*;
public class sairam {
	
	public static void main(String[] args) {
		//System.out.println("sairam");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sai","1234");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from customer64");
			while(rs.next()) {
				System.out.println(rs.getLong(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

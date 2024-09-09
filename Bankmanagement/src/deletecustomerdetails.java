import java.sql.*;
public class deletecustomerdetails {

	public void deletecustomer() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/bankingsystem";
		String username ="root";
		String password="23092003";
		String Query = "delete from customerdetails where customerid = 124";
		Connection connect = DriverManager.getConnection(url,username,password);
		PreparedStatement pre = connect.prepareStatement(Query);
		pre.executeUpdate();
		connect.close();
	}
		
	
	
	public static void main(String[]args) throws Exception{
		deletecustomerdetails object = new deletecustomerdetails ();
		object.deletecustomer();
	}
}

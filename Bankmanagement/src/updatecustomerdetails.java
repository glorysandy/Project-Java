import java.sql.*;
public class updatecustomerdetails {

	public void updatecustomer ()  throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/bankingsystem";
		String username ="root";
		String password="23092003";
		String Query = "update customerdetails set customername ='swetha'where customerid = 124";
		Connection connect = DriverManager.getConnection(url,username,password);
		PreparedStatement pre = connect.prepareStatement(Query);
		pre.executeUpdate();
		connect.close();
	}
	
	public static void main (String[]args) throws Exception{
		
		updatecustomerdetails object = new updatecustomerdetails();
		object.updatecustomer();
	}
}

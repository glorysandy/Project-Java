import java.sql.*;
public class getcustomerdetails {

	public void getcustomers ()throws Exception{
		
		String url ="jdbc:mysql://127.0.0.1:3306/bankingsystem";
		String username ="root";
		String password ="23092003";
		String Query = "select*from customerdetails";
		Connection connect = DriverManager.getConnection(url,username,password);
		Statement state = connect.createStatement();
		ResultSet res = state.executeQuery(Query);
		while (res.next()){
			System.out.println("customerid"+res.getInt(1));
			System.out.println("customername"+res.getString(2));
			System.out.println("bankname"+res.getString(3));
			System.out.println("branchname"+res.getString(4));
			System.out.println("accounttype"+res.getString(5));
			System.out.println("opening_balance"+res.getString(6));
			System.out.println(" cuurent_balance"+res.getString(7));
			System.out.println(" accountno"+res.getString(8));
			System.out.println("phoneno "+res.getString(9));
		}connect.close();
	}
	
	
	
	public static void main (String[]args) throws Exception {
		getcustomerdetails object = new getcustomerdetails();
		object.getcustomers();
	}
}

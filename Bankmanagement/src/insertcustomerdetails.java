import java.sql.*;
public class insertcustomerdetails {

	public void customerinsert() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/bankingsystem";
		String username ="root";
		String password="23092003";
		String Query = "insert into customerdetails  values(?,?,?,?,?,?,?,?,?)";
		Connection connect = DriverManager.getConnection(url,username,password);
		PreparedStatement ben = connect.prepareStatement(Query);
		ben.setInt(1,23);
		ben.setString(2, "sandy");
		ben.setString(3,"canara");
		ben.setString(4,"avadi");
		ben.setString(5,"saving account");
		ben.setDouble(6,30000.0);
		ben.setDouble(7,100000.71);
		ben.setLong(8, 84209);
		ben.setLong(9, 904381389);
		ben.executeUpdate();
		connect.close();
		
	}
	
	public static void main (String[]args)  throws Exception{
		insertcustomerdetails obj = new insertcustomerdetails();
		obj.customerinsert();
		
	}
}

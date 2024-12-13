import java.sql.*;
public class InsertMovie {
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.'0.1:3306/connection";
		String username = "root";
		String password = "1234";
		String query = "insert into movie values(?,?,?)";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 103);
		pst.setString(2,"IronMan3");
		pst.setString(3,"Friction");
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String[]args) throws Exception {
		insert();
	}
}

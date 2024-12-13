import java.sql.*;
public class Updatemovie {
	public static void update() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/connection";
		String username = "root";
		String password = "1234";
		String query = "update movie set movie_name = 'Ironman1' where movie_id=101";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String[]args) throws Exception {
		update();
	}
}

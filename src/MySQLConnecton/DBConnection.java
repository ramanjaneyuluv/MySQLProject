package MySQLConnecton;
import java.sql.*;

public class DBConnection {
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb ?verifyServerCertificate=false&useSSL=false","root","ramu1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from restdb.parats");
			while(rs.next()){
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
				con.close();
			}
		}
			catch(Exception e){
			//	System.out.println(e);
			}
	}

}

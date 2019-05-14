import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws Exception {

		// driver object

		Class.forName("com.mysql.jdbc.Driver");
		// url should be given with databasenaame
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "test");

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from studentfees");

		while (rs.next()) {
			String name = rs.getString("stuName");
			int i = rs.getInt("stuId");
			System.out.println(name);
			System.out.println(i);
			String branch = rs.getString("studentBranch");
			System.out.println(branch);

		}
	}

}

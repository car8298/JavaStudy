
public class JdbcTest {
	public static void main(String[] args) {
		// 1. ���̺귯���� �޸� ���
		Class.forName("com.mysql.jdbc.Driver");
		// 2. DB����
		String url = "jdbc:mysql://localhost:3306/java";
		 String id = "root";
		 String pw = "mysql";
		 //java.sql ��Ű�� ���̺귯�� import
		 Connection con = DriverManager.getConnection(url, id, pw);
		 
		 String sql = "select * from emp";
		 PreparedStatement stmt = con.prepareStatement(sql);
		 
		 stat.executeQuery();
	}
}

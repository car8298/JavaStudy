
public class JdbcTest {
	public static void main(String[] args) {
		// 1. 라이브러리를 메모리 등록
		Class.forName("com.mysql.jdbc.Driver");
		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/java";
		 String id = "root";
		 String pw = "mysql";
		 //java.sql 패키지 라이브러리 import
		 Connection con = DriverManager.getConnection(url, id, pw);
		 
		 String sql = "select * from emp";
		 PreparedStatement stmt = con.prepareStatement(sql);
		 
		 stat.executeQuery();
	}
}

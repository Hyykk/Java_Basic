package Day221123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class UserException extends Exception{
	public UserException() {
		//����ڰ� ������ ��ȸ��Ȳ �ڵ�
	}
}

class SamSam{
	public SamSam() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","scott", "tiger");

	}
}

public class ExceptionTest3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new SamSam();
	}
}

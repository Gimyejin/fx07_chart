package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.net.aso.i;

public class DBService {
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	public DBService() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클과 연결된 객체를 가져온다.
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java", "java");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Inquiry> selectSQL() {
		String sql = "select * from inquiry";
		ArrayList<Inquiry> list = new ArrayList<Inquiry>();
		try {
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Inquiry into=new Inquiry();
				into.setAge(rs.getInt("age"));
				into.setGender(rs.getInt("gender"));
				into.setTravel(rs.getInt("travel"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public int insert(Inquiry iq) {
		String sql = "insert into inquiry(travel,gender,age) values(?,?,?)";
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);

			// 쿼리문의 물음표 자리에 값을 채워넣음
			ps.setInt(1, iq.getTravel());
			ps.setInt(2, iq.getGender());
			ps.setInt(3, iq.getAge());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
}

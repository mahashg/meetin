package meetin.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.joda.time.DateTime;

public class JDBCUtility {
	public static Integer readInt(ResultSet rs, String column){
		try {
			return rs.getInt(column);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static String readString(ResultSet rs, String column) {
		try {
			return rs.getString(column);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static DateTime readTimeStamp(ResultSet rs, String column) {
		try {
			return new DateTime(rs.getTime(column));
		} catch (SQLException e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean close(Connection conn){
		try {
			if(conn != null && !conn.isClosed()){
				conn.close();
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean close(Statement st){
		try {
			if(st != null && !st.isClosed()){
				st.close();
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean close(ResultSet rs){
		try {
			if(rs != null && !rs.isClosed()){
				rs.close();
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}

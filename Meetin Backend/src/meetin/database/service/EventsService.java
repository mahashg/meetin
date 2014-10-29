package meetin.database.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import meetin.database.model.Events;
import meetin.utility.JDBCUtility;

public class EventsService {
	public Events getEventById(Connection conn, Integer id){
		Statement stmt = null;
		ResultSet rs = null;
		try{
			stmt = conn.createStatement();
			String query = "Select * from events where id = "+id;
			rs = stmt.executeQuery(query);
			return new Events(rs);
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			JDBCUtility.close(rs);
			JDBCUtility.close(stmt);
		}
	}
}

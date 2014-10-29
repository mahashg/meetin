package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

import org.joda.time.DateTime;
@Data
public class Events {
	private Integer id;
	private String name;
	private String description;
	private String location;
	private Users created_by;
	private DateTime created_at;
	private DateTime start_ts;
	private DateTime end_ts;
	
	public Events(){
	}
	
	public Events(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.name = JDBCUtility.readString(rs, "name");
		this.description = JDBCUtility.readString(rs, "description");
		this.location = JDBCUtility.readString(rs, "location");
		this.created_by = Users.byId(JDBCUtility.readInt(rs, "created_by")); // TODO
		this.created_at = JDBCUtility.readTimeStamp(rs, "created_at");
		this.start_ts = JDBCUtility.readTimeStamp(rs, "start_ts");
		this.end_ts = JDBCUtility.readTimeStamp(rs, "end_ts");
		Object obj = new Object();
	}
	
	public static Events byId(Integer id){
		return null;
	}
}
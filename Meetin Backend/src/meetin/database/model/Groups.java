package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

@Data
public class Groups {
	private Integer id;
	private String name;
	private String description;
	private Users admin;
	
	public Groups() {
	
	}
	
	public Groups(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.name = JDBCUtility.readString(rs, "name");
		this.description = JDBCUtility.readString(rs, "description");
		this.admin = Users.byId(JDBCUtility.readInt(rs, "admin"));
	}
	
	public static Groups byId(Integer id){
		return null;
	}

}
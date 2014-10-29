package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

@Data
public class Users {
	private Integer id;
	private String name;
	private String pswd;
	private String organization;
	private String skills;
			
	public Users() {
		
	}
	
	public Users(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.name = JDBCUtility.readString(rs, "name");
		this.pswd = JDBCUtility.readString(rs, "pswd");
		this.organization = JDBCUtility.readString(rs, "organization");
		this.skills = JDBCUtility.readString(rs, "skills");
	}
	
	public static Users byId(Integer Id){
		return null;
	}
}
package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

import org.joda.time.DateTime;

@Data
public class GroupsMembership {
	private Groups group;
	private Users member;
	private DateTime joined_ts;
	
	public GroupsMembership() {
	
	}
	
	public GroupsMembership(ResultSet rs){
		this.group = Groups.byId(JDBCUtility.readInt(rs, "group_id"));
	}
}
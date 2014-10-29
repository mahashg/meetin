package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

import org.joda.time.DateTime;
@Data
public class EventsInvitee {
	private Users user;
	private Events event;
	private String attending_status;
	private DateTime invited_ts;
	private DateTime updated_ts;
	
	public EventsInvitee() {
	
	}

	public EventsInvitee(ResultSet rs){
		this.user = Users.byId(JDBCUtility.readInt(rs, "user_id"));
		this.event = Events.byId(JDBCUtility.readInt(rs, "events_id"));
		this.attending_status = JDBCUtility.readString(rs, "attending_status");
		this.invited_ts = JDBCUtility.readTimeStamp(rs, "invited_ts");
		this.updated_ts = JDBCUtility.readTimeStamp(rs, "updated_ts");
	}
}
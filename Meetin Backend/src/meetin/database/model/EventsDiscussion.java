package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

import org.joda.time.DateTime;

@Data
public class EventsDiscussion {
	private Integer id;
	private Events event;
	private String title;
	private DateTime created_at;
	private DateTime updated_at;
	
	public EventsDiscussion() {
	
	}
	
	public EventsDiscussion(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.event = Events.byId(JDBCUtility.readInt(rs, "event_id"));
		this.title = JDBCUtility.readString(rs, "title");
		this.created_at = JDBCUtility.readTimeStamp(rs, "created_at");
		this.updated_at = JDBCUtility.readTimeStamp(rs, "updated_at");
	}

	public static EventsDiscussion byId(Integer readInt) {
		return null;
	}
}
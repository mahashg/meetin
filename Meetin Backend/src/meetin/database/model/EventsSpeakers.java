package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

import org.joda.time.DateTime;

@Data
public class EventsSpeakers {
	private Integer id;
	private Events event;
	private Users speaker;
	private String title;
	private String description;
	private String link;
	private DateTime created_at;
	private DateTime updated_at;
	
	public EventsSpeakers() {
	
	}
	
	public EventsSpeakers(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.event = Events.byId(JDBCUtility.readInt(rs, "event_id"));
		this.speaker = Users.byId(JDBCUtility.readInt(rs, "speaker_id"));
		this.title = JDBCUtility.readString(rs, "title");
		this.description = JDBCUtility.readString(rs, "description");
		this.link = JDBCUtility.readString(rs, "link");
		this.created_at = JDBCUtility.readTimeStamp(rs, "created_at");
		this.updated_at = JDBCUtility.readTimeStamp(rs, "updated_ts");
	}

	public static EventsSpeakers byId(Integer readInt) {
		return null;
	}
}
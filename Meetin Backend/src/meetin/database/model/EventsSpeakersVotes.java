package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

@Data
public class EventsSpeakersVotes {
	private EventsSpeakers speaker;
	private Users user;
	private String status;
	
	public EventsSpeakersVotes() {
	
	}
	
	public EventsSpeakersVotes(ResultSet rs){
		this.speaker = EventsSpeakers.byId(JDBCUtility.readInt(rs, "speaker_id"));
		this.user = Users.byId(JDBCUtility.readInt(rs, "user_id"));
		this.status = JDBCUtility.readString(rs, "status");
	}
}
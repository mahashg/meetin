package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

@Data
public class EventsSpeakersComment {
	private Integer id;
	private EventsSpeakers speaker;
	private Users user;
	private String comment;
	
	public EventsSpeakersComment() {
	
	}
	
	public EventsSpeakersComment(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.speaker = EventsSpeakers.byId(JDBCUtility.readInt(rs, "speaker_id"));
		this.user = Users.byId(JDBCUtility.readInt(rs, "user_id"));
		this.comment = JDBCUtility.readString(rs, "comment");
	}
}
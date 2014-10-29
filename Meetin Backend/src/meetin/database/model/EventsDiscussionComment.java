package meetin.database.model;

import java.sql.ResultSet;

import lombok.Data;
import meetin.utility.JDBCUtility;

@Data
public class EventsDiscussionComment {
	private Integer id;
	private EventsDiscussion discussion;
	private Users user;
	private String comment;
	
	public EventsDiscussionComment() {
	
	}
	
	public EventsDiscussionComment(ResultSet rs){
		this.id = JDBCUtility.readInt(rs, "id");
		this.discussion = EventsDiscussion.byId(JDBCUtility.readInt(rs, "discussion_id"));
		this.user = Users.byId(JDBCUtility.readInt(rs, "user_id"));
		this.comment = JDBCUtility.readString(rs, "comment");
	}
}
package meetin.database.model;

public class EventsDiscussionComment {
	private Integer id;
	private EventsDiscussion discussion;
	private Users user;
	private String comment;
	
	public EventsDiscussionComment() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EventsDiscussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(EventsDiscussion discussion) {
		this.discussion = discussion;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}

/*
CREATE TABLE events_discussion_comment(
	id INTEGER AUTO_INCREMENT,
	discussion_id INTEGER REFERENCES events_discussion(id),
	user_id INTEGER REFERENCES users(id),
	content BLOB,
	
	PRIMARY KEY(id)
);
*/

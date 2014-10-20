package meetin.database.model;

public class EventsSpeakersComment {
	private Integer id;
	private EventsSpeakers speaker;
	private Users user;
	private String comment;
	
	public EventsSpeakersComment() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EventsSpeakers getSpeaker() {
		return speaker;
	}

	public void setSpeaker(EventsSpeakers speaker) {
		this.speaker = speaker;
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
CREATE TABLE events_speakers_comment(
	id INTEGER AUTO_INCREMENT,
	speaker_id INTEGER REFERENCES events_speakers(id),
	user_id INTEGER REFERENCES users(id),
	comment VARCHAR(2048),
	
	PRIMARY KEY(id)
);

*/

package meetin.database.model;

import org.joda.time.DateTime;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public Users getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Users speaker) {
		this.speaker = speaker;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public DateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(DateTime created_at) {
		this.created_at = created_at;
	}

	public DateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(DateTime updated_at) {
		this.updated_at = updated_at;
	}
}

/*
CREATE TABLE events_speakers(
	id INTEGER AUTO_INCREMENT,
	event_id INTEGER REFERENCES events(id),
	speaker_id INTEGER REFERENCES users(id),
	title VARCHAR(128),
	description BLOB,
	link VARCHAR(128),
	created_at TIMESTAMP,
	updated_at TIMESTAMP,
	
	PRIMARY KEY(id)

);
*/

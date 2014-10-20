package meetin.database.model;

public class EventsSpeakersVotes {
	private EventsSpeakers speaker;
	private Users user;
	private String status;
	
	public EventsSpeakersVotes() {
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
}

/*
CREATE TABLE events_speakers_votes(
	speaker_id INTEGER REFERENCES events_speakers(id),
	user_id INTEGER REFERENCES users(id),
	status ENUM('Y', 'N'),
	
	PRIMARY KEY(speaker_id, user_id)
);

*/

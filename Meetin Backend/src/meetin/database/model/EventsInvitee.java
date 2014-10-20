package meetin.database.model;

import org.joda.time.DateTime;

public class EventsInvitee {
	private Users user;
	private Events event;
	private String attending_status;
	private DateTime invited_ts;
	private DateTime updated_ts;
	
	public EventsInvitee() {
	
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public String getAttending_status() {
		return attending_status;
	}

	public void setAttending_status(String attending_status) {
		this.attending_status = attending_status;
	}

	public DateTime getInvited_ts() {
		return invited_ts;
	}

	public void setInvited_ts(DateTime invited_ts) {
		this.invited_ts = invited_ts;
	}

	public DateTime getUpdated_ts() {
		return updated_ts;
	}

	public void setUpdated_ts(DateTime updated_ts) {
		this.updated_ts = updated_ts;
	}
}

/*
CREATE TABLE events_invitees(
events_id INTEGER REFERENCES events(id),
user_id INTEGER REFERENCES users(id),
attending_status ENUM('Y', 'N', 'M') DEFAULT 'M',
invited_ts TIMESTAMP,
updated_ts TIMESTAMP,

PRIMARY KEY(events_id, user_id)
);
*/
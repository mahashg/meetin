package meetin.database.model;

import org.joda.time.DateTime;

public class EventsDiscussion {
	private Integer id;
	private Events event;
	private String title;
	private DateTime created_at;
	private DateTime updated_at;
}
/*
CREATE TABLE events_discussion(
id INTEGER AUTO_INCREMENT,
event_id INTEGER REFERENCES events(id),
title VARCHAR(2048),
created_at TIMESTAMP,
updated_at TIMESTAMP,

PRIMARY KEY(id)
);
*/
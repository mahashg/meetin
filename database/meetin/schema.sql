DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INTEGER AUTO_INCREMENT,
	name VARCHAR(128),
	pswd VARCHAR(128),
	organization VARCHAR(128),
	skills VARCHAR(256),
	
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS events;
CREATE TABLE events (
    id INTEGER AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
	description BLOB,
	location VARCHAR(2048),
	created_by INTEGER REFERENCES users(id),
	created_at timestamp,
	start_ts timestamp,
	end_ts timestamp,
	
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS events_invitees;
CREATE TABLE events_invitees(
	events_id INTEGER REFERENCES events(id),
	user_id INTEGER REFERENCES users(id),
	attending_status ENUM('Y', 'N', 'M') DEFAULT 'M',
	invited_ts TIMESTAMP,
	updated_ts TIMESTAMP,
	
	PRIMARY KEY(events_id, user_id)
);

DROP TABLE IF EXISTS groups;
CREATE TABLE groups(
	id INTEGER AUTO_INCREMENT,
	name VARCHAR(128),
	description BLOB,
	admin INTEGER REFERENCES users(id),
	
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS group_membership;
CREATE TABLE group_membership(
	group_id INTEGER REFERENCES groups(id),
	member_id INTEGER REFERENCES users(id),
	joined_ts timestamp,
	
	PRIMARY KEY(group_id, member_id)
);

DROP TABLE IF EXISTS events_speakers;
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

DROP TABLE IF EXISTS events_speakers_comment;
CREATE TABLE events_speakers_comment(
	id INTEGER AUTO_INCREMENT,
	speaker_id INTEGER REFERENCES events_speakers(id),
	user_id INTEGER REFERENCES users(id),
	comment VARCHAR(2048),
	
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS events_speakers_votes;
CREATE TABLE events_speakers_votes(
	speaker_id INTEGER REFERENCES events_speakers(id),
	user_id INTEGER REFERENCES users(id),
	status ENUM('Y', 'N'),
	
	PRIMARY KEY(speaker_id, user_id)
);

DROP TABLE IF EXISTS events_discussion;
CREATE TABLE events_discussion(
	id INTEGER AUTO_INCREMENT,
	event_id INTEGER REFERENCES events(id),
	title VARCHAR(2048),
	created_at TIMESTAMP,
	updated_at TIMESTAMP,
	
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS events_discussion_comment;
CREATE TABLE events_discussion_comment(
	id INTEGER AUTO_INCREMENT,
	discussion_id INTEGER REFERENCES events_discussion(id),
	user_id INTEGER REFERENCES users(id),
	comment BLOB,
	
	PRIMARY KEY(id)
);
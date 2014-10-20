package meetin.database.model;

import org.joda.time.DateTime;

public class GroupsMembership {
	private Groups group;
	private Users member;
	private DateTime joined_ts;
	
	public GroupsMembership() {
	
	}

	public Groups getGroup() {
		return group;
	}

	public void setGroup(Groups group) {
		this.group = group;
	}

	public Users getMember() {
		return member;
	}

	public void setMember(Users member) {
		this.member = member;
	}

	public DateTime getJoined_ts() {
		return joined_ts;
	}

	public void setJoined_ts(DateTime joined_ts) {
		this.joined_ts = joined_ts;
	}
}

/*
CREATE TABLE group_membership(
	group_id INTEGER REFERENCES groups(id),
	member_id INTEGER REFERENCES users(id),
	joined_ts timestamp,
	
	PRIMARY KEY(group_id, member_id)
);
*/

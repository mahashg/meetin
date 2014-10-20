package meetin.database.model;

import org.joda.time.DateTime;

public class Events {
	private Integer id;
	private String name;
	private String description;
	private String location;
	private Users created_by;
	private DateTime created_at;
	private DateTime start_ts;
	private DateTime end_ts;
	
	private Events(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Users getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Users created_by) {
		this.created_by = created_by;
	}

	public DateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(DateTime created_at) {
		this.created_at = created_at;
	}

	public DateTime getStart_ts() {
		return start_ts;
	}

	public void setStart_ts(DateTime start_ts) {
		this.start_ts = start_ts;
	}

	public DateTime getEnd_ts() {
		return end_ts;
	}

	public void setEnd_ts(DateTime end_ts) {
		this.end_ts = end_ts;
	}
	
	
}
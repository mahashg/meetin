package meetin.database.model;

public class Groups {
	private Integer id;
	private String name;
	private String description;
	private Users admin;
	
	public Groups() {
	
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

	public Users getAdmin() {
		return admin;
	}

	public void setAdmin(Users admin) {
		this.admin = admin;
	}	
}

/*
CREATE TABLE groups(
	id INTEGER AUTO_INCREMENT,
	name VARCHAR(128),
	description BLOB,
	admin INTEGER REFERENCES users(id),
	
	PRIMARY KEY(id)
);
*/

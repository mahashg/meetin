package meetin.database.model;

public class Users {
	private Integer id;
	private String name;
	private String pswd;
	private String organization;
	private String skills;
			
	public Users() {
		
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
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
}

/*
id INTEGER AUTO_INCREMENT,
name VARCHAR(128),
pswd VARCHAR(128),
organization VARCHAR(128),
skills VARCHAR(256),
*/
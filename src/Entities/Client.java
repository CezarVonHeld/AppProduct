package Entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;

	public Client(String name2, String email2, Date birthDate2) {
		this.name = name2;
		this.email = email2;
		this.birthDate = birthDate2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}

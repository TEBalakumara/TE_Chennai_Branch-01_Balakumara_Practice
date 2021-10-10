package com.te.practice;

public class Employ1 implements Comparable<Employ1> {
	private int id;
	private String Name;
	private String client;
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employ1 [id=" + id + ", Name=" + Name + ", client=" + client + ", role=" + role + "]";
	}

	public Employ1(int id, String name, String client, String role) {
		super();
		this.id = id;
		Name = name;
		this.client = client;
		this.role = role;
	}

	@Override
	public int compareTo(Employ1 o) {
	//	return this.id-o.id;
		return this.getName().compareTo(o.getName());
	//	return 0;
	}

}

package com.te.practice;

public class Employ implements Comparable<Employ> {
	
	private int id;
	private String Name;

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

	@Override
	public String toString() {
		return "Employ [id=" + id + ", Name=" + Name + "]";
	}

	public Employ(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public int compareTo(Employ o) {
		//return o.id-this.id;
		return this.getName().compareTo(o.getName());
		//return 0;
	}

	
}

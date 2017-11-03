package org.iss.refactoring.projectmgmt;

import java.util.ArrayList;

public class NormalProject extends Project {
	
	private ArrayList<String> members;
	
	public NormalProject(String name, Duration duration, double rate, int effortRequired, String manager) {
		super(name, duration, rate, effortRequired, manager);
		this.members = new ArrayList<String>();
	}
	
	public NormalProject(String name, Duration duration, double rate, int effortRequired, String manager,
			ArrayList<String> members) {
		this(name, duration, rate, effortRequired, manager);
		this.members = members;
	}

	public void addMember(String member) {
		members.add(member);
	}
	
	public String removeMember (String member) {
		members.remove(member);
		return member;
	}
	
	public ArrayList<String> getMembers() {
		return members;
	}

	@Override
	public String toString() {
		return "NormalProject [members=" + members + ", getName()=" + getName() + ", getManager()=" + getManager()
				+ ", getDuration()=" + getDuration() + ", getRate()=" + getRate() + ", getEffortRequired()="
				+ getEffortRequired() + "]";
	}
}

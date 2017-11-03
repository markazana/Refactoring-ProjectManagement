package org.iss.refactoring.projectmgmt;

public class Project {
	private String name = null;
	private Duration duration = null;
	private double rate = 0.0;
	private int effortRequired = 0;
	private String manager = null;
	
	public Project(String name, Duration duration, double rate, int effortRequired, String manager) {
		super();
		this.name = name;
		this.duration = duration;
		this.rate = rate;
		this.effortRequired = effortRequired;
		this.manager = manager;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public Duration getDuration() {
		return duration;
	}
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public int getEffortRequired() {
		return effortRequired;
	}
	
	public void setEffortRequired(int effortRequired) {
		this.effortRequired = effortRequired;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", duration=" + duration + ", rate=" + rate + ", effortRequired="
				+ effortRequired + ", manager=" + manager + "]";
	}
	
}

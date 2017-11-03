package org.iss.refactoring.projectmgmt;
import java.util.Calendar;


public class Duration {
	private Calendar from;
	private Calendar to;
	
	public Duration(Calendar from, Calendar to) {
		super();
		this.from = from;
		this.to = to;
	}

	public Calendar getFrom() {
		return from;
	}
	
	public void setFrom(Calendar from) {
		this.from = from;
	}
	
	public Calendar getTo() {
		return to;
	}
	
	public void setTo(Calendar to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Duration [from=" + from + ", to=" + to + "]";
	}
	
}

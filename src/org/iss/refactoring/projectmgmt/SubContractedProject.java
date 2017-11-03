package org.iss.refactoring.projectmgmt;

public class SubContractedProject extends Project {
	private String subContractedCompany = null;
	private String contactPerson = null;
	
	public SubContractedProject(String name, Duration duration, double rate, int effortRequired, String manager,
			String subContractedCompany, String contactPerson) {
		super(name, duration, rate, effortRequired, manager);
		this.subContractedCompany = subContractedCompany;
		this.contactPerson = contactPerson;
	}

	public void addMember(String member) {
		System.out.println("Sub-contracted project doesn't allow adding of members");
	}
	
	public String removeMember (String member) {
		System.out.println("Sub-contracted project doesn't allow removal of members");
		return null;
	}
	
	public String getSubContractedCompany() {
		return subContractedCompany;
	}
	
	public void setSubContractedCompany(String subContractedCompany) {
		this.subContractedCompany = subContractedCompany;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "SubContractedProject [subContractedCompany=" + subContractedCompany + ", contactPerson=" + contactPerson
				+ ", getName()=" + getName() + ", getManager()=" + getManager() + ", getDuration()=" + getDuration()
				+ ", getRate()=" + getRate() + ", getEffortRequired()=" + getEffortRequired() + "]";
	}
}

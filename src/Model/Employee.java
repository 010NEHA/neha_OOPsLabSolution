package Model;

public class Employee {
	
	String firstName;
	String lastName;
	String department;
	String emailID;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
	   this.firstName = firstName;
	}
	
    public String getLastName() {
    	return lastName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    	
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }
    
    public String getDepartment() {
    	return this.department;
    }
    
    public void setEmailAddress(String emailID) {
    	this.emailID = emailID;
    }
    
    public String getEmailAddress() {
    	return this.emailID;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public String getPassword() {
    	return this.password;
    }

}

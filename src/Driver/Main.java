package Driver;

import java.util.Scanner;

import Model.Employee;
import Service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		Employee employee = new Employee ();
		employee.setFirstName("Neha");
		employee.setLastName("Chaudhary");
		
		System.out.println("please enter the department from the following");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Hr");
		System.out.println("4. Legal");
		
		int option = scan.nextInt();
		
		switch(option) {
		
			case 1: employee.setDepartment("Technical");
					break;
			case 2: employee.setDepartment("Admin");
					break;
			case 3: employee.setDepartment("Hr");
				
					break;
			case 4: employee.setDepartment("Legal");	
					
		}
		
		CredentialService service = new CredentialService();
		
		String emailID = service.generateEmailAddress(employee);
		String password = service.generatePassword();
		
		employee.setEmailAddress(emailID);
		employee.setPassword(password);
		
		service.showCredentials(employee);
	
		scan.close();
		// testing git
	}

}

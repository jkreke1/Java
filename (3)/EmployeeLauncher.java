
public class EmployeeLauncher {

	public static void main(String[] args) {
		//Creating Employee objects
		Employee[] employees = new Employee[3];
		
		for(int i = 0; i <= employees.length - 1; i++){
			employees[i] = new Employee();
		}
		
		//Assigning object data
		employees[0].setName("Susan Meyers");
		employees[0].setIdNumber(47899);
		employees[0].setDepartment("Accounting");
		employees[0].setPosition("Vice President");
		
		employees[1].setName("Mark Jones");
		employees[1].setIdNumber(39119);
		employees[1].setDepartment("IT");
		employees[1].setPosition("Programmer");

		employees[2].setName("Joy Rogers");
		employees[2].setIdNumber(81774);
		employees[2].setDepartment("Manufacturing");
		employees[2].setPosition("Engineer");
		
		//Display object data
		System.out.println("Name\t\t\tID Number\tDepartment\t\tPosition");
		System.out.println("-------------------------------------------------------------------------------");
		for(int i = 0; i < employees.length; i++){
			System.out.print(employees[i].getName() + "\t\t");
			System.out.print(employees[i].getIdNumber() + "\t\t");
			System.out.print(employees[i].getDepartment() + "\t\t");
			if(i == 1){
				System.out.print("\t");
			}
			System.out.print(employees[i].getPosition() + "\n");
		}

	}

}

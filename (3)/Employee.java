
public class Employee {
	//Fields
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee() {
		
	
	}
	
	//Properties
	public String getName(){
		return name;
	}
	public void setName(String Name){
		this.name = Name;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	public void setIdNumber(int IdNumber){
		this.idNumber = IdNumber;
	}
	
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String Department){
		this.department = Department;
	}
	
	public String getPosition(){
		return position;
	}
	public void setPosition(String Position){
		this.position = Position;
	}

}

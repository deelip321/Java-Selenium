
public class Employee {
	// instance variable will not be stored in the ram
	int empId;
	String empName;
	String empDesg;
	String empSalary;

	
	public Employee(int empId, String empName, String empDesg, String empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
	}

	public static void main(String[] args) {
		// 1st emp joined the company
		// creating object to store instance variable in the ram
		Employee obj1 = new Employee(1, "ABC", "SE", "4 lakhs");
		System.out.println(obj1.empId);
		System.out.println(obj1.empName);
		System.out.println(obj1.empDesg);
		System.out.println(obj1.empSalary);
		// 2nd emp joined the company
		Employee obj2 = new Employee(2, "XYZ", "SSE", "10 lakhs");
		System.out.println(obj2.empId);
		System.out.println(obj2.empName);
		System.out.println(obj2.empDesg);
		System.out.println(obj2.empSalary);
	}

}

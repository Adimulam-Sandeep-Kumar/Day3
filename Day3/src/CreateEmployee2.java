import java.time.LocalDateTime;

public class CreateEmployee2 {

	public static void main(String[] args) {
		
		Address res = new Address("Firs Floor 126","Sundaram","Hyderabad");
		Address comm = new Address("IIT Campus 162","Gachibowli","Hyderabad");
		Employee emp=new Employee(101,"John Doe",LocalDateTime.now(),res,comm,1);
		
		Address resE1 = new Address("1234","Krishnam","Hyderabad");
		Address commE1 = new Address("IIT Campus 162","Gachibowli","Hyderabad");
		Employee emp1=new Employee(102,"John Doe",LocalDateTime.now(),resE1,commE1,1);
		
		Address resE2 = new Address("5678","Srnagar","Hyderabad");
		Address commE2 = new Address("IIT Campus 162","Gachibowli","Hyderabad");
		Employee emp2=new Employee(103,"John Doe",LocalDateTime.now(),resE2,commE2,1);
		
		Address resE3 = new Address("6574","Nagar","Hyderabad");
		Address commE3 = new Address("IIT Campus 162","Gachibowli","Hyderabad");
		Employee emp3=new Employee(104,"John Doe",LocalDateTime.now(),resE3,commE3,1);

		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		emp.setManagerId(121);
		emp1.setManagerId(122);
		emp2.setManagerId(123);
		emp3.setManagerId(124);
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
	}

}

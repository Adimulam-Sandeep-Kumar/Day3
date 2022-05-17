import java.time.LocalDateTime;

public class CreateEmployee {

	public static void main(String[] args) {
		
		Address res = new Address("Firs Floor 126","Sundaram","Hyderabad");
		Address comm = new Address("IIT Campus 162","Gachibowli","Hyderabad");
		
		Employee emp=new Employee(101,"John Doe",LocalDateTime.now(),res,comm,1);
		
		System.out.println(emp);
		
		System.out.println(emp);
		
		System.out.println(emp.getResidence());
		System.out.println(emp.getCommunication());
		
		System.out.println(Math.round(34.8878787878));
				
	}

}

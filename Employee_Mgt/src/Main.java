import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {	
    //List to save all our employees in Memory
	static List Employess = new ArrayList();
		
	public static void main(String[] args) {
		
		//Employee1
		Employee emp1 = new Employee();
		setContract(new Date (), new Date (12/12/2019), Contract.Type.MEDIUM, emp1);
		setNames("Mutesa" , "Moses" ,emp1);
		setAddres("Kampla", "Uganda" ,emp1);
		saveEmployee(1 ,new Date(12/03/1992) ,emp1);
		
        //Employee2

		Employee emp2 = new Employee();
		setContract(new Date (), new Date (12/12/2019), Contract.Type.LONG, emp2);
		setNames("Mutesa2" , "Moses2" ,emp2);
		setAddres("Kampla", "Uganda" ,emp2);
		saveEmployee(2 ,new Date(12/03/1992) ,emp2);
		
		System.out.println(Employess.toString());		
	}
	
  @SuppressWarnings("unchecked")
public static void saveEmployee(int id,Date dateOfBirth ,Employee emp) {
	  
	  Map map = new HashMap();
	  emp.setId(id);
	  emp.setDateOfBirth(dateOfBirth);
	  map.put("First Name" , emp.getNames().getFirstName()); 
	  map.put("Last Name" , emp.getNames().getLastName()); 
	  map.put("Address" , emp.getAddress().getCity() +" , " +emp.getAddress().getCountry());
	  map.put("Contract start" , emp.getContract().getStartDate());
	  map.put("Contract expry" , emp.getContract().getExpiryDate());
	  map.put("Contract type" , emp.getContract().getType());
	  Employess.add(map);	  
   }
  
 public static void setContract(Date startDate ,Date expiryDate ,Contract.Type type, Employee emp) {
	 Contract contract = new Contract(startDate,expiryDate ,type); 
	 emp.setContract(contract);
   }
 
 public static void setNames(String firstName, String lastName ,Employee emp) {
	 Names names=  new Names(firstName,lastName); 
	 emp.setNames(names);
 }
   
 public static void setAddres(String city, String country, Employee emp) {
	 Adress address= new Adress(city,country);
	 emp.setAddress(address);
 }  
}

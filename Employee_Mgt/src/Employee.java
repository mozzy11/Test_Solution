import java.util.Date;

public class Employee {

	private int id;
	private Date dateOfBirth ; 
	private Adress address;
	
	private Contract contract;
	private Names names ;
	
	public Employee() {
	}
	
	public Employee(int id,Date dateOfBirth) {
		this.id = id;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee(int id,Date dateOfBirth, Adress address, Contract contract , Names names) {
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.address = address ;
		this.contract = contract;
		this.names= names;	
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	public Names getNames() {
		return names;
	}
	
	public void setNames(Names names) {
		this.names = names;
	}
	public Adress getAddress() {
		return address;
	}

	
	public void setAddress(Adress address) {
		this.address = address;
	}
		
}

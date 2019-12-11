import java.util.Date;

public class Contract {
	
	private Date startDate;
	private Date expiryDate;
	private Type type;
	
	public enum Type {
		SHORT , LONG , MEDIUM
	}
	
	public Contract(Date startDate ,Date expiryDate ,Type type) {
	this.startDate = startDate;	
	this.expiryDate = expiryDate; 
	this. type = type;
	};
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}

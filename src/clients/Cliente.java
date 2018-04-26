package clients;

public abstract class Cliente {
	private int id;
	private String address;
	private String phone;
	private String email;
	public static int lastId=0;
	
	/*
	 * CONSTRUCTORES
	 */
	
	public Cliente(String address,String phone, String email){		
		lastId++;
		this.id=lastId;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	
	public Cliente(){		
		lastId++;
		this.id=lastId;
	}
	/*
	 * GETTERS
	 */
	
	public String getAddress(){
		return address;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getEmail(){
		return email;
	}
	
	/*
	 * SETTERS
	 */
	
	public void setAddress(String address){
		this.address=address;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	/*
	 * Abstract metodos
	 */
	
	public abstract String getInformation();
}
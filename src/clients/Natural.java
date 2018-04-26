package clients;

public class Natural extends Cliente{
	String identification;
	String name;
	String surname;
	
	public Natural(String identification,String name,String surname, String address,String phone, String email){
		super(address,phone,email);
		this.identification=identification;
		this.name=name;
		this.surname=surname;
	}

	public Natural(String identification,String name,String surname){
		this.identification=identification;
		this.name=name;
		this.surname=surname;
	}	
	
	public Natural(){
		super();
	}
	
	/*
	 * GETTERS
	 */
	public String getIdentification(){
		return identification;
	}
	
	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}
	/*
	 * SETTERS
	 */
	
	public void setIdentification(String identification){
		this.identification=identification;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public void setSurname(String surname){
		this.surname=surname;
	}

	
	/*
	 * Abstract metodos heredados
	 */
	
	public String getInformation(){
		return "Cliente Natural:";
	}

}
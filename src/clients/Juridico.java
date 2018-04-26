package clients;

public class Juridico extends Cliente {
	private String rif;
	private String razon_social;
	
	public Juridico(String rif, String razon_social, String address,String phone, String email){
		super(address,phone,email);
		this.rif=rif;
		this.razon_social=razon_social;
	}

	public Juridico(String rif, String razon_social){
		this.rif=rif;
		this.razon_social=razon_social;
	}
	
	public Juridico(){
		super();
	}
	
	/*
	 * GETTERS
	 */
	public String getRif(){
		return rif;
	}
	
	public String getRazon_social(){
		return razon_social;
	}
	
	/*
	 * SETTERS
	 */
	
	public void setRif(String rif){
		this.rif=rif;
	}
	
	public void setRazon_social(String razon_social){
		this.razon_social=razon_social;
	}
	
	/*
	 * Abstract metodos heredados
	 */
	
	public String getInformation(){
		return "Cliente Juridico:";
	}
	
}

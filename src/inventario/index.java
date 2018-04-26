package inventario;
import java.util.Scanner;
import clients.*;
public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al Sistema de Inventario, empecemos cargando clientes");
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuántos clientes para empezar:");
		int nClientes=sc.nextInt();
		int optType=0;
		Cliente[] arrayClientes=new Cliente[nClientes];
		Cliente newClient;
		for(int i=0;i<nClientes;i++){
			do{
				System.out.println("Presione 1 para agregar un cliente natural, 2 para cliente juridico");
				optType=sc.nextInt();				
			}while(optType!=1 && optType!=2);
			
			
			if(optType==1){
				System.out.println("Identificación:");
				String identification=sc.next();
				
				System.out.println("Name:");
				String name=sc.next();

				System.out.println("Surname:");
				String surname=sc.next();				
				
				newClient=new Natural(identification,name,surname);
			}else{
				System.out.println("Rif:");
				String rif=sc.next();
				
				System.out.println("Razon Social:");
				String razon_social=sc.next();
			
				newClient=new Juridico(rif,razon_social);
			}
			
			System.out.println("Address:");
			String address=sc.next();

			System.out.println("Phone:");
			String phone=sc.next();

			System.out.println("Email:");
			String email=sc.next();
			
			newClient.setAddress(address);
			newClient.setPhone(phone);
			newClient.setEmail(email);
			arrayClientes[i]=newClient;
		}
		System.out.println("----LISTADO-----");
		for(Cliente c:arrayClientes){
			System.out.println(c.getInformation() + "\n");
		}
		System.out.println("Adios");
		System.exit(0);
	}

}

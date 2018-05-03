package ejercicios;
import java.util.Scanner;
public class menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		String[] enunciados=Opcion.listOpciones();
		int longitud=enunciados.length;
		do{ 
			System.out.println("------MENU DE EJERCICIOS---------");
			
			for(int i=0;i<longitud;i++){
					System.out.println((i+1) + "-) " + enunciados[i]);	
			}
			/*Iremos agregando opciones*/
			System.out.println("Seleccione su opción:");
			opcion=sc.nextInt();
			Opcion op;
			if(opcion<longitud){
				op=new Opcion(opcion);
				System.out.println(op.getEnunciado());
				op.execute();
			}
			
		}while(opcion!=longitud);
		
		System.out.println("Adios");
		System.exit(0);
	}

}

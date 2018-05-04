package ejercicios;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Opcion {
	private int numero;
	private String enunciado;
	private static final String[] enunciados={
			"Dado un fichero con una serie de números, hay que eliminar todos los ceros que hay en el fichero, y si una linea esta llena de ceros, hay que eliminar la linea.",
			"Ejercicio 2",
			"Ejercicio 3",
			"Ejercicio 4",
			"Ejercicio 5",
			"Ejercicio 6",
			"Ejercicio 7",
			"Salir"
	}; 
	
	public Opcion(int numero,String enunciado){
		this.numero=numero;
		this.enunciado=enunciado;
	}
	
	public Opcion(int numero){
		this.numero=numero;
		this.enunciado=enunciados[numero-1];
	}
	
	/*
	 * GETTERS
	 */
	public int getNumero(){
		return numero;
	}
	
	public String getEnunciado(){
		return enunciado;
	}
	
	/*
	 * SETTERS
	 */
	
	public void setNumero(int numero){
		this.numero=numero;
	}

	public void setEnunciado(String enunciado){
		this.enunciado=enunciado;
	}
	
	public static String[] listOpciones(){
		return enunciados;
	}
	
	public void execute(){
		Scanner sc=null;
		ArrayList<String> matriz=new ArrayList<String>();
		switch(numero){
			case 1:
			try {
				File fichero = new File("./matriz.txt");
				sc = new Scanner(fichero);
				
				while(sc.hasNextLine()){
					String linea=sc.nextLine();
					String fila="";
				     for(char c:linea.toCharArray()){
			    		 if(c!='0' && c!=' '){
			    			 fila+=c;
			    		 }
				     }
				     matriz.add(fila);
				     System.out.println(linea);
				}
				/*
				 * Imprimimos la nueva matriz
				 */
				System.out.println("MATRIZ SIN CEROS");
				Iterator<String> iteratorMatriz=matriz.iterator();
				while(iteratorMatriz.hasNext()){
					String fila=iteratorMatriz.next();
					String ac="";
					for(char c:fila.toCharArray()){
						ac+=c + " ";
					}
					if(ac!=""){
						System.out.println(ac);						
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		}
	}

}

import java.util.Scanner; //SE IMPORTA LA CLASE 

public class codigo6 {
	
	public static void main(String[] args) {
	    int[] n = new int[20]; //NEW ERROR DE SINTASIX CON ?

	    for (int i = 0; i < 20; i++) { //ERROR DE SINTASIX SOLO HABIA UNA + Y ES ++
	    	n[i] = (int)(Math.random() * 381) + 20;
	    	System.out.print(n[i] + " "); //SE DEFINIO EL METODO 
	    }
	
	    System.out.println("\n¿Qué números quiere resaltar? "); //METODO SIN DEFINIR
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner scanner = new Scanner (System.in); //SE AGREGA SCANNER
	    int opcion = Integer.parseInt(scanner.nextLine());//Se agrea un metodo que regerese una linea

	    int multiplo = (opcion == 1) ? 5 : 7; //ERROR DE SINATXIS

//	    foreach (char e : n) {
//	      if (e % multiplo == 0) {
//	        System.out.print("[" + e + "] ");
//	       else {
//	        System.in.print(e + " ");
//	       }
//	      }
//	  
//	    }
	    
	    //DEFINIR UN NUEVO CONTRUCTOR
	    
	    for (int e : n) {
	    	if (e % multiplo == 0) {
	    		System.out.println("[" + e + "] ");
	    	}else {
	    		System.out.println(e + " ");
	    	}
	    }
		
	}
}
	  




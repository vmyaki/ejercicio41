import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declaramos variable precio
		double precio=1;
		
		//Creamos array
		List <Parada> listaParadas= new ArrayList <Parada>();
		
		//Añadimos las paradas al array
		listaParadas.add(new Parada (1,"Malaga-Centro",true));
		listaParadas.add(new Parada (2,"María Zambrano",false));
		listaParadas.add(new Parada (3,"Victoria Kent",true));
		listaParadas.add(new Parada (4,"Guadalhorce",false));
		listaParadas.add(new Parada (5,"Aeropuerto",true));
		listaParadas.add(new Parada (6,"Plaza Mayor",true));
		listaParadas.add(new Parada (7,"Malaga-Centro",true));
		listaParadas.add(new Parada (8,"María Zambrano",false));
		listaParadas.add(new Parada (9,"Los Alamos",true));
		listaParadas.add(new Parada (10,"La Colina",false));
		listaParadas.add(new Parada (11,"Torremolinos",true));
		listaParadas.add(new Parada (12,"Fuengirola",true));
		
		//Imprimimos por pantalla la lista
		for(int i=0; i<listaParadas.size()-1; i++) {
			
			System.out.println(listaParadas.get(i));
		}
		
		//Pedimos por teclado origen y destino
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("\nIntroduce id de origen:");
		int origen=teclado.nextInt();
		
		System.out.println("\nIntroduce id de destino:");
		int destino=teclado.nextInt();
		
		//Imprimimos la ruta solicitada
		for(int i=origen-1; i<destino; i++) {
					
			System.out.println(listaParadas.get(i));
			
			//Comprobamos si cada parada tiene torno o no
			if(listaParadas.get(i).isTieneTorno()) {
				
				System.out.println("Esta parada tiene torno así que debes pagar "+precio+"€");
			}
			else {
				System.out.println("Esta parada no tiene torno, su viaje es gratis");
			}
		}
		
	}

}

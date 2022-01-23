package org.iesalandalus.programacion.citasclinica;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static boolean salir;
	int opcion;
	
	public static void main(String[] args) {
		System.out.println("Programa para gestionar las citas de la Clínica. ( ͡❛ ͜ʖ ͡❛)✌ ");
		System.out.println("===========================================================");
		
		do {
			mostrarMenu();
			ejecutarOpcion(elegirOpcion());
			
			} while (!salir);
			System.out.println("Programa finalizado");
			}


	
		private static void ejecutarOpcion(Object elegirOpcion) {
			
			
			switch (opcion) {
			
			case 1:
				insertarCita();
				break;
			
			case 2:
				buscarCita();
				break;
			
			case 3:
				borrarCita();
				break;
				
			case 4:
				mostrarCitas();
				break;
				
			case 5:
				mostrarCitasDia();
				break;
				
			case 6:
				salir=true;
				System.out.println("Saliendo...");
				break;
			
			default:
				throw new IllegalArgumentException("Opcion no válida: " + opcion);
		}
		
	}



		private static int mostrarMenu() {
		
		int opcion;
		
		System.out.println("1. opcion");
		System.out.println("2. opcion");
		System.out.println("3. opcion");
		System.out.println("4. opcion");
		System.out.println("5. opcoin");
		System.out.println("6. salir");
		do {
			
		System.out.println("Introduce una opcion (1-5): ");
		opcion=Entrada.entero();
		
		}while (opcion<1 || opcion>6);
		return opcion;
		
		}
		
		
		private static void mostrarCitasDia() {
			// TODO Auto-generated method stub
			
		}



		private static void mostrarCitas() {
			// TODO Auto-generated method stub
			
		}



		private static void borrarCita() {
			// TODO Auto-generated method stub
			
		}



		private static void buscarCita() {
			// TODO Auto-generated method stub
			
		}



		private static void insertarCita() {
			// TODO Auto-generated method stub
			
		}
	
		private static void main() {
			
			//Muestra el menu de la aplicacion y nos pedirá una opción 
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	


package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declaramos las variables y los arrays necesarios.
		
		final int CANT_INICIAL=5; //Variable con la que rellenamos incialmente la matriz de cantidades de golosinas.
		int respuesta; //Respuesta que da el usuario.
		int fila; //Fila que indica el usuario.
		int columna; //columna que indica el usuario.
		boolean index=true; //Variable que indica si la posición existe.
		boolean existeGolosina=true; //Varibale que guarda si hay existencias de esa golosina.
		int cantidad = 1; //Cantidad de golosinas deseadas.
		String contraseña="Maquina2023"; //la contraseña que debe introducir el técnico.
		
		
		//Rellenamos la matriz rellenarMatriz.
		MaquinaGolosinas.rellenarMatriz(CANT_INICIAL);
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);
		
		do {
		
		//Preguntamos al usuario.
		
		System.out.println("Bienvenido/a a la máquina de golosinas.");
		System.out.println("1. Mostrar golosinas.");
		System.out.println("2. Pedir golosinas.");
		System.out.println("3. Rellenar golosinas.");
		System.out.println("4. Apagar máquina.");
		System.out.println(	"Por favor, introduzca la opción que desee: ");
		respuesta=sc.nextInt();
		
		//Mostramos las golosinas.
		if (respuesta==1) {
			
			MaquinaGolosinas.mostrarGolosinas();
			
		
		//Pedimos la posición de las golosinas que queremos.
		} else if (respuesta==2) {
			
			System.out.println("Por favor, indique el código de la golosina que desee: ");
			System.out.println("Indique la fila (primer número del código): ");
			fila=sc.nextInt();
			
			System.out.println("Indique la columna (segundo número del código): ");
			columna=sc.nextInt();
			
			//Comprobamos si existe.
			
			index=MaquinaGolosinas.validarPos(fila, columna);
			
			//En caso de que no exista, saltará un mensaje de error.
			if (!index) {
				
				System.out.println("ERROR. Ha introducido un código no válido.");
				
			
			//En caso, de que sea un código correcto, comprobamos si hay existencias de la golosina en cuestión.
			} else {
				
				existeGolosina= MaquinaGolosinas.hayValorPosicion(fila, columna);
				
				//En caso de que no haya existencias de las golosinas, saltará un mensaje.
				if (!existeGolosina) {
					
					System.out.println("No hay existencias de esta golosina. Disculpe las molestias.");
					
				//En caso de que sí haya existencias.
				} else {
					
					System.out.println("Se ha añadido 1 "+MaquinaGolosinas.nombresGolosinas[fila][columna]+ "a su carrito.");
					
					//Ahora tenemos que añadir una venta e incrementar el precio total de la compra.
					MaquinaGolosinas.anyadirVenta(fila, columna);
					
					//Y reducimos las existencias de esa golosina.
					MaquinaGolosinas.reducirPosicion (fila, columna, cantidad);
				}
				
			}
			
			
		} else if (respuesta==3) {
			
			System.out.println("Por favor, introduzca la contraseña: ");
			contraseña=sc.next();

			//Pedimos la contraseña.
			
			if (!contraseña.equals(contraseña)) {
				
				System.out.println("La contraseña es incorrecta.");
				
				
			} else {
				
				System.out.println("Por favor, indique el código de la golosina que desee: ");
				System.out.println("Indique la fila (primer número del código): ");
				fila=sc.nextInt();
				
				System.out.println("Indique la columna (segundo número del código): ");
				columna=sc.nextInt();
				
				//Validamos la posición.
				index=MaquinaGolosinas.validarPos(fila, columna);
				
				if (index==true) {
					
					System.out.println("Indique la cantidad de golosinas que va a rellenar: ");
					cantidad=sc.nextInt();
					
					//Invocamos la función de rellenar esa golosina.
					MaquinaGolosinas.aumentarPosicion(fila, columna, cantidad);
				}
				
			};
			
		}
		
		} while (respuesta!=4);
		
		//Imprimimos las ventas totales.
		MaquinaGolosinas.imprimirVentasTotales();
			
	}

}

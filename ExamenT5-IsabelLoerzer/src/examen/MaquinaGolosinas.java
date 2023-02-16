package examen;

import java.util.Arrays;

/**
 * Clase que define una máquina de golosinas. En esta clase 
 * se rellena una matriz con las existencias de los distintos tipos
 * de golosina, se valida la posición de esa golosina en una matriz, 
 * se puede conocer su precio e imprime un ticket final con la cantidad
 * de golosinas que se quiere comprar y el precio total del carrito.
 * 
 * @author ikloerzer
 *
 */

public class MaquinaGolosinas {
	
	/**
	 * Atributo estático que es una matriz de String, 
	 * rellena con los distintos tipos de golosinas que hay.
	 */
	
	static String[][] nombresGolosinas = {
			{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
			{"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
			{"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
			{"Lacasitos", "Crunch", "Milkybar", "KitKat"}
			
	};
	
	/**
	 * Atributo estático que es una matriz de números con decimales,
	 * referente al precio que tiene cada golosina.
	 */
	
	static double[][] precio = {
			{1.1, 0.8, 1.5, 0.9},
			{1.8, 1, 1.2, 1},
			{1.8, 1.3, 1.2, 0.8},
			{1.5, 1.1, 1.1, 1.1}
			
	};
	
	/**
	 * Atributo estático que es una matriz vacía, 
	 * que se rellena con las existencias que hay de 
	 * cada golosina.
	 */
	
	static int[][] cantGolosinas= new int[4][4];
	
	/**
	 * Atributo estático que es una tabla vacía que se 
	 * irá rellenando con las golosinas vendidas. Es decir,
	 * el carrito.
	 */
	
	static String[] ventas= new String[0];
	
	/**
	 * Atributo estático que se refiere al precio 
	 * total del carrito.
	 */
	
	static double total=0;
	
	/**
	 * Función que rellena e imprime la matriz con las existencias
	 * iniciales de golosinas.
	 *  
	 * @param num numero inicial de la cantidad de golosinas
	 */
	
	public static void rellenarMatriz (int num) {
		
		for (int i=0; i< cantGolosinas.length; i++) {
			
			for (int j=0; j<cantGolosinas.length;j++) {
				
				cantGolosinas[i][j]=num;
				
			}
			
		System.out.println(Arrays.toString(cantGolosinas));
		
		}
		
		
	}
	
	/**
	 * Función que imprime el código, nombre y precio de 
	 * cada golosina.
	 */
	
	public static void mostrarGolosinas() {
		
		System.out.println("Listados de golosinas disponibles:");
		

	}
	
	/**
	 * Función que comprueba si el código que introduce el usuario existe.
	 * 
	 * @param fila número de la fila en la matriz nombresGolosinas.
	 * @param columna número de la columna en la matriz nombresGolosinas.
	 * @return un booleano que indica si esa posición es válida o no.
	 */
	
	public static boolean validarPos (int fila, int columna) {
		
		boolean indexFila = false;
		boolean indexColumna= false;
		
		boolean indexPos=false;
		
		 // En este índice almacenaremos el índice en el que se encuentre el elemento buscado
        int indiceBusqueda = 0;
        

        // Mientras no encontremos el valor y no hayamos llegado al final de la tabla
        // incrementamos en 1 el índice de búsqueda
        while (indiceBusqueda < nombresGolosinas[fila].length && fila != nombresGolosinas[indiceBusqueda]) {
            indiceBusqueda++;
        }

        // En caso de que el índice sea mayor que la longitud de la tabla
        // significa que no hemos encontrado el elemento
        if (indiceBusqueda >= nombresGolosinas.length) {
            indiceBusqueda = -1;
        }
		
		return indexPos;
	}

	/**
	 * Función que comprueba si hay existencias en la posición que introduce el usuario.
	 * 
	 * @param fila número de la fila en la matriz cantGolosinas.
	 * @param columna número de la columna en la matriz cantGolosinas.
	 * @return un booleano que indica si en la posición indicada hay golosinas o no.
	 */
	public static boolean hayValorPosicion(int fila, int columna) {
		
		boolean hayCant;
		
		//hay que buscar la posición indicada en la matriz cantGolosinas.
		
		
		return hayCant;
	}
	
	/**
	 * Función que aumenta e imprime la cantidad introducida en una posición concreta
	 * de la matriz cantGolosinas. 
	 * 
	 * @param fila número de la fila en la matriz cantGolosinas
	 * @param columna número de la columna en la matriz cantGolosinas.
	 * @param cantidad número de golosinas que se añaden.
	 */
	public static void aumentarPosicion (int fila, int columna, int cantidad) {
		
		//Declaramos el valor que vamos a aumentar.
		cantidad= cantGolosinas [fila][columna];
		
		cantidad++;
		
	}
	
	/**
	 * Función que reduce en 1 e imprime la cantidad de golosinas que hay
	 * en una posición concreta de la matriz cantGolosinas. 
	 * 
	 * @param fila número de la fila en la matriz cantGolosinas
	 * @param columna número de la columna en la matriz cantGolosinas.
	 * @param cantidad número de golosinas que se reducen.
	 */
	
	public static void reducirPosicion (int fila, int columna, int cantidad) {
		
		//Declaramos el valor que vamos a reducir.
		cantidad= cantGolosinas [fila][columna];
		
		cantidad--;
		
	}
	
	/**
	 * Función que añade una venta a la tabla ventas e incrementa el precio
	 * total del carrito.
	 * 
	 * @param fila número de la fila en la matriz precio.
	 * @param columna número de la columna en la matriz precio.
	 */
	public static void anyadirVenta (int fila, int columna) {
		
		 String nuevaGolosina = nombresGolosinas[fila][columna];
		 double precio= precio[fila][columna];
		 	
		 	//Añadimos la nueva golosina a la tabla ventas.
	        // Copiamos en la misma variable tabla la misma tabla pero con una posición más
	        ventas = Arrays.copyOf(ventas, ventas.length+1);   

	        // Añadimos en la última posición de la tabla el elemento a insertar
	        ventas[ventas.length-1] = nuevaGolosina; 
		
	        //Añadimos el precio de la venta de la nueva golosina.
	        total+= precio;
		
	}
	
	/**
	 * Función que imprime las ventas totales (el carrito, la cantidad de 
	 * golosinas totales) y el precio total que deberá pagar el usuario.
	 */
	public static void imprimirVentasTotales() {
		
		//Imprimimos las ventas y el total a pagar.
		System.out.println("Ha salido de la máquina de golosinas.");
		System.out.println("A continuación se imprimirá el ticket de su compra.");
		System.out.println("Carrito de golosinas: ");
		System.out.println(Arrays.toString(ventas));
		System.out.println("Precio total de la venta: "+total+" euros.");

	}
}

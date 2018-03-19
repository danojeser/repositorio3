package clases;

public class Array {

	public Array() {
		
	}
	
	public static void rellenarArray(int [] lista) {
		for(int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 20);
		}
	}
	
	public static void sumaArray(int [] lista) {
		int acum = 0;
		int cont = 0;
		for(int i = 0; i < lista.length; i++) {
			acum += lista[i];
			if(lista[i] < 10) cont++; 
		}
		System.out.println(acum);
		System.out.println(cont);
	}
	
	public static void imprimirArray(int[] lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public static void elementosImpares(int[] lista) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] % 2 == 1)
				System.out.println(lista[i]);
		}
	}
	
	
	public static void mostrarPares(int[] lista) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] % 2 == 0)
				System.out.println(lista[i]);
		}
	}


	public static void nuevoMetodo1(){
		System.out.println("Esto es metodo 1 de copia1");
	}

	public static void nuevoMetodo2(){
		System.out.println("Esto es metodo 2 de copia2");
	}

}

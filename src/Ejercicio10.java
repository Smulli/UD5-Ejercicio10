import javax.swing.JOptionPane;

public class Ejercicio10 {
	
	public static void main (String args[]) {
		String text = JOptionPane.showInputDialog("Introduzca numero de ventas: ");
		
		int canVentas = Integer.parseInt(text);//Declaramos la variable para la cantidad de ventas.
		
		int sumaVentas = 0; //Declaramos la variable para sumar las ventas.
		
		for (int i = 0; i<canVentas;i++) {
			//Introduzco el número de ventas-
					text = JOptionPane.showInputDialog("Introduzca precio de venta" + (i+1));
					
					int venta = Integer.parseInt(text);
					
					sumaVentas = sumaVentas+venta;
		}
		System.out.println(sumaVentas);
	}

}
	
	
	



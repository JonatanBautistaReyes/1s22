import java.util.Scanner;

public class p13_1s22{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    String operacion;
        int num1;
        int num2;
        int resultado;

	    System.out.println("Programa que realiza operaciones basicas");
	    System.out.println("que operacion desea: Suma, Resta, Division, Multiplicacion?");
	    operacion = teclado.nextLine();

	    if (operacion.equals("suma")) {
		    System.out.println("aqui debemos realizar una suma");
		    System.out.println("ingresa el primer numero; ");
		    num1 = teclado.nextInt();
		    System.out.println("ingresa el segundo numero; ");
		    num2 = teclado.nextInt();
		    resultado = num1 + num2;
		    System.out.println("el resultado de la suma es; " + resultado);
	    }	
	    else if (operacion.equals("Resta")) {
		    System.out.println("Aqui debemos realizar uma resta");
		    System.out.println("ingresa el primer numero; ");
		    num1 = teclado.nextInt();
		    System.out.println("ingresa el segundo numero; ");
		    num2 = teclado.nextInt();
		    resultado = num1 - num2;
		    System.out.println("el resultado de la resta es; " + resultado);
	    }	
	    else if (operacion.equals("multiplicacion")) {
		    System.out.println("aqui debemos realizar una multiplicacion");
		    System.out.println("ingresa el primer numero; ");
	        num1 = teclado.nextInt();
			System.out.println("ingresa el segundo numero; ");
			num2 = teclado.nextInt();
			resultado = num1 * num2;
			System.out.println("el resultado de la multiplicacion es; " + resultado);
		}	
		else if (operacion.equals("Division")) {
			System.out.println("aqui debemos realizar una division");
			System.out.println("ingresa el primer numero; ");
	    	num1 = teclado.nextInt();
			System.out.println("ingresa el segundo numero; ");
			num2 = teclado.nextInt();
			resultado = num1 / num2;
			System.out.println("el resultado de la division es; " + resultado);
		}
		else {	
			System.out.println("No existe opcion a realizar");
		}	
    }
}
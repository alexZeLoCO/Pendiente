import java.util.Scanner;		//IMPORTA SCANNER
public class Pendiente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca valor de la pendiente: ");		//SOLICITA VALOR
		int n = teclado.nextInt();		//ALMACENA VALOR EN N
		for (int i=1;i<=n;i++) {		//PARA N VECES
			for (int a=1;a<=i;a++) {		//PARA A VECES
				System.out.print("*");		//IMPRIMIR *
			}
			System.out.println();		//SALTO DE LÍNEA
		}
		
		System.out.println();		//SEPARADOR
		
		for (int i=0;i<n;i++) {		//PARA N VECES
			for (int a=n-i;a>=1;a--) {		//PARA A VECES
				System.out.print("*");		//IMPRIMIR *
			}
			System.out.println();		//SALTO DE LÍNEA
		}

	}
}

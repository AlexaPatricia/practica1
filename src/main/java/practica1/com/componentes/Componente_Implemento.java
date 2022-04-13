package practica1.com.componentes;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implemento implements Componente_Dependencia {

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println(mensaje);
	}

	@Override
	public String leer_teclado() {
		
		System.out.println("Por favor ingrese un nombre");
		Scanner leer=new Scanner(System.in);
		return leer.nextLine();
	}

	

}

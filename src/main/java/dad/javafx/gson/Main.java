package dad.javafx.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String cadena, nombre, apellidos, json;
		Gson gson;
		int edad;

		Persona p = new Persona();

		System.out.println("Introduce el nombre");
		nombre = entrada.nextLine();

		while (nombre.length() == 0 || nombre == null || nombre.matches("[0-9]+")) {

			System.out.println("Debes introducir un nombre válido");
			nombre = entrada.nextLine();

		}
		p.setNombre(nombre);

		System.out.println("Introduce los apellidos");
		apellidos = entrada.nextLine();

		while (apellidos.length() == 0 || apellidos == null || apellidos.matches("[0-9]+")) {

			System.out.println("Debes introducir unos apellidos válidos");
			apellidos = entrada.nextLine();

		}

		p.setApellidos(apellidos);

		System.out.println("Introduce la edad");
		cadena = entrada.next();
		
		while (cadena.length() == 0 || cadena == null || !cadena.matches("[1-9]+")) {

			System.out.println("Es obligatorio introducir una edad válida");
			cadena = entrada.next();

		}
		edad = Integer.parseInt(cadena);
		p.setEdad(edad);
		
		
		gson = new GsonBuilder().setPrettyPrinting().create();
		json = gson.toJson(p);
		
		System.out.println(json);

		entrada.close();
	}

}

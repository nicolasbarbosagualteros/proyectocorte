package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {

	public static void verificarNumeroPasajeros(int numero) throws PassengerNumberException {
		if (numero < 0 || numero > 300) {
			throw new PassengerNumberException();
		}
	}

	public static void verificarNombre(String nombre) throws InputTextNotValidException {
		Pattern p = Pattern.compile("/(?=.*?[#?!@$ %^&*-])/");
		Matcher m = p.matcher(nombre);
		if (m.find()) {
			throw new InputTextNotValidException();
		}
	}

	public static void verificarHora(String hora) throws TimeNotValidException {

		Pattern p = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
		Matcher m = p.matcher(hora);
		if (!m.matches()) {
			throw new TimeNotValidException();
		}

	}

	public static void verificarEspaciosVacios(String texto) throws EmptyTextException {

		if (texto.equals("") || texto.isEmpty()) {
			throw new EmptyTextException();
		}
	}

}

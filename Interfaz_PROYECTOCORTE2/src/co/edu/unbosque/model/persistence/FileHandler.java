package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc;
	private static PrintWriter pw;
	private static File archivo;
	private static final String FOLDER_NAME = "data";

	// para archivos serializados
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static FileInputStream fis;
	private static ObjectInputStream ois;


	
	public static void writeSerialized(String url, Object content ) {
		archivo = new File(FOLDER_NAME+"/"+url);
		
			try {
				if(!archivo.exists()) {
				archivo.createNewFile();
			}
				fos = new FileOutputStream(archivo);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(content);
				fos.close();
				oos.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("ocurrio un error en la escritura del archivo");
			}
			
	
	}
	
	public static Object readSerialized(String url) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if(!archivo.exists()) {
			archivo.createNewFile();
			}
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			Object content = ois.readObject();
			fis.close();
			ois.close();
			return content;
		}catch (IOException e) {
			// TODO Auto-generated catch block
			//
			e.printStackTrace();
			System.out.println("ocurrio un error en la lectura del archivo");
		}catch(ClassNotFoundException e) {
			
			System.out.println("ocurrio un error en la lectura del archivo (class not found)");
		}
		return null;
	}
	public static void checkFolder() {
		archivo = new File(FOLDER_NAME);
		if (archivo.exists() || archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}

	public static void writeFile(String url, String content) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();

			}
			pw = new PrintWriter(archivo);
			pw.write(content);
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error en la escritura del archivo(textoPlano)");
			// e.printStackTrace();

		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Error en la creación del archivo (Texto plano)");
		}

	}

	public static String readFile(String url) {
		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			sc = new Scanner(archivo);
			String content = "";
			while (sc.hasNext()) {
				content += sc.nextLine() + "\n";

			}
			return content;
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Error en la creación del archivo (Texto plano)");
		}
		return null;

	}

}
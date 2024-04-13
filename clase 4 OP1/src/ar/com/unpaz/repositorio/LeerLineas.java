package ar.com.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerLineas {
	protected List<List<String>> getDatos(String path) {
		File sFile = new File(path);
		List<List<String>> datos = new ArrayList<>();
		try {
			BufferedReader sBufferReader = new BufferedReader(new FileReader(sFile));
			String linea = "";
			while((linea = sBufferReader.readLine()) != null) {
				List<String> lectura = new ArrayList<String>();
				lectura.add(linea);
				datos.add(lectura);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}
}

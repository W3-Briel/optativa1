package ar.com.unpaz.services;

import java.util.List;
import ar.com.unpaz.repositorio.ILecturaArchivo;

// formatear se tiene que llamar la clase. porque estamos hablando de formato
// o sanatizar la informacion.

public interface IFormatter {
	Object formmated(List<String> dato);
//	List<?> formmatedData(ILecturaArchivo datos);
	List<Object> formmatedData(List<List<String>> datos);
}
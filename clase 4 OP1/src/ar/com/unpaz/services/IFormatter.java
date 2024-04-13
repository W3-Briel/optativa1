package ar.com.unpaz.services;
import java.util.List;

public interface IFormatter {
	Object formmated(List<String> dato);
//	List<?> formmatedData(ILecturaArchivo datos);
	List<Object> formmatedData();
}
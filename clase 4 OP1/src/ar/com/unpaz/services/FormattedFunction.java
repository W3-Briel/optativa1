package ar.com.unpaz.services;

import java.util.ArrayList;
import java.util.List;

abstract class FormattedFunction implements IFormatter {
	private List<List<String>> datos;

	@Override
	public List<Object> formmatedData() {
		List<Object> diccionarioDeObj = new ArrayList<>();
		datos.forEach(dDatoObj -> diccionarioDeObj.add(this.formmated(dDatoObj)));
		return diccionarioDeObj;
	}
	protected void setDatos(List<List<String>> sDatos) {
		this.datos = sDatos;
	}
	// luego se sobreescribe para cada DTO
	@Override
	public Object formmated(List<String> dato) {
		// TODO Auto-generated method stub
		return null;
	}	
}
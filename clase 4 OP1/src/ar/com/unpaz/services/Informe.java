package ar.com.unpaz.services;
import java.util.List;
import ar.com.unpaz.model.Venta;
import ar.com.unpaz.model.*;

public class Informe extends InformeAux implements IInforme{
	public Informe (int id, List<Object> ventas) {
		super(id,ventas);
		this.calcInforme();
	}
	
	private void calcInforme() {
		final int[] cantidadVentas = {0};
		final int[] total = {0};
		
		this.ventas.forEach(item -> {
			if(item instanceof Venta) {
				Venta venta = (Venta) item;
				if (venta.getId() == id) {
					cantidadVentas[0]++;
					total[0]+= venta.getTotal();
				}
			}
		});
		
		this.setGanancias(total[0]);
		this.setTotalVentas(cantidadVentas[0]);
	}
	
	// embed
	public void embed() {
		System.out.println("sa");
	}

	@Override
	public int getTotalGanancias() {
		return this.getGanancias();
	}

	@Override
	public int getCantidadVentas() {
		return this.getCantidadVentas();
	};
}
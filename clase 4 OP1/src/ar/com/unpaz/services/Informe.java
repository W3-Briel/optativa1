package ar.com.unpaz.services;
import java.util.List;
import ar.com.unpaz.model.Venta;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.InformeAux;


public class Informe extends InformeAux implements IInforme{
	public Informe (int id, List<Object> ventas,List<Object> clientes) {
		super(id,ventas,clientes);
		this.calcInforme();
		this.calcNombreVendedor();
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
		
		this.setTotalGanancias(total[0]);
		this.setCantidadVentas(cantidadVentas[0]);
	}
	
	private void calcNombreVendedor() {
		this.getClientes().forEach(obj -> {
			if(obj instanceof Cliente) {
				Cliente cliente = (Cliente) obj;
				if(cliente.getId() == this.id) {
					this.setNombreVendedor(cliente.getNombre() +" "+ cliente.getApellido());
				}
			}
		});
	}

	// embed
	public void embed() {
		String texto = String.format("{ID: %d, Nombre_Completo: %s, Cantaidad_Ventas: %d, Total_Ganancias: $%d}",
										this.id,this.nombreVendedor,this.cantidadVentas,this.totalGanancias);
		System.out.println(texto);
	}
}
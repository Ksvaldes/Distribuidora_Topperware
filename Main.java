
public class Main {//v.1.0

	public static void main(String[] args) {
		
		final String nombreEmpresa= "Distribuidora Tupperware";
		
		double costoUnitario= 45;//Q45.00
		int cantidadProducto= 200;
		double totalPagar= costoUnitario*cantidadProducto;
		final double precioVenta= 50;
		final double IVA= 0.12;//12%
		double precioUnitarioMasIVA=precioVenta*IVA ;
		
		
		System.out.println("DATOS                           2021");
		System.out.println("            DISTRIBUIDORA TUPPERWARE");
		System.out.println("_________________________________________");
		
		System.out.println();
		System.out.println("Costo por unidad: "+"            Q"+ costoUnitario);
		System.out.println("Cantidad de producto:         "+ cantidadProducto+ " unidades");
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("Total a pagar: "+ "               Q" + totalPagar);
		System.out.println("Venderse a: " + "                  Q"+ precioVenta + " c/u");
		System.out.println("Impuesto IVA: "+"                12"+"%");
		System.out.println("Impuesto por unidad:          Q"+ precioUnitarioMasIVA);
		
		
		
		int cantidadDeProductoVendido=10;
		double totalSinDescuento= cantidadDeProductoVendido*precioVenta;
		
		double tipodeDescuento=0;
		double TotalconDescuento=0;
		if (cantidadDeProductoVendido>=50) {
			tipodeDescuento=0.05;
			TotalconDescuento=totalSinDescuento-(totalSinDescuento*tipodeDescuento);
		}
		if (cantidadDeProductoVendido>=100) {
			tipodeDescuento=0.15;
			TotalconDescuento=totalSinDescuento-(totalSinDescuento*tipodeDescuento);
		}
		if (cantidadDeProductoVendido>=1000) {
			tipodeDescuento=0.25;
			TotalconDescuento=totalSinDescuento-(totalSinDescuento*tipodeDescuento);
		}
		
		double impuestoAdeclar=TotalconDescuento*0.12;
		double ganancias=(totalSinDescuento-(cantidadDeProductoVendido-costoUnitario-IVA));
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Productos vendidos:           "+cantidadDeProductoVendido + " unidades");
		System.out.println("Total sin descuento:          Q"+totalSinDescuento );
		System.out.println("Total con descuento:          Q"+ TotalconDescuento);
		System.out.println("IVA a declarar:               Q"+ impuestoAdeclar);
		System.out.println("Tipo de descuento:            "+tipodeDescuento);
		System.out.println();
		
		System.out.println("Las ganancias fueron de:      Q"+ganancias);
	}

}

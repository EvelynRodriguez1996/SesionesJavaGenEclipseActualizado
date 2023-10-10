package logicOperators;

public class logicOperators {



public static void main(String[] args) {
    int valorEquipo = 20000;
    int cantidadEquipos = 3;
    int totalSinDescuento = valorEquipo * cantidadEquipos;
    double descuento = 0.10;
    int totalConDescuento = totalSinDescuento;
    boolean aplicarDescuento = false;
    double porcentajeIntereses = 0.00;
    int mesesSinIntereses = 12;
    
    // Verificar si aplica el descuento
    if (totalSinDescuento > 25000) {
        totalConDescuento -= totalConDescuento * descuento;
        aplicarDescuento = true;
    }
    
    // Calcular el pago mensual
    double pagoMensual = (totalConDescuento / mesesSinIntereses) 
            + (totalConDescuento * porcentajeIntereses);
    
    // Imprimir los resultados
    System.out.println("Costo total por los 3 equipos sin descuento: $" + totalSinDescuento);
    System.out.println("¿Aplica el descuento en su compra?: " + (aplicarDescuento ? "Sí" : "No"));
    System.out.println("Costo total con el descuento aplicado: $" + totalConDescuento);
    System.out.println("Cantidad a pagar mensualmente: $" + pagoMensual);
    }
}


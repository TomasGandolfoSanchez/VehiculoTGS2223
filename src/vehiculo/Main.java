
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGandolfoSanchezTomas2223 miVehiculoGandolfoSanchezTomas2223;
        int stockActual;
        
        miVehiculoGandolfoSanchezTomas2223 = new VehiculoGandolfoSanchezTomas2223("Seat",18000,100);
        operativaVehiculosGandolfoSanchezTomas2223(miVehiculoGandolfoSanchezTomas2223, 50); 
    }

    public static void operativaVehiculosGandolfoSanchezTomas2223(VehiculoGandolfoSanchezTomas2223 miVehiculoGandolfoSanchezTomas2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGandolfoSanchezTomas2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGandolfoSanchezTomas2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGandolfoSanchezTomas2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    

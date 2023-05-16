
/**
 * Write a description of class inve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class inve
{
    public static void main(String[] args){
    Scanner objsc = new Scanner(System.in);
    producto[] losProductos = new producto[50];
    int numProducto = 0;
    String nombre, valor, venta;
    double producto, cantidad,nombre, valor, venta = 0;
    
    System.out.println("Digite la cantidad de productos: ");
    cantidad = objsc.nextInt();
    for(int i = 0; i< numProductos; i++){
    System.out.println("Digite el nombre del producto: ");
    numProductos = objsc.nextInt();
    System.out.println("Digite las ventas: ");
    ventas = objsc.nextInt();
    
    producto unProducto = new producto();
    unproducto.nombre=nombre;
    unproducto.cantidad=cantidad;
    unproducto.venta=venta;
    
    total = total + unProducto[i].producto * unProducto[i].venta;
    }   
    System.out.println("El valor de las ventas es: "+ total);
}
}

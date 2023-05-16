
/**
 * Write a description of class inventario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class inventario1
{
    public static void main(String[] args){
    Scanner objsc = new Scanner(System.in);
    int numeroProductos;
    String[] nombres = new String[50];
    String[] ventas = new String[50];
    double[] productos = new double[50];
    String venta,producto,nombre;
    double producto;
    double total = 0;
    
    System.out.println("Digite el numero de productos ");
    numeroProductos=objsc.nextInt();
    
    for(int i = 0; i < numeroProductos; i++){
        System.out.println("Digite el nombre del producto: ");
        nombre = objsc.next();
        System.out.println("digite productos: ");
        producto = objsc.nextDouble();
        System.out.println("Digite las ventas: ");
        venta = objsc.next();
        
        nombres[i] = nombre;
        productos[i]= producto;
        ventas[i]= venta;
    }
    for(int i=0; i < numeroProductos; i ++){
        total = total + producto;
    }
    System.out.println("el total de las ventas es: " + ventas);
}
        
        
    }
    
    

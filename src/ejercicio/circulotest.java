/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;


public class circulotest {

    public static void main(String[] args) { // Probar la clase circulo 
       Circulo circuloPredeterminado = new Circulo();//crear instancia usando el constructor predeterminado
        System.out.println("Círculo predeterminado:");
        System.out.println("Radio: " + circuloPredeterminado.getRadio());
        System.out.println("Área: " + circuloPredeterminado.getArea());
        System.out.println("Color: " + circuloPredeterminado.getColor());
        

        Circulo circuloPersonalizado = new Circulo(6.55);//crear instancia usando el constructor sobrecargado
        System.out.println("\nCírculo personalizado:");
        System.out.println("Radio: " + circuloPersonalizado.getRadio());
        System.out.println("Área: " + circuloPersonalizado.getArea());
        
             
        Circulo circulo = new Circulo();
        
        System.out.println("Círculo con valores por defecto:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Área: " + circulo.getArea());
        
        circulo.setRadio(10.0);

        System.out.println("\nCírculo después de modificar el radio:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Área: " + circulo.getArea());
        
    }
    
}

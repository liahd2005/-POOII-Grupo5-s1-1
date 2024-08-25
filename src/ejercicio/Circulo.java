/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

public class Circulo { //crear una clase llamada circulo
    private  double radio; //crear 2 varibles de instancia privada
    private String color;
    
    public Circulo() { //constructor predeterminado o sin argumentos
        this.radio = 12.5;
        this.color = "azul";
        
    }
    public Circulo(double radio) { //constructor con argumento 
        this.radio = radio;
        this.color = "azul"; 
    }
    
    public double getRadio() { //metodo que devuelve el radio
        return radio;
    }
    public void setRadio(double radio) {
    this.radio = radio;
}
    public double getArea() { // metodo que devuelve el area de esta instancia
        return radio * radio * Math.PI;
    }
        public String getColor() { //metodo para obtener el color
        return color;
    }
    public void setColor(String color) { // metodo para mostrar el color
        this.color = color;
    }
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
}

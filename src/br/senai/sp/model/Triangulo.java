package br.senai.sp.model;

public class Triangulo {

	public double base;
	public double ladoC;
	public double ladoB;
	public double altura;
	public String nome; 
	
	//Métodos da classe
	public void mostrarDimensoes() {
		
		System.out.println("--------------------------");
	    System.out.println(nome);
		System.out.println("--------------------------");
	    System.out.println("Base:" + base);
		System.out.println("LadoB:" + ladoB);
		System.out.println("LadoC:" + ladoC);
		System.out.println("Altura:" + altura);
		calcularArea();
		
	}
	
	public void calcularArea() {
	     double area = (base * altura) / 2;
	     System.out.println("Àrea =" + area);
	     
	     
		
	}
	
	
}

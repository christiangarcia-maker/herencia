package ej4;

public class Electrodomesticos {
	
	public enum Color {
		BLANCO,NEGRO,ROJO,AZUL,GRIS
	}
	
	public enum ConsumoEnergetico {
		A,B,C,D,E,F
	}
	
	protected double precioBase = 100;
	protected Color color = Color.BLANCO;
	protected ConsumoEnergetico consumoEnergia = ConsumoEnergetico.F;
	protected double peso = 5;
	
	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomesticos(double precioBase, String color, String consumoEnergia, double peso) {
		this.precioBase = precioBase;
		this.color = Color.valueOf(color.toUpperCase());
		this.consumoEnergia = ConsumoEnergetico.valueOf(consumoEnergia.toUpperCase());
		this.peso = peso;
	}
	
	
	
}

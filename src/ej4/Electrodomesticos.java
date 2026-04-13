package ej4;

public class Electrodomesticos {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	protected static final String COLOR_DEF = "Blanco";
	protected static final char CONSUMO_ENERGETICO_DEF = 'F';
	protected final double PRECIO_BASE_DEF = 100;
	protected final double PESO_DEF = 5;
	
	private static final String[] COLORES_VALIDOS = { "blanco", "negro", "rojo", "azul", "gris" };
	
	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}
	
	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
	
	private char comprobarConsumoEnergetico (char letra) {
		char letraUpper = Character.toUpperCase(letra);
		if (letraUpper >= 'F' && letraUpper <= 'F') {
			return letraUpper;
		}
		return CONSUMO_ENERGETICO_DEF;
	}
	
	private String comprobarColor (String color) {
		if (color == null) {
			return COLOR_DEF;
		}
		
		String colorNormalizado = color.toLowerCase();
		for (String colorValido : COLORES_VALIDOS) {
			if (colorValido.equals(colorNormalizado)) {
				return colorNormalizado;
			}
		}
		return COLOR_DEF;
	}
	
	
	
}

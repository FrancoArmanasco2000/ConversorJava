package Alura;

public class Temperature {
	
	Temperatura tipo;
	
	public Temperature(Temperatura tipo) {
		this.tipo = tipo;
	}
	
	public Double celciusAOtro(Temperatura t , Double cantidad) {
		if(Temperatura.Fahrenheit == t) {
			return (cantidad*9/5)+32;
		}else{
			return cantidad+273.15;
		}
	}
	
	public Double fahrenheitAOtro(Temperatura t, Double cantidad) {
		if(Temperatura.Celcius == t) {
			return (cantidad - 32) * 5/9;
		}else{
			return (cantidad-32)*9/5 + 273.15;
		}
	}
	
	public Double kelvinAOtro(Temperatura t, Double cantidad) {
		if(Temperatura.Celcius == t) {
			return cantidad - 273.15;
		}else{
			return (cantidad - 273.15)*9/5+32;
		}
	}
	
}

package Alura;


public class Money{
	
	Moneda tipo;
	
	public Money(Moneda tipo) {
		this.tipo = tipo;
	}

	public Moneda getTipo() {
		return tipo;
	}

	public void setTipo(Moneda tipo) {
		this.tipo = tipo;
	}
	
	public Double pesoArgentinoAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.Dolar) {
			return cantidad*0.0039;
		}else if(moneda==Moneda.Euro) {
			return cantidad*0.0035;
		}else if(moneda==Moneda.LibrasEsterlinas) {
			return cantidad*0.0030;
		}else if(moneda==Moneda.Won) {
			return cantidad*5;
		}else {
			return cantidad*0.56;
		}
	}
	
	public Double dolarAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.PesoArgentino) {
			return cantidad*259;
		}else if(moneda==Moneda.Euro) {
			return cantidad*0.92;
		}else if(moneda==Moneda.LibrasEsterlinas) {
			return cantidad*0.79;
		}else if(moneda==Moneda.Won) {
			return cantidad*1294.80;
		}else {
			return cantidad*144.45;
		}
	}
	
	public Double euroAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.PesoArgentino) {
			return cantidad*282;
		}else if(moneda==Moneda.Dolar) {
			return cantidad*1.09;
		}else if(moneda==Moneda.LibrasEsterlinas) {
			return cantidad*0.86;
		}else if(moneda==Moneda.Won) {
			return cantidad*1408.82;
		}else {
			return cantidad*157.16;
		}
	}

	public Double librasAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.PesoArgentino) {
			return cantidad*329.52;
		}else if(moneda==Moneda.Dolar) {
			return cantidad*1.27;
		}else if(moneda==Moneda.Euro) {
			return cantidad*1.17;
		}else if(moneda==Moneda.Won) {
			return cantidad*1646.11;
		}else {
			return cantidad*183.66;
		}
	}
	
	public Double yenAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.PesoArgentino) {
			return cantidad*1.79;
		}else if(moneda==Moneda.Dolar) {
			return cantidad*0.0069;
		}else if(moneda==Moneda.Euro) {
			return cantidad*0.0064;
		}else if(moneda==Moneda.LibrasEsterlinas) {
			return cantidad*0.0054;
		}else {
			return cantidad*8.89;
		}
	}
	
	public Double wonAOtro(Moneda moneda, Double cantidad) {
		if(moneda==Moneda.PesoArgentino) {
			return cantidad*0.20;
		}else if(moneda==Moneda.Euro) {
			return cantidad*0.00071;
		}else if(moneda==Moneda.LibrasEsterlinas) {
			return cantidad*0.00061;
		}else if(moneda==Moneda.Dolar) {
			return cantidad*0.00077;
		}else {
			return cantidad*0.11;
		}
	}
	
	
	
	

	
}

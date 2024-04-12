package com;

public class datostecnicos {
	
	motor tmotor;
	consumo tconsumo;
	sistemaElectronico sistelectronico;
	trenPotencia tpotencia;
	
	public datostecnicos() 
	{
		
	}

	public datostecnicos(motor tmotor, consumo tconsumo, sistemaElectronico sistelectronico, trenPotencia tpotencia) {
		super();
		this.tmotor = tmotor;
		this.tconsumo = tconsumo;
		this.sistelectronico = sistelectronico;
		this.tpotencia = tpotencia;
	}

	public motor getTmotor() {
		return tmotor;
	}

	public void setTmotor(motor tmotor) {
		this.tmotor = tmotor;
	}

	public consumo getTconsumo() {
		return tconsumo;
	}

	public void setTconsumo(consumo tconsumo) {
		this.tconsumo = tconsumo;
	}

	public sistemaElectronico getSistelectronico() {
		return sistelectronico;
	}

	public void setSistelectronico(sistemaElectronico sistelectronico) {
		this.sistelectronico = sistelectronico;
	}

	public trenPotencia getTpotencia() {
		return tpotencia;
	}

	public void setTpotencia(trenPotencia tpotencia) {
		this.tpotencia = tpotencia;
	}

	@Override
	public String toString() {
		return "datostecnicos [tmotor=" + tmotor + ", tconsumo=" + tconsumo + ", sistelectronico=" + sistelectronico
				+ ", tpotencia=" + tpotencia + "]";
	}
	

}

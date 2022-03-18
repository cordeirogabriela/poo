package oop01;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, int ano, String cor) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setCor(cor);
	}
	
	public String toString() {
		return (this.getMarca() + ", " +
				this.getModelo() + ", " +
				this.getAno() + ", " +
				this.getCor()
				);
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}

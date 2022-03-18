package oop01;

public class TesteVeiculo {
	public static void main(String[] args) {
		Veiculo veiculo01 = new Veiculo ();
		veiculo01.setMarca("honda");
		veiculo01.setModelo("civic");
		veiculo01.setAno(2022);
		veiculo01.setCor("azul marinho");
		System.out.println(veiculo01.toString());
		
		Veiculo veiculo02 = new Veiculo("ford", "fusion", 2022, "cinza");
		System.out.println(veiculo02.toString());
		
		
	}
}

class  Desafio2 {
	
	Desafio2(){
	}

	public int  problema1(int valor){
		return valor += 1;
	}
	
	public static void main(String[] args) {
		Desafio2 desafio2 = new Desafio2();
		System.out.println(desafio2.problema1(19));
		System.out.println("Olá mundo!");
	}
}

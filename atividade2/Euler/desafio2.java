import java.util.Scanner;

class Aluno{
	private int nota1, nota2, nota3;
	
	Aluno(int nota1, int nota2, int nota3){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public float getMedia(){
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}

	public String getStatus(){
		if (this.getMedia() >= 7.0) {
			return "Aprovado";
		}

		if ((this.getMedia() >= 5.0) && this.getMedia() < 7.0) {
			return "Recuperação";
		}

		if (this.getMedia() < 5.0) {
			return "Reprovado";
		}

		return "Sem média";
	}

}

class Divisao{
	private int valorX, valorY;

	Divisao(int valorX, int valorY){
		this.valorX = valorX;
		this.valorY = valorY;
	}

	public float getDiv(){
		return this.valorX / this.valorY;
	}

	public float getResto(){
		return this.valorX % this.valorY;
	}
}

class Problema6{
	private int valor1, valor2;

	Problema6(int valor1, int valor2){
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public float getSoma(){
		return this.valor1 + this.valor2;
	}

	public float getProduto(){
		return this.valor1 * this.valor2;
	}

	public float getQuociente(){
		return this.valor1 / this.valor2;
	}
}

class PA{
	private int razao, primeiro, ultimo;

	PA(int razao, int primeiro, int ultimo){
		this.razao = razao;
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	private int getNumeroElementos(){
		int numeroElementos = 1;
		int ultimoValor = this.ultimo;
		while(ultimoValor != this.primeiro){
			ultimoValor = ultimoValor - this.razao;
			numeroElementos = numeroElementos + 1;
		}

		return numeroElementos;
	}

	public int getSomaPA(){
		return ((this.primeiro + this.ultimo) * this.getNumeroElementos()) / 2;
	}
}

class  Desafio2 {
	
	Desafio2(){
	}

	public int  problema1(int valor){
		return valor += 1;
	}

	public Aluno problema2(int val1, int val2, int val3){
		Aluno aluno = new Aluno(val1, val2, val2); 

		return aluno;
	}

	public float problema3(int anos, int qtdDia, int valorUnidade){
		return ((anos * 365) * qtdDia) * valorUnidade;
	}

	public Divisao problema4(int valorX, int valorY){
		Divisao divisao = new Divisao(valorX, valorY);

		return divisao;
	}
	
	public float problema5(float raio, float altura){
		float pi = (float)  2.14;
		return (float) (2 * pi * raio * (altura + raio));
	}

	public Problema6 problema6(int valor1, int valor2){
		Problema6 problema = new Problema6(valor1 , valor2);

		return problema;
	}

	public String problema7(int valor1, int valor2, int valor3){
		if (valor1 >= (valor2 + valor3)) {
			return "Maior";
		}

		return "Menor";
	}

	public PA problema8(int razaoPA, int primeiroValor, int ultimoValor){
		PA pa =  new PA(razaoPA, primeiroValor, ultimoValor);

		return pa;
	}

	public void problema9(String nome){
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Informe um NOME:");

		String nomeTest = escrever.next();
		System.out.println(nomeTest);
		while(nome.equals(nomeTest) != true){
			System.out.println("Nome Incorreto :(");

			System.out.println("Informe um novo NOME:");
			nomeTest = escrever.next();
		}

		System.out.println("Nome Correto");
	}

	public String problema10(int valor1, int valor2){
		if (valor1 == valor2) {
			return "A = B";
		}

		if (valor1 > valor2) {
			return valor1 + " > " + valor2;
		}
		else
		{
			return valor1 + " < " + valor2;
		}
	}



	public static void main(String[] args) {
		Desafio2 desafio2 = new Desafio2();

		System.out.println("Atividade 1:");
		int numero = 19; // Numero para saber o sucessor
		System.out.println("Sucessor:" + desafio2.problema1(numero));
		
		System.out.println();

		System.out.println("Atividade 2:");
		Aluno aluno = desafio2.problema2(5,5,5); // Medias em inteiro
		System.out.println("Média: " + aluno.getMedia());
		System.out.println("Situação: " + aluno.getStatus());

		System.out.println();

		System.out.println("Atividade 3:");
		// Para resolver esse problema foi levado em consideração o valor da unidade do cigarro 
		// por nao saber a quantidade de cigarros em uma carteira
		System.out.println("Valor gasto em cigarros: " + desafio2.problema3(1, 2, 3) + " " + "Reais");

		System.out.println();

		System.out.println("Atividade 4:");
		Divisao divisao = desafio2.problema4(10, 3); //Informa o valor de X e Y, respectivamente
		System.out.println("Divisão: "+ divisao.getDiv());
		System.out.println("Resto: "+ divisao.getResto());
		
		System.out.println();

		System.out.println("Atividade 5:");
		System.out.println("Area do cilindro: " + desafio2.problema5(4, 3) );

		System.out.println();

		System.out.println("Atividade 6:");
		Problema6 problema = desafio2.problema6(4, 3);
		System.out.println("Soma: " + problema.getSoma() );
		System.out.println("Produto: " + problema.getProduto() );
		System.out.println("Quociente: " + problema.getQuociente() );

		System.out.println();

		System.out.println("Atividade 7:");
		System.out.println("Os valor é: "+desafio2.problema7(10, 2, 9));

		System.out.println();

		System.out.println("Atividade 8:");
		PA pa = desafio2.problema8(4,-1,75);
		System.out.println("O somatório da PA: "+pa.getSomaPA());

		System.out.println();

		System.out.println("Atividade 9:");
		desafio2.problema9("Euler");

		System.out.println();

		System.out.println("Atividade 10:");
		System.out.println(desafio2.problema10(10,10));

		System.out.println();



	
	}
}

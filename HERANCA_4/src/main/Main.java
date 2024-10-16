package main;

import utilidades.FuncoesUteis;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Cria um objeto da classe FuncoesUteis para realizar os testes.
		 */
		FuncoesUteis funcoes = new FuncoesUteis();
		
		/*
		 * Define uma variável com o nome "fazSoma" e faz a sua inicialização
		 * chamando o método de "soma" e passando os dois valores a serem somados.
		 * 
		 * Em seguida imprime uma mensagem informando quais números foram somados e
		 * adiciona no final a variável usada para chamar e executar o método de soma
		 * imprimindo o resultado da soma.
		 */
		int fazSoma = funcoes.soma(56, 45);
		System.out.println("A soma de 56 e 45 é igual a: " + fazSoma);
		
		
		/*
		 * Uma saída no terminal informando que em seguida será impresso o
		 * triângulo.
		 * Em seguida a chamada do método triangulo passando o valor a ser
		 * usado para imprimir o triângulo.
		 */
		System.out.println("\nTriângulo de altura 15:\n");
		funcoes.triangulo(15);
		
		/*
		 * Para usar o código no seu computador é preciso substituir alguns
		 * caminhos desse arquivo txt.
		 * - Troque o "Breno" pelo nome de usuário que voçê está utilizando.
		 * - Caso o seu arquivo esteja salvo em outro local que não seja em
		 * "Documents", troque e coloque no lugar o local onde está salvo oo
		 * arquivo.
		 * - Caso haja mais sub-pastas após a etapa anterior, vá informando o
		 * caminho por cada pasta, separando-as pelo símbolo de barra /.
		 * - Por fim informe o nome do arquivo com o tipo ".txt" no final.
		 */
        String nomeDoArquivo = "C:/Users/Breno/Documents/CalculoSubRede.txt";
        /*
         * Setter para informar o caminho do arquivo para o método de exibição.
         */
        funcoes.setArquivo(nomeDoArquivo);
		
		/*
		 * Uma saída de texto informando que em seguida será exibido o
		 * conteúdo do arquivo txt.
		 * 
		 * Chamada do método de exibição para imprimir o arquivo txt.
		 */
		System.out.println("\n\n\nAqui está o arquivo de texto:\n");
        funcoes.exibirArquivo();

	}

}
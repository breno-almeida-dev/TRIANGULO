package utilidades;

/*
 * import que acessa a biblioteca que fornece o método que
 * permite manipular e realizar operações com arquivos e diretórios. 
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class FuncoesUteis {
    String arquivo;
    
    /*
     * Setter para o atributo arquivo desta classe.
     * Contendo a "String" com o caminho do arquivo txt.
     */
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    /*
     * Getter que retorna o caminho do arquivo txt.
     */
    public String getArquivo() {
        return arquivo;
    }
	
    /*
     * Esse método simples realiza a soma de dois inteiros.
     */
	public int soma(int a, int b) {
		return a + b;
	}
	
	/*
	 * Esse método recebe o valor de altura informado na classe Main,
	 * aqui chamado de altura, e utiliza como o parâmetro para construção
	 * do triângulo no primeiro "for", já o segundo "for" é responsável
	 * por realizar a saída do caractere "x", assim a cada vez que o "i"
	 * aumenta o "j" percorre seu comprimento até 1 menos que "i", montando
	 * o triângulo. E a cada vez que "j" chega ao fim acontece a quebra de linha.
	 */
	public void triangulo(int altura) {
		for(int i=0; i<altura; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}	
	
	/*
	 * Método que exibe um arquivo txt da máquina em que o código
	 * está rodando.
	 */
	public void exibirArquivo() {
		/*
		 * Essa condição verifica se o caminho do arquivo está
		 * sendo informado, caso não esteja, informa no terminal que
		 * está vazio e utiliza o "return" para finalizar o código.
		 */
        if (getArquivo() == null || getArquivo().isEmpty()) {
            System.out.println("O caminho do arquivo está vazio.");
            return;
        }
		/*
		 * Inicialmente, utilizando um try-catch, dentro do try é utilizado um Stream, que é
		 * uma sequência de elementos que suporta operações de agregação e processamento.
		 * Onde nesse caso cada linha do arquivo txt será um elemento do Stream, por isso
		 * é informado que será uma sequência de String.
		 * 
		 * A viriável "linhas" armazena o fluxo de linhas do arquivo txt.
		 * 
		 * A chamada do "Files.lines()" é usada para ler as linhas do arquivo, assim retornando
		 * cada parte de "String" para o "Stream".
		 * 
		 * O "Path.get" converte o caminho do arquivo em um objeto Path, que é utilizado
		 * para localizar o arquivo no sistema.
		 * 
		 * O "forEach(System.out::println)" serve para que a cada linha ocorra uma quebra de linha
		 * quando for mostrado os dados do arquivo no terminal.
		 * 
		 * Caso o caminho informado seja inválido, o catch retorna para o usuário que houve
		 * um erro ao ler o arquivo.
		 */
	    try (Stream<String> linhas = Files.lines(Paths.get(arquivo))) {
	        linhas.forEach(System.out::println);
	    } catch (IOException e) {
	        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	    }
	}

}
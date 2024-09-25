
public class Main {

	public static void main(String[] args) {
		try {
            // Instância da classe Filme
            Filme filme1 = new Filme("Gente Grande", 102, "Comédia");
            System.out.println(filme1); // Imprime as informações do filme 1

            Filme filme2 = new Filme("Resident Evil: Bem-Vindo a Raccoon City", 107, "Terror");
            System.out.println(filme2); // Imprime as informações do filme 2

            // Validações fora dos parametros requisitados. 
            Filme filmeInvalido = new Filme("", 120, "Ação"); //Teste para o parâmetro "Titulo".
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
		
		try {
			Filme filmeInvalido2 = new Filme("Abc", -1, "Terror"); //Teste para o parâmetro "Duração".
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			Filme filmeInvalido3 = new Filme("Meu Malvado Favorito", 95, "Suspense" );
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}

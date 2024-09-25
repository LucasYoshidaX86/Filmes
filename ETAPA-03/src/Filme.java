//Criação da classe Filme com atributos requisitados na atividade.
public class Filme {
	 private String titulo;
	    private int duracao; 
	    private String genero; 

	    // Constructor para inicialização dos atributos e método setters para validar os atributos privados.
	    public Filme(String titulo, int duracao, String genero) {
	        setTitulo(titulo); 
	        setDuracao(duracao); 
	        setGenero(genero); 
	    }

	    // Método getters para acessar atributo privado.
	    public String getTitulo() {
	        return titulo;
	    }

	    // Definição do título e validação dentro dos parâmetro requisitados.
	    public void setTitulo(String titulo) {
	        if (titulo == null || titulo.trim().isEmpty()) {
	            throw new IllegalArgumentException("O título do filme deve ser preenchido.");
	        }
	        this.titulo = titulo;
	    }

	    // Método getters para acessar atributo privado.
	    public int getDuracao() {
	        return duracao;
	    }

	    // Definição de duração e validação dentro dos parâmetros requisitados. 
	    public void setDuracao(int duracao) {
	        if (duracao <= 0) {
	            throw new IllegalArgumentException("A duração do filme deve ser maior que zero.");
	        }
	        this.duracao = duracao;
	    }

	    // Método getters para acessar atributo privado.
	    public String getGenero() {
	        return genero;
	    }

	    // Definição de genero
	    public void setGenero(String genero) {
	        if (!isGeneroValido(genero)) {
	            throw new IllegalArgumentException("Gênero do filme não suportado");
	        }
	        this.genero = genero;
	    }

	    // Validação do genero do filme. 
	    private boolean isGeneroValido(String genero) {
	        return genero.equalsIgnoreCase("Romance") || 
	               genero.equalsIgnoreCase("Terror") || 
	               genero.equalsIgnoreCase("Comédia");
	    }

	    //Exibição da classe Filme quando enviado ao main. 
	    public String toString() {
	        return "Filme: " + getTitulo() + ", Duração: " + getDuracao() + " minutos, Gênero: " + getGenero() + "\n";
	    }
	}
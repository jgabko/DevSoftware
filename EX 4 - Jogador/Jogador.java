public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    // Construtor para inicializar os atributos
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    // Método para aumentar a pontuação
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
        }
    }

    // Método para subir de nível
    public void subirNivel() {
        this.nivel++;
    }

    // Método para exibir as informações do jogador
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}


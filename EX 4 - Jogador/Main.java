
public class Main {
    public static void main(String[] args) {

                Jogador jogador1 = new Jogador("Jogador 1", 0, 1);

                // Exibindo as informações do jogador antes de modificar
                jogador1.exibirInfo();

                // Aumentando a pontuação
                jogador1.aumentarPontuacao(150);

                // Subindo de nível
                jogador1.subirNivel();

                // Exibindo as informações após as alterações
                System.out.println("\nApós as alterações:");
                jogador1.exibirInfo();
            }
        }


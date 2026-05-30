import javax.swing.JOptionPane;

public class game{
    public static void main(String[] args) {
        // Mensagem inicial
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo Java!");

        boolean jogando = true;
        int pontuacao = 0;

        while (jogando) {
            // Menu principal
            String[] opcoes = {"Jogar", "Pontuação", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0: // Jogar
                    pontuacao += jogar();
                    break;
                case 1: // Ver pontuação
                    JOptionPane.showMessageDialog(null, "Sua pontuação atual é: " + pontuacao);
                    break;
                case 2: // Sair
                case JOptionPane.CLOSED_OPTION:
                    jogando = false;
                    JOptionPane.showMessageDialog(null, " Obrigado por jogar!");
                    break;
                default:
                    jogando = false;
                    break;
            }
        }
    }

    // "partida"
    static int jogar() {
        int numeroSecreto = (int) (Math.random() * 10) + 1;
        String entrada = JOptionPane.showInputDialog("Adivinhe o número (1 a 10):");
        if (entrada == null) return 0; // Cancelar = sem pontuação

        try {
            int palpite = Integer.parseInt(entrada);
            if (palpite == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "🎯 Acertou! +10 pontos");
                return 10;
            } else {
                JOptionPane.showMessageDialog(null, "❌ Errou! O número era " + numeroSecreto);
                return 0;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Tente um número inteiro.");
            return 0;
        }
    }
}

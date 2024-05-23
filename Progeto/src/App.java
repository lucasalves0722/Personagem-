import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem: "); 

        Personagem guerreiro = new Personagem(nome,classe);
        guerreiro.mostrarStatus();
    }
}

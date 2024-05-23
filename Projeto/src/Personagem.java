import javax.swing.JOptionPane;

public class Personagem {
    // Atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    //método construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        
        if (classe.equals("Guerreiro")) {
            forca = nivel * 2;
        } else {
            forca = nivel / 2; 
        }           
    }

    //métodos específicos
    public void mostrarStatus(){
        String status = String.format("Classe: %s\nNome: %s\nNível: %d\nForça: %d\nVida: %d",
            classe,
            nome, 
            nivel, 
            forca, 
            vida);

        JOptionPane.showMessageDialog(null, status, "Status do personagem: ", JOptionPane.INFORMATION_MESSAGE);
    }

    //metodos getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    
}
import javax.swing.JOptionPane;

public class exFormulario {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", é um prazer em te conhecer");
        
    }
    
}

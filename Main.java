import javax.swing.JOptionPane;

public class Esteira { private boolean estado;

public Esteira() {
    estado = false;
}

public void ligar() {
    estado = true;
}
public void desligar(){
    estado = false;
}
public boolean getEstado() {
    return estado;
}

public static void main(String[] args){
    Esteira esteira = new Esteira();

    while (true){
        String[] options = {"Ligar", "Desligar", "Sair"};
        int choice = JOptionPane.showOptionDialog(null,"Escolha uma açao para a esteira:", "Controle de Esteira", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
        if (choice == 0 ){
         esteira.ligar();
          JOptionPane.showMessageDialog(null, "Esteira ligada.");
     }else if (choice == 1){
        esteira.desligar();
        JOptionPane.showMessageDialog(null, "Esteira desligada.");
     } else if (choice == 2){
        break;
     }

      JOptionPane.showMessageDialog(null, "Estado da Esteira: "+ (esteira.getEstado()? "Ligada" : "Desligada"));
     }

    }
}
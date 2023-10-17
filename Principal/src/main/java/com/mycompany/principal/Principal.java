/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import javax.swing.JOptionPane;
import modelo.Esteira;

/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        Esteira e1 = new Esteira();
        OUTER:
        while (true) {
            String[] options = {"Ligar", "Desligar", "Sair"};
            int choice = JOptionPane.showOptionDialog(null,"Escolha uma açao para a esteira:", "Controle de Esteira", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    e1.ligar();
                    JOptionPane.showMessageDialog(null, "Esteira ligada.");
                    break;
                case 1:
                    e1.desligar();
                    JOptionPane.showMessageDialog(null, "Esteira desligada.");
                    break;
                case 2:
                    break OUTER;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Estado da Esteira: "+ (e1.getEstado()? "Ligada" : "Desligada"));
        }

    }
}

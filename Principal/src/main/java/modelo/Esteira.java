package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class Esteira {
    //ATRIBUTO
    private boolean estado;

    //CONSTRUTOR
    public Esteira() {
        estado = false;
    }
    
    //METODOS
    public void ligar() {
        estado = true;
    }
    public void desligar(){
        estado = false;
    }
    public boolean getEstado() {
        return estado;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author EtecMorato
 */
public class TesteEstudante {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        
        estudante.setNome("Renato");
        estudante.setRa(0001);
        estudante.setFrequencia(1.25);
        estudante.setNota('R');
                    
       
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("RA: " + estudante.getRa());
        System.out.println("Frequência: " + estudante.getFrequencia() + " horas aula");
        System.out.println("Nota: " + estudante.getNota());
        System.out.println(estudante.getMatriculaTrancada()?"Matricula Ativa":"Matricula Trancada");
        System.out.println(estudante.getMatriculaTrancada());
    }
            
    
}

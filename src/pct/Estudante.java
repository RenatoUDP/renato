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
public class Estudante {
    //Atributos
    private String nome;
    private int ra;
    private double frequencia;
    private char nota; // 'B' 'R' 'I'
    private boolean matriculaTrancada = true;
    
    //Metodo Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }    
    //Metodo Nome
    
    
    
    //Metido Freqencia
    public void setFrequencia(double frequencia){
        this.frequencia += frequencia;
    }
    
    public double getFrequencia(){
        return this.frequencia;
    }    
    //Metodo Freqencia
    
    
    
    //metodo nota
    public void setNota(char nota){        
            this.nota = nota;       
    }
     
    public char getNota(){
        return this.nota;
    }
    //metodo nota
   
    
        
    //Metodo RA
    public void setRa(int ra){
        this.ra = ra;
    }  
    public int getRa(){
        return this.ra;
    }
    //Metodo RA
    
    //Metodo Matricula Trancada    
    public void setMatriculaTrancada(boolean a){
        this.matriculaTrancada = a;
    }
          
    
    public boolean getMatriculaTrancada(){
        return this.matriculaTrancada;
    }
    //Metodo Matricula Trancada    


    
}

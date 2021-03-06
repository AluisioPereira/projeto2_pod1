/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.bus;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author laerton
 */

public class Mensagem {
    private String texto;
    private String remetente;
    private String topico;
    private LocalDate data;
    private LocalTime time;
    public Mensagem(){
        data = LocalDate.now();
        time = LocalTime.now();
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String tamanho) {
        this.remetente = tamanho;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String nome) {
        this.topico = nome;
    }
    
    public String getDataHora(){
        return "Data: " + data.toString() + " Hora: "+ time.toString();
                
    }
    @Override
    public String toString(){
        return remetente + ":" + topico + ":" + texto ;
    }

    public Mensagem( String remetente, String topico, String texto) {
        this.texto = texto;
        this.remetente = remetente;
        this.topico = topico;
    }

    
    
    
}

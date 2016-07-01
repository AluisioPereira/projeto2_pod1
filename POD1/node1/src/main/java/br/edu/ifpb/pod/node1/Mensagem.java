/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.node1;

import com.sun.xml.internal.ws.developer.Serialization;

/**
 *
 * @author laerton
 */

public class Mensagem {
    private String texto;
    private final String remetente = "NODE1";
    private final String  topico = "TOPICO1";

    public Mensagem(){
        
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

    public String getTopico() {
        return topico;
    }

    
    
    @Override
    public String toString(){
        return remetente + ";" + topico + ";" + texto ;
    }

    public Mensagem(  String texto) {
        this.texto = texto;
    }

    
    
    
}

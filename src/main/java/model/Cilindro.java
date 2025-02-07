/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Cléver & Cauã & Jonathas
 */
public class Cilindro extends D3{
   @Override
   public void desenhar(Graphics g){
        if(showArea){
            super.desenhar(g);
        }
        g.setColor(corPrimaria);
        g.drawRect(x, y, x1 - x, y1 - y); //Desenha um retângulo com base nas coordenadas fornecidas.
        g.setColor(corInterna);
        g.fillRect(x + 1, y, x1 - x - 1, y1 - y);// Preenche o interior do retângulo, exceto uma faixa fina na borda esquerda e direita.
        g.fillOval(x,y - ((y1-y)/20),x1 - x,((y1 - y)/10)); //Desenha um círculo que representa uma das extremidades do cilindro.
        g.fillOval(x, y1 - ((y1 - y)/20), x1 - x, ((y1 - y)/10));
        g.setColor(corPrimaria);
        g.drawOval(x,y - ((y1-y)/20),x1 - x,((y1 - y)/10));// Desenha a parte superior do circulo
        g.drawOval(x, y1 - ((y1 - y)/20), x1 - x, ((y1 - y)/10));//Desenha a parte inferior do circulo
        g.setColor(Color.BLACK);
   }
   
    public int getDeslocamentoTextoX(){
        return 0;
    }
    
    public int getDeslocamentoTextoY(){
        return - 10;
    }
   
    @Override
    public float volume(){
        return (float)Math.PI * ((y1 - y)/10) * ((y1 - y)/10) * (x - x1); //V = Pi*R^2 * H
    }

    @Override
    public float area() {
        return (float) ((2*Math.PI*((y1-y)/10)*((y1-y)/10)) + (2 * (Math.PI * (((y1-y)/10)*((y1-y)/10))))); //2*Pi*R*H + 2*Pi*R^2
    }
}

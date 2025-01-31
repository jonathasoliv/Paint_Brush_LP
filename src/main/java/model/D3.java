package model;


import java.awt.Color;
import java.awt.Graphics;
import model.D2;
import model.Ponto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anacleto
 */
abstract public class D3 extends D2{
    public int x1;
    public int y1;
    
    abstract public float volume();
    
    public float perimetro(){
        //Perímetro é um conceito para figuras 2d, dá pra calcular, mas é mais leal considerar a área
        return (float) -1;
    }
    
    @Override
    public void desenhar(Graphics g){
        if(showArea){
            g.setColor(Color.BLACK);
            g.drawString("Area: "+ formataFloat(area())+ " Volume: " + formataFloat(volume()), x + getDeslocamentoTextoX(), y + getDeslocamentoTextoY());
        }
    }
    
    abstract public int getDeslocamentoTextoX();
    abstract public int getDeslocamentoTextoY();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JonathasOliveira
 */
abstract public class D2 extends Ponto{
    public Color corInterna;
    public boolean showArea = false;
    abstract public float area();
    abstract public float perimetro();
    
    @Override
    public void desenhar(Graphics g){
        if(showArea){
            g.setColor(Color.BLACK);
            g.drawString("Area: "+ formataFloat(area())+ " Perímetro: " + formataFloat(perimetro()), x, y);
        }
    }
    
    public String formataFloat(Float f){
        return String.format("%.2f", Math.abs(f));    
    }
}

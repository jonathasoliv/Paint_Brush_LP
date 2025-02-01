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
public class Reta extends D2{
    public int x1, y1;
   
    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return x - x1; //Retorna a diferença entre as coordenadas x inicial e final 
    }
    
    @Override
    public void desenhar(Graphics g){
       super.desenhar(g);
       g.setColor(corPrimaria);
       g.drawLine(x, y, x1, y1);
    }
    
    // X, Y Coordenadas iniciais da reta.
   // X1, Y1 Coordenadas finais da reta.
}

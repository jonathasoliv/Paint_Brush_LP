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
public class Ponto {
    public int x; //coordenadas x
    public int y; //coordenadas y
    public Color corPrimaria;
    
    public void desenhar(Graphics c){
        c.setColor(corPrimaria);
        c.drawLine(x, y, x, y);
    }
    
}

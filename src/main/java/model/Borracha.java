/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Graphics;

/**
 *
 * @author Cléver & Cauã & Jonathas
 */

public class Borracha extends D2{ // A borracha substitua os pixels da área desejada por pixels que representam a cor de fundo.
    public int base,largura;
    @Override
    public float area() {
        return base * largura;
        
    }

    @Override
    public float perimetro() {
        return 2 * (base + largura);
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(corPrimaria);
        g.fillRect(x, y, 18, 18);
    }
    
}

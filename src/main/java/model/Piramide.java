/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author JonathasOliveira
 */
public class Piramide extends D3 {

    public int largura;
    public int altura;
 

    @Override
    public void desenhar(Graphics g) {
        if (showArea) {
            super.desenhar(g);
        }
       
        
        //implementação rapida do fill da piramide
        g.setColor(corInterna);
        
        // Preenche a base da piramide
        g.fillRect(x, y, largura, altura);

        // Preenche os lados da piramide
        int[] xPoints = {x, x + largura / 2, x + largura}; // Coordenadas X vertices
        int[] yPoints = {y, y - altura, y}; // Coordenadas Y vertices
        // Frente
        g.fillPolygon(xPoints, yPoints, 3);

        // Face traseira
        int[] xPointsTraseira = {x, x + largura / 2, x + largura}; // Coordenadas X vertices
        int[] yPointsTraseira = {y1, y - altura, y1}; // Coordenadas Y vertices
        g.fillPolygon(xPointsTraseira, yPointsTraseira, 3);

        g.setColor(corPrimaria);
        g.drawLine(x,y,x+largura/2,y-altura); //Desenha uma linha da base esquerda para o vértice superior da pirâmide.
        g.drawLine(x, y1, x+largura/2, y-altura); //Desenha uma linha da base esquerda inferior para o vértice superior.
        g.drawLine(x+largura, y, x+largura/2, y-altura); //Desenha uma linha da base direita para o vértice superior.
        g.drawLine(x+largura, y1, x+largura/2, y-altura); //Desenha uma linha da base direita inferior para o vértice superior.
        g.drawRect(x, y, largura, altura); // Desenha um retângulo que representa a base da pirâmide.
    }

    public int getDeslocamentoTextoX() {
        return -(largura);
    }

    public int getDeslocamentoTextoY() {
        return -altura;
    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return 0;
    }

    @Override
    public float volume() {
        return 0;
    }
}

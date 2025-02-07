/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Cléver & Cauã & Jonathas
 */
public class Poligono extends Ponto{
    public ArrayList coordX;
    public ArrayList coordY;
    public Color corSecundaria;
    public Poligono(){
        coordX = new ArrayList<Integer>();
        coordY = new ArrayList<Integer>();
    }
    @Override
    public void desenhar(Graphics g){
       g.setColor(corPrimaria);
        int[] vetX = new int[coordX.size()]; // arrays vetX para armazenar as coordenadas x como inteiros
        int[] vetY = new int[coordY.size()]; // arrays vetY para armazenar as coordenadas y como inteiros
        for(int i = 0; i < coordX.size(); i++){ //popula os arrays vetX e vetY com as coordenadas dos vértices 
            vetX[i] = (int) coordX.get(i);      //armazenadas nas ArrayLists coordX e coordY.
            vetY[i] = (int) coordY.get(i);
        }
       g.drawPolygon(vetX, vetY, coordX.size()); // Desenha o contorno do polígono usando as coordenadas dos vértices.
       g.setColor(corSecundaria);
       g.fillPolygon(vetX, vetY, coordX.size()); //Preenche o interior do polígono com a cor especificada.
    }
}

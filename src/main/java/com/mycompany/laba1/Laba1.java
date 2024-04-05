package com.mycompany.laba1;


public class Laba1 {

    public static void main(String[] args) {
        AutoRandomFiller autoRandomFiller = new AutoRandomFiller();
        GUI gui = new GUI(autoRandomFiller);
        
        gui.setVisible(true);
        gui.setTitle("Лабораторная работа №1 Евграфов Павел");
        gui.setLocationRelativeTo(null);
        
    }
}
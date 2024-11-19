package org.example;

import boisson.Allonge;
import boisson.Boisson;
import boisson.Espresso;
import deco.Choco;
import deco.DecoIngr;
import deco.Noisette;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Main {
    public static void main(String[] args) {
      Boisson boisson=new Choco(new Noisette(new Allonge()));
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());


    }
}
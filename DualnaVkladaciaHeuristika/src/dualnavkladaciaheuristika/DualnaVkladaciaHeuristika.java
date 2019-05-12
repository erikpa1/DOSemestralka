/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dualnavkladaciaheuristika;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class DualnaVkladaciaHeuristika {

    public static void main(String[] args) {
        //Zadanie H3 

        Batoh batoh = new Batoh();

        batoh.SetMaximalCapacity(1500);

        int tmpIndex = 0;
        
        try 
        {
            File aValues = new File("../H3_a.txt");
            File cValues = new File("../H3_c.txt");

            Scanner aVSc = new Scanner(aValues);
            Scanner cVSc = new Scanner(cValues);

            while (aVSc.hasNextInt()) 
            {
                
                BatohItem tmpItem = new BatohItem();                
                tmpItem.SetVaha(aVSc.nextInt());
                tmpItem.SetCena(cVSc.nextInt());

                batoh.AddItem(tmpItem);                
                
            }
            
            System.out.println("Size:");
            System.out.println("Batoh actual capacity: " + batoh.GetActualCapacity());
            System.out.println("Batoh maximal capacity: " + batoh.GetMaxCapacity());
            System.out.println("Batoh hodnota: " + batoh.GetHodnotaBatohu());
            
            while (batoh.GetPocetItemov() > 300)
            {
                batoh.RemoveTheHardestItem();
            }
            
            while (batoh.GetActualCapacity() > batoh.GetMaxCapacity() )
            {
                batoh.RemoveTheHardestItem();
            }  

            PrintWriter writer = new PrintWriter("../Results.txt");
            writer.println("Vaha batoha na konci alg: " + batoh.GetActualCapacity());
            writer.println("Hodnota batoha na konci alg: " + batoh.GetHodnotaBatohu());
            writer.println("Pocet predmetov: " + batoh.GetPocetItemov());
            writer.close();
            
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }

    }

}

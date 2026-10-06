/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author besni_awnuxtr
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mp = new Scanner(System.in);
        float a= 1.5f;
        float note=0;
        int nb=0;
        while (a >=0) {
            System.out.println("Saisir une note :");
            a=mp.nextFloat();
            if (a>=0) {
                note+=a;
                nb+=1;
            }
        }
    if (nb!=0) {
    float moyenne = (note/nb);
    System.out.println("Moyenne des notes : "+moyenne+" et la somme des notes est de : "+note);
    }
    else {
        System.out.println("Il n'y a pas de note !");
    }
    }
}

    


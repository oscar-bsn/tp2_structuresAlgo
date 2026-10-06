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
        /*Scanner mp = new Scanner(System.in);
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
        }*/
        Scanner mp = new Scanner(System.in);
        int nb = (int)(Math.random()*101);
        int essai =  1 ;
        int var   = -1 ;
        int fin   =  0 ;
        while (essai<=10 && fin==0) {
            System.out.println("saisir un nombre entre 0 et 100");
            var=mp.nextInt();
            if (var==nb){
                if (essai==1){
                    System.out.println("tricheur ou voyant, va jouer au loto sinon");
                    fin=1;
                }
                if (essai>=2 && essai<=5){
                    System.out.println("bien joue");
                    fin=1;
                }
                if (essai>=6 && essai<=9){
                    System.out.println("pas trop mal");
                    fin=1;
                }
                if (essai==10){
                    System.out.println("c'était juste");
                    fin=1;
                }
                
            }
            else if (var < nb){
                System.out.println("Plus grand");
            }
            else {
                System.out.println("Plus petit");
            }
            essai+=1;
        }
        if (fin==0){
            System.out.println("nullos, tu peux le faire en respectant un regle simple, faut reflechire un peu");
            fin=1;
        }
    }
    
}


    


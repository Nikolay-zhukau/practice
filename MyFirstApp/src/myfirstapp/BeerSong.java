/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author Forever1
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0){
            if (beerNum == 1){
                word = "bottel";
            }
            
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
                
            }else {
                System.out.println("No more bottels of beer on the wall");
            }
       
    }
    
}
}
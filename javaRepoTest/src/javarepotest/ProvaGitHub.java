/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRepoTest;

/**
 *
 * @author troiano.daniele
 */
public class ProvaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2;
        Bello bello = new Bello ();
        while(true){
            System.out.println("ehi ciao "+ bello.bello + "!" + i);
            i = i + 1;
        }
    }
    
}

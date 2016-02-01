/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi;

import java.util.Scanner;

/**
 *
 * @author mikosty
 */
public class Regexmachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give a regular expression: ");
        String regex = keyboard.nextLine();

        // annetaan regex builderille
        // builder rakentaa DFA:n
        
        
        
        while (true) {
            System.out.println("Give a string to evaluate: ");
            String inputString = keyboard.nextLine();
            
            // inputString syötetään rakennettuun automaattiin joka joko hylkää tai hyväksyy syötteen.
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi;

import java.util.Scanner;
import regexmachi.automate.Automaton;
import regexmachi.automate.PartOfAutomaton;
import regexmachi.automate.State;
import regexmachi.builder.Splitter;

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

        Splitter splitter = new Splitter();

        System.out.println("Give a regular expression: ");
        String regex = keyboard.nextLine();

        // annetaan regex builderille
        // builder rakentaa DFA:n
        Automaton automaton = splitter.buildAutomaton(regex);

        String inputString = "";

        boolean match = true;

        System.out.println("Give a string to evaluate: ");
        inputString = keyboard.nextLine();

        // inputString syötetään rakennettuun automaattiin joka joko hylkää tai hyväksyy syötteen.

        PartOfAutomaton currentPart = automaton.popNext();

        for (int i = 0; i < inputString.length(); i++) {
            Character c = inputString.charAt(i);

            if (currentPart instanceof State) {
                if (!currentPart.accepts(c)) {
                    currentPart = automaton.popNext();
                    if (!currentPart.accepts(c)) {
                        System.out.println("Not a match, first unmatching character is " + "'" + c + "'");
                        match = false;
                        break;
                    } else {
                        currentPart = automaton.popNext();
                    }
                } else {
                    continue;
                }
            } else {
                if (!currentPart.accepts(c)) {
                    System.out.println("Not a match, first unmatching character is " + "'" + c + "'");
                    match = false;
                    break;
                }
                currentPart = automaton.popNext();

            }
        }
        if (match) {
            System.out.println("A match!");
        }

    }

}

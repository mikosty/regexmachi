/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi.builder;

import automate.Automaton;
import automate.PartOfAutomate;

/**
 *
 * @author mikosty
 */
public class Splitter {

    public Automaton buildAutomaton(String regex) {
        
        //aletaan käymään annettua regexiä läpi
        for (int i = 0; i < regex.length(); i++) {

            Character c = regex.charAt(i);

            if (Character.isLetter(c)) {
                // luodaan siirtymä tilalle, joka hyväksyy kirjaimen
            } else if (Character.isDigit(c)) {
                // luodaan siirtymä tilalle, joka hyväksyy numeron
            } else if (c == '\\') {

                if (i + 1 > regex.length()) {
                    // palauta "invalid regex"
                } else if (regex.charAt(i + 1) == '.') {
                    // piste
                } else if (regex.charAt(i + 1) == 'd') {
                    // anyDigit
                } else if (regex.charAt(i + 1) == 'D') {
                    // any Non digit character
                }

            }
        }
        
    }

    public PartOfAutomate anyDigit() {
        
    }
}

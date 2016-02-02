/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi.builder;

import regexmachi.automate.Automaton;
import regexmachi.automate.PartOfAutomaton;
import regexmachi.automate.Transition;

/**
 *
 * @author mikosty
 */
public class Splitter {

    public Automaton buildAutomaton(String regex) {
        
        Automaton automaton = new Automaton();
        
        //aletaan käymään annettua regexiä läpi
        for (int i = 0; i < regex.length(); i++) {

            Character c = regex.charAt(i);

            if (Character.isLetter(c)) {
                // luodaan siirtymä tilalle, joka hyväksyy kirjaimen
                automaton.addPart(this.characterTransition(c));
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
        return automaton;
    }
    
    public PartOfAutomaton characterTransition(Character c) {
        return new Transition(c);
    }

//    public PartOfAutomate anyDigit() {
//        
//    }
}

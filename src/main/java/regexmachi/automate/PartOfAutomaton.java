/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi.automate;

/**
 *
 * @author mikosty
 * 
 * Automaatin kaikki osat toteuttavat 
 */
public interface PartOfAutomaton {
    
    /**
     * Interface for part of automaton class to implement.
     * @param input character for part of automaton to accept
     * @return
     */
    public boolean accepts(Character input);
    
}

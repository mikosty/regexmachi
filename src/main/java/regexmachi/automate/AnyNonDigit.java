/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi.automate;

/**
 *
 * @author mikosty
 */
public class AnyNonDigit implements PartOfAutomaton {

    /**
     *
     * @param input
     * @return
     */
    @Override
    public boolean accepts(Character input) {
        return "ABCDEFGHJKLMNOPQRSTUVWXYZabcefghjklmnopqrstuvwxyz".contains(input.toString());
    }

    
    
}

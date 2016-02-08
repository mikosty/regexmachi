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
public class AnyDigit implements PartOfAutomaton {

    @Override
    public boolean accepts(Character input) {
        return "0123456789".contains(input.toString());
    }

}

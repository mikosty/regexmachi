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
public class Transition implements PartOfAutomaton{
    
    private Character character;
    
    /**
     *
     * @param aCharacter
     */
    public Transition(Character aCharacter) {
        this.character = aCharacter;
    }

    /**
     *
     * @param input
     * @return
     */
    @Override
    public boolean accepts(Character input) {
        return this.character.equals(input);
    }

    
    
}

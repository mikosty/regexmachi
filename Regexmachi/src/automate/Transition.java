/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automate;

/**
 *
 * @author mikosty
 */
public class Transition implements PartOfAutomate{
    
    private Character character;
    
    public Transition(Character aCharacter) {
        this.character = aCharacter;
    }

    @Override
    public boolean accepts(Character input) {
        return this.character.equals(input);
    }
    
}

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
public class State implements PartOfAutomate {

    private PartOfAutomate loopCharacter;

    public State(PartOfAutomate loop) {
        this.loopCharacter = loop;
    }

    @Override
    public boolean accepts(Character input) {
        return this.loopCharacter.accepts(input);
    }

}

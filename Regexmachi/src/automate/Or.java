/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automate;

import java.util.ArrayList;

/**
 *
 * @author mikosty
 */
public class Or implements PartOfAutomate {

    private ArrayList<PartOfAutomate> listOfPossibilities;

    public Or(ArrayList<PartOfAutomate> parts) {
        this.listOfPossibilities = parts;
    }

    @Override
    public boolean accepts(Character input) {

        if (listOfPossibilities.stream().anyMatch((part) -> (part.accepts(input)))) {
            return true;
        }
        return false;
    }

}

package regexmachi.automate;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 *
 * @author mikosty
 */
public class Automaton {

    // lista 
    private ArrayDeque<PartOfAutomaton> automate;

    public Automaton() {
        this.automate = new ArrayDeque();
    }

    public void addPart(PartOfAutomaton part) {
        this.automate.add(part);
    }

    public PartOfAutomaton popNext() {
        return this.automate.poll();
    }
    public PartOfAutomaton peekNext() {
        return this.automate.peekFirst();
    }

    public boolean isEmpty() {
        return automate.isEmpty();
    }

    public int numberOfParts() {
        return automate.size();
    }
}

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

    /**
     *
     */
    public Automaton() {
        this.automate = new ArrayDeque();
    }

    /**
     *
     * @param part
     */
    public void addPart(PartOfAutomaton part) {
        this.automate.add(part);
    }

    /**
     *
     * @return
     */
    public PartOfAutomaton popNext() {
        return this.automate.poll();
    }

    /**
     *
     * @return
     */
    public PartOfAutomaton peekNext() {
        return this.automate.peekFirst();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return automate.isEmpty();
    }

    /**
     *
     * @return
     */
    public int numberOfParts() {
        return automate.size();
    }
    
    /**
     *
     * @return
     */
    public ArrayDeque getDataStructure() {
        return this.automate;
    }
}

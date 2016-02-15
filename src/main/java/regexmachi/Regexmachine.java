
package regexmachi;

import regexmachi.automate.Automaton;
import regexmachi.automate.PartOfAutomaton;
import regexmachi.automate.State;
/**
 *
 * @author mikosty
 */
public class Regexmachine {
    
    private Automaton automaton;
    
    public Regexmachine(Automaton automaton) {
        this.automaton = automaton;
    }
    
    public boolean evaluateString(String inputString) {
        
        
        
        PartOfAutomaton currentPart = automaton.popNext();
        boolean isMatch = true;
        
        for (int i = 0; i < inputString.length(); i++) {
            Character c = inputString.charAt(i);

            if (currentPart instanceof State) {
                
                if(automaton.peekNext() != null) {
                    if(automaton.peekNext().accepts(c)) { // tilasta seuraava hyväksyy, eli ollaan siirrytty tilasta eteenpäin.
                        automaton.popNext();  // popataan seuraavan yli
                        i++; // lisätään indexiä seuraavan yli
                        currentPart = automaton.popNext(); // siirrytään seuraavaan
                        continue;
                    }
                }
                
                if (!currentPart.accepts(c)) {
                    currentPart = automaton.popNext();
                    if (!currentPart.accepts(c)) {
                        System.out.println("Not a match, first unmatching character is " + "'" + c + "'");
                        isMatch = false;
                        break;
                    } else {
                        currentPart = automaton.popNext();
                    }
                } else {
                    continue;
                }
            } else {
                if (!currentPart.accepts(c)) {
                    System.out.println("Not a match, first unmatching character is " + "'" + c + "'");
                    isMatch = false;
                    break;
                }
                currentPart = automaton.popNext();

            }
        }
        return isMatch;
    }
}

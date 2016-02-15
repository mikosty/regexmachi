package regexmachi.builder;

import regexmachi.automate.AnyDigit;
import regexmachi.automate.Automaton;
import regexmachi.automate.PartOfAutomaton;
import regexmachi.automate.State;
import regexmachi.automate.Transition;

/**
 *
 * @author mikosty
 */
public class Splitter {

    /**
     *
     * @param regex
     * @return
     */
    public Automaton buildAutomaton(String regex) {

        Automaton automaton = new Automaton();

        for (int i = 0; i < regex.length(); i++) {

            Character c = regex.charAt(i);

            if (Character.isLetter(c)) {
                // luodaan siirtymä tilalle, joka hyväksyy kirjaimen
                automaton.addPart(this.characterTransition(c));
            } else if (Character.isDigit(c)) {
                // luodaan siirtymä tilalle, joka hyväksyy numeron
                automaton.addPart(this.characterTransition(c));

            } else if (c == '\\') {

                if (i + 1 > regex.length()) {
                    System.out.println("invalid regex");
                    System.exit(0);

                } else if (regex.charAt(i + 1) == '.') {
                    // piste

                } else if (regex.charAt(i + 1) == 'd') {
                    // anyDigit

                    if ("+*".contains(regex.charAt(i + 2) + "")) {
                        automaton.addPart(partOfRegexAnalyst(regex.substring(i, i + 2)));
                        i += 2;
                    }

                    //automaton.addPart(this.anyDigit());
                    //i++;
                } else if (regex.charAt(i + 1) == 'D') {
                    // any Non digit character
                }
            } else if (c == '+') {
                automaton.addPart(null);
            }
        }
        return automaton;
    }

    /**
     *
     * @param part
     * @return
     */
    public PartOfAutomaton partOfRegexAnalyst(String part) {

        Character c = part.charAt(0);

        switch (c) {
            case 1:
                c = '\\';
                if (part.charAt(2) == '+') {
                    if (part.charAt(1) == 'd') {
                        return new State(new AnyDigit());
                    }
                }

        }
        return new State(new AnyDigit());
    }

    /**
     *
     * @param c
     * @return
     */
    public PartOfAutomaton characterTransition(Character c) {
        return new Transition(c);
    }

    /**
     *
     * @return
     */
    public PartOfAutomaton anyDigit() {
        return new AnyDigit();
    }
//    public PartOfAutomaton stateWithLoop(Character c, boolean plus) {
//        return new State(new )
//    }
}

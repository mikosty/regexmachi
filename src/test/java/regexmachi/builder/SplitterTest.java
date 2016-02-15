/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmachi.builder;

import java.util.ArrayDeque;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regexmachi.automate.Automaton;

/**
 *
 * @author mikosty
 */
public class SplitterTest {

    public Splitter splitter;

    public SplitterTest() {
        this.splitter = new Splitter();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void buildsValidAutomatonForBasicRegex() {
        String basic = "abcd";

        Automaton automaton = splitter.buildAutomaton(basic);

        int i = 0;
        boolean match = true;
        
        while (!automaton.isEmpty()) {
            Character c = basic.charAt(i);
            if(!automaton.popNext().accepts(c)) {
                match = false;
                break;
            }
            i++;
        }
        
        if(!automaton.isEmpty()) {
            match = false;
        }

        assertTrue(match);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

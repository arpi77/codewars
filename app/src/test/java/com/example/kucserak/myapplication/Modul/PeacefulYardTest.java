package com.example.kucserak.myapplication.Modul;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by kucserak on 3.7.2017.
 */

public class PeacefulYardTest {
    @Test
    public void ExampleTests() {
        System.out.println("Only one cat is in the yard");
        assertEquals(true, PeacefulYard.peacefulYard(new String[] {"------------", "------------", "-L----------", "------------", "------------", "------------"}, 10));
        System.out.println("There are two cats in the yard, and they are closer than the minimum distance");
        assertEquals(false, PeacefulYard.peacefulYard(new String[] {"------------", "---M--------", "------------", "------------", "-------R----", "------------"}, 6));
        System.out.println("All three cats are in the yard, all further apart than or equal to the minimum distance");
        assertEquals(true, PeacefulYard.peacefulYard(new String[] {"-----------L", "--R---------", "------------", "------------", "------------", "--M---------"}, 4));
    }
}

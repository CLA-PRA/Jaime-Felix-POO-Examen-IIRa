package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Cuenta c1, c2;

    @BeforeAll public static void setUp() {
        c1 = new Cuenta("XYZ", 200);
        c2 = new Cuenta("ABC");
    }

    @Test public void testTitular1() {
        assertTrue(c1.getTitular().equals("XYZ"));
    }

    @Test public void testTitular2() {
        assertTrue(c2.getTitular().equals("ABC"));
    }

    @Test public void testSaldo1() {
        assertTrue(c1.getSaldo()==200.0);
    }

    @Test public void testSaldo2() {
        assertTrue(c2.getSaldo()==0.0);
    }

}
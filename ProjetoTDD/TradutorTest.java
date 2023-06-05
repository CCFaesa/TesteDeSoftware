package sample;

import org.junit.Test;
import static org.junit.Assert.*;

public class TradutorTest {

    @Test
    public void When_estaVazio_WithoutWord_Expected_True() {
        Tradutor tradutor = new Tradutor();
        boolean actual = tradutor.estaVazio();

        assertTrue(actual);
    }

    @Test
    public void When_estaVazio_WithWord_Expected_False() {
        Tradutor tradutor = new Tradutor();
        tradutor.adicionarTraducao("bom", "good");
        boolean actual = tradutor.estaVazio();

        assertFalse(actual);
    }

    @Test
    public void When_traduzir_bom_Expected_Good() {
        Tradutor tradutor = new Tradutor();
        String expected = "good";
        
        tradutor.adicionarTraducao("bom", "good");
        String actual = tradutor.traduzir("bom");

        assertEquals(expected, actual);
    }
    
    @Test
    public void When_AddTwoWord_And_traduzir_First_Expected_First() {
        Tradutor tradutor = new Tradutor();
        String expected = "good";
        
        tradutor.adicionarTraducao("bom", "good");
        tradutor.adicionarTraducao("mau", "bad");
        String actual = tradutor.traduzir("bom");

        assertEquals(expected, actual);
    }
    
    @Test
    public void When_AddTwoWord_And_traduzir_Second_Expected_Second() {
        Tradutor tradutor = new Tradutor();
        String expected = "bad";
        
        tradutor.adicionarTraducao("bom", "good");
        tradutor.adicionarTraducao("mau", "bad");
        String actual = tradutor.traduzir("mau");

        assertEquals(expected, actual);
    }
}

package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ClienteTest {

    @Test
    public void test() {
        Cliente asesora = new Cliente("Maria", "VIP");
        assertEquals(asesora.getNombre(), "Maria");
        assertEquals(asesora.getCategoria(), "VIP");
    }
}

package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void test() {
        Usuario usuario = new Usuario("pepe");
        assertEquals(usuario.getNombre(), "pepe");
    }
}

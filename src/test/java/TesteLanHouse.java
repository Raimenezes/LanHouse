import org.junit.Test;

import static org.junit.Assert.assertEquals;



class TesteLanHouse {

    @Test
    public void deveRetornarNomePC() {
        LanHouse.getInstance().setNomePc("PC 1");
        assertEquals("PC 1", LanHouse.getInstance().getNomePc());
    }

    @Test
    public void deveRetornarnomeUsuario() {
        LanHouse.getInstance().setNomeUsuario("Usuario 1");
        assertEquals("Usuario 1", LanHouse.getInstance().getNomeUsuario());
    }
}

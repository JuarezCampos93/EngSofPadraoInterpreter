import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DiscenteTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Discente discente = new Discente();
        discente.setNota1(2.0);
        discente.setNota2(2.0);

        assertEquals(4.0, discente.calcularNota());
    }

}
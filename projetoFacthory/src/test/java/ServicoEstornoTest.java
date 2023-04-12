import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoEstornoTest {

    @Test
    void deveExecutarEstorno() {
        ServicoEstorno servico = new ServicoEstorno();
        assertEquals("Estorno efetivado", servico.executar());
    }

    @Test
    void deveCancelarEstorno() {
        ServicoEstorno servico = new ServicoEstorno();
        assertEquals("Estorno cancelado", servico.cancelar());
    }

}
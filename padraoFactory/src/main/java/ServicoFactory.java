public class ServicoFactory {

    public static padroescriacao.factorymethod.IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof padroescriacao.factorymethod.IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (padroescriacao.factorymethod.IServico) objeto;
    }
}
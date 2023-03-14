package padroescriacao.factorymethod;

public class ServicoProjetoExtensao implements IServico {

    public String executar() {
        return "Aluno aprovado no processo seletivo";
    }

    public String cancelar() {
        return "Aluno reprovado no processo seletivo";
    }
}

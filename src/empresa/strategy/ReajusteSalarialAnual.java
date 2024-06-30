package empresa.strategy;

import empresa.models.Funcionario;

import java.util.List;

public class ReajusteSalarialAnual implements EstrategiaSalarial{

    @Override
    public void aplicarReajuste(List<Funcionario> funcionarios, double percentual) {
        for (Funcionario funcionario : funcionarios) {
            double novoSalario = funcionario.getSalario() * (1 + percentual / 100);
            funcionario.setSalario(novoSalario);
        }
    }
}

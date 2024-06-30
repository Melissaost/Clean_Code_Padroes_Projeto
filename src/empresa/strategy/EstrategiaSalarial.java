package empresa.strategy;

import empresa.models.Funcionario;

import java.util.List;

public interface EstrategiaSalarial {
    void aplicarReajuste(List<Funcionario> funcionarios, double percentual);
}

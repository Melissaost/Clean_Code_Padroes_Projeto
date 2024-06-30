package empresa.service;

import empresa.models.Funcionario;

public interface ReajusteSalarial {

    void aplicarReajuste(Funcionario funcionario, double percentual);
}

package empresa.service;

import empresa.models.Funcionario;

public class ReajusteSalarialEfetivo implements ReajusteSalarial{

    @Override
    public void aplicarReajuste(Funcionario funcionario, double percentual) {
        if(!funcionario.isTerceirizado()){
            double salarioAjustado = funcionario.getSalario() * (1 + percentual / 100);
            funcionario.setSalario(salarioAjustado);
        }
    }
}

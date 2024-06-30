package empresa.models;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;

import java.util.List;

public interface Funcionario {
    String getNome();
    List<Telefone> getTelefones();
    Endereco getEndereco();
    double getSalario();
    void setSalario (double salario);
    SetoresEnum getSetor();
    CargosEnum getCargo();
    boolean isTerceirizado();
}

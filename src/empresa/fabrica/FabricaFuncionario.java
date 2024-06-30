package empresa.fabrica;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.Telefone;

import java.util.List;

public interface FabricaFuncionario {
    Funcionario criarFuncionario(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo);
}

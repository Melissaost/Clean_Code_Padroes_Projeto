package empresa.fabrica;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.FuncionarioEfetivo;
import empresa.models.Telefone;

import java.util.List;

public class FabricaFuncionarioEfetivo implements FabricaFuncionario{
    @Override
    public Funcionario criarFuncionario(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo) {
        return new FuncionarioEfetivo(nome, telefones, endereco, salario, setor, cargo);
    }
}

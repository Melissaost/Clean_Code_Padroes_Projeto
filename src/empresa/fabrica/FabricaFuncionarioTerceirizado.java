package empresa.fabrica;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.FuncionarioTerceirizado;
import empresa.models.Telefone;

import java.util.List;

public class FabricaFuncionarioTerceirizado implements  FabricaFuncionario{
    @Override
    public Funcionario criarFuncionario(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo) {
        return new FuncionarioTerceirizado(nome, telefones, endereco, salario, setor, cargo, "Empresa Z", "12 meses");
    }
}

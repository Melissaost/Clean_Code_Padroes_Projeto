package empresa.models;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;

import java.util.List;

public class FuncionarioEfetivo extends FuncionarioBase{

    public FuncionarioEfetivo(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo){
        super(nome, telefones, endereco, salario, setor, cargo, false);
    }
}

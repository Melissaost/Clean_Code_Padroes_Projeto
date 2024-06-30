package empresa.decorator;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.Telefone;

import java.util.List;

public class FuncionarioDecorators implements Funcionario {

    private Funcionario funcionario;
    private double bonus;

    public FuncionarioDecorators(Funcionario funcionario, double bonus) {
        this.funcionario = funcionario;
        this.bonus = bonus;
    }


    @Override
    public String getNome() {
        return funcionario.getNome();
    }

    @Override
    public List<Telefone> getTelefones() {
        return funcionario.getTelefones();
    }

    @Override
    public Endereco getEndereco() {
        return funcionario.getEndereco();
    }

    @Override
    public double getSalario() {
        return funcionario.getSalario() + bonus;
    }

    @Override
    public void setSalario(double salario) {
        funcionario.setSalario(salario);
    }

    @Override
    public SetoresEnum getSetor() {
        return null;
    }

    @Override
    public CargosEnum getCargo() {
        return null;
    }

    @Override
    public boolean isTerceirizado() {
        return false;
    }
}

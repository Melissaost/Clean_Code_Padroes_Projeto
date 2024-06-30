package empresa.models;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;

import java.util.List;

public abstract class FuncionarioBase implements Funcionario {
    private String nome;
    private List<Telefone> telefones;
    private Endereco endereco;
    private double salario;
    private SetoresEnum setor;
    private CargosEnum cargo;
    private boolean terceirizado;

    public FuncionarioBase(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo, boolean terceirizado) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
        this.terceirizado = terceirizado;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public SetoresEnum getSetor() {
        return setor;
    }

    @Override
    public CargosEnum getCargo() {
        return cargo;
    }

    @Override
    public boolean isTerceirizado() {
        return terceirizado;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

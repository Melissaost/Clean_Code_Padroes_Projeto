package empresa.builder;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.*;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {
    private String nome;
    private List<Telefone> telefones;
    private Endereco endereco;
    private double salario;
    private SetoresEnum setor;
    private CargosEnum cargo;
    private boolean terceirizado;
    private String empresaContratada;
    private String tempoPrevistoPermanencia;

    public FuncionarioBuilder(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.telefones = new ArrayList<>();
    }

    public FuncionarioBuilder setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
        return this;
    }

    public FuncionarioBuilder setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioBuilder setSetor(SetoresEnum setor) {
        this.setor = setor;
        return this;
    }

    public FuncionarioBuilder setCargo(CargosEnum cargo) {
        this.cargo = cargo;
        return this;
    }

    public FuncionarioBuilder setTerceirizado(boolean terceirizado) {
        this.terceirizado = terceirizado;
        return this;
    }

    public FuncionarioBuilder setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
        return this;
    }

    public FuncionarioBuilder setTempoPrevistoPermanencia(String tempoPrevistoPermanencia) {
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
        return this;
    }

    public Funcionario build() {
        if (terceirizado) {
            return new FuncionarioTerceirizado(nome, telefones, endereco, salario, setor, cargo, empresaContratada, tempoPrevistoPermanencia);
        } else {
            return new FuncionarioEfetivo(nome, telefones, endereco, salario, setor, cargo);
        }
    }
}

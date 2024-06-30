package empresa.models;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;

import java.util.List;

public class FuncionarioTerceirizado extends FuncionarioBase{
    private String empresaContratada;
    private String tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<Telefone> telefones, Endereco endereco, double salario, SetoresEnum setor, CargosEnum cargo, String empresaContratada, String tempoPrevistoPermanencia){
        super(nome, telefones, endereco, salario, setor, cargo, true);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public String getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    public void setTempoPrevistoPermanencia(String tempoPrevistoPermanencia) {
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }
}

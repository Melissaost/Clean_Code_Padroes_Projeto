import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.fabrica.FabricaFuncionario;
import empresa.fabrica.FabricaFuncionarioEfetivo;
import empresa.fabrica.FabricaFuncionarioTerceirizado;
import empresa.models.*;

import empresa.service.ReajusteSalarialEfetivo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("12345-678", "Rua A", "123", "Bairro B", "Cidade C", "Estado D", "País E");

        FabricaFuncionario fabricaEfetivo = new FabricaFuncionarioEfetivo();
        FabricaFuncionario fabricaTerceirizado = new FabricaFuncionarioTerceirizado();


        Funcionario funcionario1 = fabricaEfetivo.criarFuncionario("João", Arrays.asList(new Telefone("1234-5678"), new Telefone("9876-5432")), endereco, 5000.00, SetoresEnum.DESENVOLVIMENTO, CargosEnum.PLENO);
        Funcionario funcionario2 = fabricaTerceirizado.criarFuncionario("Maria", Arrays.asList(new Telefone("1234-5678"), new Telefone("9876-5432")), endereco, 3000.00, SetoresEnum.DEVOPS, CargosEnum.JUNIOR);


        ReajusteSalarialEfetivo reajusteSalarial = new ReajusteSalarialEfetivo();

        System.out.println("Salário do " + funcionario1.getNome() + " antes do reajuste: " + funcionario1.getSalario());
        reajusteSalarial.aplicarReajuste(funcionario1, 12);
        System.out.println("Salário do " + funcionario1.getNome() + " após o reajuste: " + funcionario1.getSalario());

        System.out.println("Salário do " + funcionario2.getNome() + " antes do reajuste: " + funcionario2.getSalario());
        reajusteSalarial.aplicarReajuste(funcionario2, 12);
        System.out.println("Salário do " + funcionario2.getNome() + " após o reajuste: " + funcionario2.getSalario());

    }
}
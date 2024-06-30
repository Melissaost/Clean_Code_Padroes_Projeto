package empresa.strategy;

import empresa.builder.FuncionarioBuilder;
import empresa.decorator.FuncionarioDecorators;
import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.Telefone;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("12345-678", "Rua A", "123", "Bairro B", "Cidade C", "Estado D", "País E");

        Funcionario funcionario1 = new FuncionarioBuilder("Alice", 2000)
                .setTelefones(List.of(new Telefone("12345"), new Telefone("67890")))
                .setEndereco(endereco)
                .setSetor(SetoresEnum.DESENVOLVIMENTO)
                .setCargo(CargosEnum.JUNIOR)
                .setTerceirizado(true)
                .build();

        Funcionario funcionario2 = new FuncionarioBuilder("Melissa", 8000)
                .setTelefones(List.of(new Telefone("12345"), new Telefone("67890")))
                .setEndereco(endereco)
                .setSetor(SetoresEnum.DESENVOLVIMENTO)
                .setCargo(CargosEnum.SENIOR)
                .setTerceirizado(false)
                .build();

        Funcionario funcionario3 = new FuncionarioBuilder("Pierre", 8000)
                .setTelefones(List.of(new Telefone("12345"), new Telefone("67890")))
                .setEndereco(endereco)
                .setSetor(SetoresEnum.DESENVOLVIMENTO)
                .setCargo(CargosEnum.SENIOR)
                .setTerceirizado(false)
                .build();

        System.out.println("Funcionário 2 Antes: " + funcionario2.getNome() +
                ", Salário Antes: " + funcionario2.getSalario());

        System.out.println("\n");

        // Padrão Comportamental: Strategy
        List<Funcionario> funcionarios = List.of(funcionario1, funcionario2, funcionario3);
        EstrategiaSalarial estrategiaAnual = new ReajusteSalarialAnual();
        estrategiaAnual.aplicarReajuste(funcionarios, 5);

        System.out.println("Funcionário 2: " + funcionario2.getNome() +
                ", Salário: " + funcionario2.getSalario());

    }
}

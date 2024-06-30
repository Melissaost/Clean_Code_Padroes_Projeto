package empresa.builder;

import empresa.enums.CargosEnum;
import empresa.enums.SetoresEnum;
import empresa.models.Endereco;
import empresa.models.Funcionario;
import empresa.models.Telefone;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("12345-678", "Rua A", "123", "Bairro B", "Cidade C", "Estado D", "País E");

        Funcionario funcionario1 = new FuncionarioBuilder("Alice", 8000)
                .setTelefones(List.of(new Telefone("12345"), new Telefone("67890")))
                .setEndereco(endereco)
                .setSetor(SetoresEnum.DESENVOLVIMENTO)
                .setCargo(CargosEnum.SENIOR)
                .setTerceirizado(false)
                .build();

        Funcionario funcionario2 = new FuncionarioBuilder("Mel", 3000)
                .setTelefones(List.of(new Telefone("12345"), new Telefone("67890")))
                .setEndereco(endereco)
                .setSetor(SetoresEnum.DESENVOLVIMENTO)
                .setCargo(CargosEnum.JUNIOR)
                .setEmpresaContratada("Empresa")
                .setTempoPrevistoPermanencia("12 Meses")
                .setTerceirizado(true)
                .build();

        System.out.println(funcionario2.getNome()+ funcionario2.getCargo() + funcionario2.isTerceirizado());

    }
}

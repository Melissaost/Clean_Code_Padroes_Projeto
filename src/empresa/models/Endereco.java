package empresa.models;

public class Endereco {

    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String cep, String rua, String numero, String bairro, String cidade, String estado, String pais) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }


}

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    
    //Esse método coloca os parâmetros CPF e NOME como necessários para a criação de um objeto Pessoa.
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
    public void setCpf(String newCpf) {
        cpf = newCpf;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }



}

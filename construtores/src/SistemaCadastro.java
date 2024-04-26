public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        
        //Pessoa pessoa = new Pessoa("126.548.215-75", "Marcos");

        //System.out.println(pessoa.getCpf());
        String[] listaPessoas = {"12654835125", "65487321546", "32132165875", "32121654055", "3215124055"};
        String[] nomePessoas = {"Marcos", "Bruna", "Rayane", "Marcelo", "Joao Pedro"};
        Pessoa pessoas[] = new Pessoa[5];


        for(int i = 0; i < 5; i++) {
            pessoas[i] = new Pessoa(listaPessoas[i], nomePessoas[i]);  
            System.err.println("Pessoa ["+(i+1)+"] = "+pessoas[i].getNome() +" CPF: "+ pessoas[i].getCpf());    
        }
    }
}

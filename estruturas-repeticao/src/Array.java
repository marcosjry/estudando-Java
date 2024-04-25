public class Array {

    public static void main(String[] args) throws Exception {
        
        String alunos[] = {"Marcos", "Marcelos", "João Pedro", "Rayane"};
        //Testtando uma forma diferente de iterar num array que não é possível em C
        for(String aluno: alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }



    }
}

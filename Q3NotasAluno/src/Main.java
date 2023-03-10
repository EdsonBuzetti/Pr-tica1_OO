public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Edson","1234", 20,20,"Sistemas da Informação", 3);
        aluno1.avaliarAluno();
        double notaAE;
        aluno1.avaliarRecuperacao(80);
    }
}
public class EmpregoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos() {
        this.salario = this.salario + (this.horasAula * 40);
        return this.salario;
    }

    String getInfo() {
        return "Nome: " + this.nome + " com salário " + salario;
    }

    public EmpregoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }
}
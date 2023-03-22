package faculdade23;

public class Professor extends Cidadao {
	private String disciplina;
    
    public Professor(String nome, int idade, String endereco, String disciplina) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
    }
    public void apresentar() {
        System.out.println("Sou professora de " + disciplina + ".");
        super.apresentar();
    }
}

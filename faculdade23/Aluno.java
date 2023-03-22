package faculdade23;

public class Aluno extends Cidadao {
	private String curso;
	
	public Aluno(String nome, int idade, String endereco, String curso) {
        super(nome, idade, endereco);
        this.curso = curso;
    }
    
    public void apresentar() {
        System.out.println("Sou estudante do curso de " + curso + ".");
        super.apresentar();
    }
}


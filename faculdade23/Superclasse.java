package faculdade23;

public class Superclasse {

	public static void main(String[] args) {
		Cidadao pessoa = new Cidadao("Jo�o", 32, "Rua do doidinho");
        pessoa.apresentar();
        
        Aluno estudante = new Aluno("Maria", 45, "Rua da doidinha", "Ci�ncia da Computa��o");
        estudante.apresentar();
        
        Professor professor = new Professor("Carlos", 78, "Rua do idoso", "Matem�tica");
        professor.apresentar();
    }
	
}

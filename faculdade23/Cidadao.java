package faculdade23;

public class Cidadao {
    protected String nome;
    protected int idade;
    protected String endereco;
    
    public Cidadao(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public void apresentar() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e moro em " + endereco + ".");
    }
}
package banco;

public class Cliente {
    String nome, endereco;

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
}
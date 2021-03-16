package entities;

public class Produto {
    String nome, descricao, marca;
    public static int  contador = 1;
    private double valor;
    int codigo;

    public Produto(String nome, String descricao, int valor) {
        this.codigo = contador;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.marca = "MARCA";
        Produto.contador += 1;

    }

    public void desconto(double porcentagem){
        double desc = porcentagem/100;
        valor = valor - valor*desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + nome + '\'' +
                ", Descricao='" + descricao + '\'' +
                ", Marca='" + marca + '\'' +
                ", Valor=" + valor +
                ", Codigo=" + codigo +
                '}';
    }
}

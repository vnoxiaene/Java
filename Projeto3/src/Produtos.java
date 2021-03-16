public class Produtos {
    private static int contador = 101;
    private int codigo;
    private String nome;
    private String marca;
    private double valor;
    private int qntEstoque;

    public Produtos(String nome, String marca, double valor, int qntEstoque) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.qntEstoque = qntEstoque;
        this.codigo=contador+1;
        contador++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    @Override
    public String toString() {
        return "Produtos:" +
                "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\nMarca: " + marca +
                "\nValor: " + valor +
                "\nEstoque: " + qntEstoque;
    }
}

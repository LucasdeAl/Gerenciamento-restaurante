package restaurante.dados.cardapio;

public class Item {
    private String codigo; //identificacao do produto
    private String nome; //nome do item
    private String tipo; //entrada, prato principal, sobremesa, bebida
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Item(String codigo, String nome, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + ", Nome: " + this.nome +
                ", Tipo do item: " + this.tipo + ", Valor: " + this.valor;
    }

}

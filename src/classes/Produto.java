package classes;

import java.text.DecimalFormat;

public class Produto extends Item{
    private int quantidade;
    private int quantidadeAdquirida;
    
    public Produto(String nome, String descricao, int qtd, float preco, long foto){
        super(nome, descricao, preco, foto);
        this.quantidade = qtd;
    }
    
    public Produto(){}

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeAdquirida() {
        return quantidadeAdquirida;
    }

    public void setQuantidadeAdquirida(int quantidadeAdquirida) {
        this.quantidadeAdquirida = quantidadeAdquirida;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("##.00");
        return "Nome do Produto: " + getNome() + 
                "\npreço: R$" + df.format(getPreco()) + 
                "\ndescrição: " + getDescricao()+
                "\nquantidade:" + getQuantidadeAdquirida()+
                "\n\n";
    }

}
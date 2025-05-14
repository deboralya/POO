//Class
public class FitasdeVideo{

    private String titulo;
    private double preco;

    public FitasdeVideo (String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    public String getTitulo(){
        return titulo;
    }

    public double getPreco(){
        return preco;
    }
    
    public double getValorAluguel(int numeroDeDiasAlugada){
        return preco * numeroDeDiasAlugada;
    }
    public void imprimir( int numeroDeDiasAlugada){
        System.out.printf("Titulo; %s \n", titulo);
        System.out.printf("Preco do aluguel por dia; RS %.2f \n", preco);
        System.out.printf("Valor do aluguel para %d dias: RS %.2f \n", numeroDeDiasAlugada, getValorAluguel(numeroDeDiasAlugada));
    }
}
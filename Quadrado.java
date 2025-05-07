// Classe
public class Quadrado{
    //Atributos
    private int lado;

    //Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    //Métodos
    public int calcularArea(){
        return lado * lado;
    }
    
    public int calcularPerimetro(){
        return 4 * lado;
    }

    public void  imprimir(){
        System.out.printf("Lado: %d, Àrea: %d, Perímetro: %d \n", lado, calcularArea(), calcularPerimetro());
    }
}


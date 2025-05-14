//Classe
public class Circulo{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }
        public float calcularArea(){
            return 3.141516f * raio * raio;
        }
        public float calcularPerimetro(){
            return 2 * 3.141516f * raio;
        }

        public void  imprimir(){
            System.out.printf("Raio: %d, Àrea: %.2f, Perímetro: %.2f \n", raio, calcularArea(), calcularPerimetro());
        }
}
public class Circulo {
    private double raio;
    private double pi;

    private double calculo;

    public double calcuarArea(double raio, double pi){
        this.raio = raio;
        this.pi = pi;
        calculo = pi * (raio * raio);
        System.out.println(calculo);
        return calculo;
    }
}

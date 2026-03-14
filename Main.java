package PooLab.practica_5;

public class Main {
    public static void main(String[] args) {
        // Asumiendo que en tu enum Figura tienes CORAZONES
        Carta carta1 = new Carta(1, Figura.CORAZONES);

        // Llamamos al método estático directamente
        Visualizador.carta(carta1, new Posicion(20, 40));
    }
}
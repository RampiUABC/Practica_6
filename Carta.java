package PooLab.practica_5;

public class Carta {
    private int valor;
    private Figura figura;

    public Carta(int valor, Figura figura) {
        this.valor = valor;
        this.figura = figura;
    }

    // Estos dos métodos son nuevos y necesarios
    public int getValor() {
        return valor;
    }

    public Figura getFigura() {
        return figura;
    }

    @Override
    public String toString() {
        String valorStr;
        switch (valor) {
            case 1:
                valorStr = "AS";
                break;
            case 11:
                valorStr = "JOTA";
                break;
            case 12:
                valorStr = "REINA";
                break;
            case 13:
                valorStr = "REY";
                break;
            default:
                valorStr = String.valueOf(valor);
                break;
        }
        return valorStr + " de " + figura;
    }
}
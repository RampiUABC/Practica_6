package PooLab.practica_5;

public class Visualizador {

    // Método de clase estático
    public static void carta(Carta c, Posicion p) {

        // 1. Dibujar el "cartón" de la carta (Fondo negro)
        Square fondo = new Square();
        fondo.changeSize(80); // Hacemos la carta un poco más grande
        fondo.changeColor("black");

        // Restamos 310 y 120 (sus posiciones de fábrica) para poder moverlo a p.getX()
        // y p.getY() exactos
        fondo.moveHorizontal(p.getX() - 310);
        fondo.moveVertical(p.getY() - 120);
        fondo.makeVisible();

        // 2. Extraer el enum de la carta que recibimos
        Figura fig = c.getFigura();

        // 3. Dibujar el símbolo adecuado (rojo para corazones/diamantes, amarillo para
        // el resto)
        if (fig == Figura.CORAZONES || fig == Figura.DIAMANTES) {
            Circle simbolo = new Circle();
            simbolo.changeSize(40);
            simbolo.changeColor("red");

            // Ajustamos posición base del Circle (230, 90) más un margen para que quede
            // centrado
            simbolo.moveHorizontal((p.getX() + 20) - 230);
            simbolo.moveVertical((p.getY() + 20) - 90);
            simbolo.makeVisible();
        } else {
            Triangle simbolo = new Triangle();
            simbolo.changeSize(40, 40);
            simbolo.changeColor("yellow"); // Usamos amarillo para que resalte sobre el fondo negro

            // Ajustamos posición base del Triangle (210, 140) más un margen para que quede
            // centrado
            simbolo.moveHorizontal((p.getX() + 40) - 210);
            simbolo.moveVertical((p.getY() + 20) - 140);
            simbolo.makeVisible();
        }
    }
}
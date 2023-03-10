public class App {
    public static void main(String[] args) throws Exception {
       Object [] figuras = new Object[5];
        figuras[0] = new Triangulo(2.5, 5);
        figuras[1] = new Rectangulo(1.3, 2.7);
        figuras[2] = new Circulo(1.3);
        figuras[3] = new Triangulo(4.7, 3);
        figuras[4] = new Rectangulo(3.2, 7.4);

        for(int i = 0; i < figuras.length; i++){
            System.out.println(figuras[i]);
        }

    }
}

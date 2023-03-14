public class Main {
    public static void main(String[] args) {
        Moto moto=new Moto("abc-123");
        Carro carro=new Carro("def-456");
        Camion camion=new Camion(4, "hij-789");
        Peaje peaje=new Peaje("peaje de Cali", "Valle", 0);
        peaje.dineroRecolectado+=peaje.calcularPeaje(moto);
        peaje.dineroRecolectado+=peaje.calcularPeaje(carro);
        peaje.dineroRecolectado+=peaje.calcularPeaje(camion);
        peaje.imprimirLista();
        System.out.println(peaje.dineroRecolectado);
    }
}

import java.util.ArrayList;
public class Peaje {
    public String nombre;
    public String departamento;
    public double dineroRecolectado;
    public ArrayList<String> listaVehiculos;
    Peaje(String nombre, String departamento,double dineroRecolectado){
        this.nombre=nombre;
        this.departamento=departamento;
        this.dineroRecolectado=dineroRecolectado;
        listaVehiculos= new ArrayList<String>();
    }

    public double calcularPeaje(Moto moto){
        listaVehiculos.add("La moto con placa "+moto.placa+" paga: "+moto.valorPeaje);
        return moto.valorPeaje;
    }
    
    public double calcularPeaje(Carro carro){
        listaVehiculos.add("El carro con placa "+carro.placa+" paga: "+carro.valorPeaje);
        return carro.valorPeaje;
    }

    public double calcularPeaje(Camion camion){
        double resultado= camion.nEjes*camion.valorPeaje;
        listaVehiculos.add("El camión con placa "+camion.placa+" de "+ camion.nEjes+" ejes, paga: "+camion.valorPeaje);
        return resultado;
    }

    public void imprimirLista(){
        for (String registro : listaVehiculos) {
            System.out.println(registro);
        }
    }

}

import java.util.Scanner;

public class AppCoche {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Coche miCoche = new Coche();
        
        System.out.println("Marca del carro");
        miCoche.marca = leer.nextLine();
        
        System.out.println("El modelo");
        miCoche.modelo = leer.nextLine();
        
        System.out.println("Año del carro");
        miCoche.anio = leer.nextInt();  
        
        System.out.println(" ");
        
        miCoche.mostrarInfo();
    }
}

class Coche {
    String marca;
    String modelo;
    int anio;   
    
    public void mostrarInfo() {
        System.out.println("Marca :" + marca);
        System.out.println("Modelo es: " + modelo);
        System.out.println("Año :" + anio);
        System.out.println("-------------------");
        System.out.println("fin");
    }
}

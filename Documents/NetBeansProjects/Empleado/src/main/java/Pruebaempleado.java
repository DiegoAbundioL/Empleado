import java.util.*;

public class Pruebaempleado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        empleado empleado1 = new empleado("Brad", "Pitt", 2000.00, 24000.00);
        empleado empleado2 = new empleado("terry", "Crews", 3000.00, 36000.00); 
        
        System.out.printf("Escriba el nombre del empleado1: ");
        String nombre = entrada.nextLine();
        empleado1.setNombre(nombre);
        
        System.out.printf("Escriba el apellido del empleado1: ");
        String apellido = entrada.nextLine();
        empleado1.setApellido(apellido);
        
        System.out.printf("Escriba el salario mensual del empleado1: $%2.f");
        double salariom = entrada.nextDouble();
        empleado1.setSalariom(salariom);
        
        System.out.printf("Su salario anual es de: $%2.f");
        empleado1.getSalarioa();
        
               
        System.out.printf("Escriba el nombre del empleado2: ");
        String nombre = entrada.nextLine();
        empleado2.setNombre(nombre);
        
        System.out.printf("Escriba el apellido del empleado2: ");
        String apellido = entrada.nextLine();
        empleado2.setApellido(apellido);
        
        System.out.printf("Escriba el salario mensual del empleado2: $%2.f");
        double salariom = entrada.nextDouble();
        empleado2.setSalariom(salariom);
        
        System.out.printf("Su salario anual es de: $%2.f");
        empleado2.getSalarioa();
        
        
    }
    
}

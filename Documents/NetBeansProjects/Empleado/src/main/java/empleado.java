
public class empleado {
    private String nombre;
    private String apellido;
    private double salariom;

    
    public empleado(String n, String a, double sm){
        nombre = n;
        apellido = a;
        salariom = sm;

        if(salariom<0.0){
            salariom = 0;
        }
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }
    public String getApellido() {
        return apellido;
    }
 
    public void setSalariom(double sm) {
        this.salariom = sm;

    }
    public double getSalariom() {
        return salariom;
    }
    
    public double getSalarioa(double salario){
        this.salarioa = sa;
        salarioa = salariom * 12;
        return this.getSalarioa();
    }
    
    public double getSalario10(double salario){
        this.salario10 = s10;
        salario10 = salarioa * 0.1;
        return this.getSalario10();
    }
}

    


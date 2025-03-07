package clases;
import javax.swing.JOptionPane;

public  class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String ciudadProcedencia;

    public Persona() {

    }

    public  void registrarDatos(){
        DNI= JOptionPane.showInputDialog("Ingrese el numero de documento");
        nombre= JOptionPane.showInputDialog("Ingrese el nombre");
        apellido= JOptionPane.showInputDialog("Ingrese el apellido");
        fechaNacimiento= JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa)");
        direccion=JOptionPane.showInputDialog("Ingrese la dirección");
        ciudadProcedencia=JOptionPane.showInputDialog("Ingrese la cuidad de procedencia");
    };



    public void imprimirDatosPersona() {
        System.out.println("DNI: " + DNI
                + "\n Nombre: " + nombre +" "+ apellido
                + "\n Fecha Nacimiento: " + fechaNacimiento
                + "\n Direccion: " + direccion
                + "\n Ciudad de Procedencia: " + ciudadProcedencia);
    }

    public String getDni() { return DNI; }
    public void setDni(String dni) { this.DNI = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getCiudadProcedencia() { return ciudadProcedencia; }
    public void setCiudadProcedencia(String ciudadProcedencia) { this.ciudadProcedencia = ciudadProcedencia; }

}
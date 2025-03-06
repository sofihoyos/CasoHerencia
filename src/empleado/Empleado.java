package empleado;
import clases.Persona;
import javax.swing.*;

public class Empleado extends Persona {
    private String codigoEmpleado;
    private int horasExtras;
    private String fechaIngreso;
    private String area;
    private String cargo;

    public Empleado(){

    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        codigoEmpleado= JOptionPane.showInputDialog("Ingrese el codigo del empleado");
        horasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras"));
        fechaIngreso=JOptionPane.showInputDialog("Ingresa la fecha de ingreso (dd/mm/aaaa)");
        area=JOptionPane.showInputDialog("Ingrese el area");
        cargo=JOptionPane.showInputDialog("Ingrese el cargo");
    }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }
    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }
    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
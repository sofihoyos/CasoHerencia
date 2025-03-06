package empleado;
import javax.swing.JOptionPane;

class EmpleadoPlanilla extends Empleado {
    private double salarioMensual;
    private double porcentajeHoraExtra;

    public EmpleadoPlanilla(String dni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia, String codigoEmpleado, int horasExtras, String fechaIngreso, String area, String cargo, double salarioMensual, double porcentajeHoraExtra) {
        super(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.porcentajeHoraExtra = porcentajeHoraExtra;
    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
        porcentajeHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje adicional por hora extra"));
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeHoraExtra() {
        return porcentajeHoraExtra;
    }

    public void setPorcentajeHoraExtra(double porcentajeHoraExtra) {
        this.porcentajeHoraExtra = porcentajeHoraExtra;
    }
}
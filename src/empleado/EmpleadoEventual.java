package empleado;
import javax.swing.JOptionPane;

class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private String fechaTerminoContrato;

    public EmpleadoEventual(String dni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia, String codigoEmpleado, int horasExtras, String fechaIngreso, String area, String cargo, double honorariosPorHora, String fechaTerminoContrato) {
        super(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo);
        this.honorariosPorHora = honorariosPorHora;
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        honorariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
        fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese la fecha de termino de contrato (dd/mm/aaaa)");
    }

    public double getHonorariosPorHora() {
        return honorariosPorHora;
    }

    public void setHonorariosPorHora(double honorariosPorHora) {
        this.honorariosPorHora = honorariosPorHora;
    }

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }


}
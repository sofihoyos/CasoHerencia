package empleado;
import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla {
    private String especialidad;
    private String numeroConsultorio;

    public Medico(String dni, String nombre,
                  String apellido, String fechaNacimiento,
                  String direccion, String ciudadProcedencia,
                  String codigoEmpleado, int horasExtras,
                  String fechaIngreso, String area,
                  String cargo, double salarioMensual,
                  double porcentajeHoraExtra, String especialidad,
                  String numeroConsultorio) {
        super(dni, nombre, apellido, fechaNacimiento,
                direccion, ciudadProcedencia, codigoEmpleado,
                horasExtras, fechaIngreso, area, cargo,
                salarioMensual, porcentajeHoraExtra);

        this.especialidad = especialidad;
        this.numeroConsultorio = numeroConsultorio;
    }

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        especialidad= JOptionPane.showInputDialog("Ingrese su especialidad");
        numeroConsultorio=JOptionPane.showInputDialog("Ingrese el numero del consultorio");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }
}
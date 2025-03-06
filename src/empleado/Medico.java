package empleado;
import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla {
    private String especialidad;
    private String numeroConsultorio;

    public Medico(){

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
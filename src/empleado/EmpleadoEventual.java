package empleado;
import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
    private double honorariosPorHora;
    private String fechaTerminoContrato;

    public EmpleadoEventual(){

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
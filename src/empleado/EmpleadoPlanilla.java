package empleado;
import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado {
    private double salarioMensual;
    private double porcentajeHoraExtra;

    public EmpleadoPlanilla(){

    }

    @Override
    public void registrarDatos(){
        super.registrarDatos();

        salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
        porcentajeHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje adicional por hora extra"));
    }

    public void imprimirDatosPersona() {
        System.out.println("\n Salario Mensual: " + salarioMensual
                + "\n Porcentaje Adicional por Hora Extra: " + porcentajeHoraExtra);
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
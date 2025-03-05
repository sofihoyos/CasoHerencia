package clases;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Paciente extends Persona {
    private String numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> alergias;

public Paciente(String DNI, String nombre,
                String apellido, String fechaNacimiento,
                String direccion, String ciudadProcedencia,
                String numeroHistoriaClinica, String sexo,
                String grupoSanguineo, ArrayList<String> alergias) {
    super(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
    this.numeroHistoriaClinica = numeroHistoriaClinica;
    this.sexo = sexo;
    this.grupoSanguineo = grupoSanguineo;
    this.alergias = alergias;
}

    @Override
    public void registrarDatos() {
        //se llama al metodo de registrar datos de la clase persona
        super.registrarDatos();

        //se llaman los datos del paciente para ingresar
        alergias=new ArrayList<String>();
        numeroHistoriaClinica= JOptionPane.showInputDialog("Ingrese el numero de historia clinica");
        sexo= JOptionPane.showInputDialog("Ingrese el sexo (Masculino o Femenino)");
        grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanguineo");

        String pregunta=JOptionPane.showInputDialog("¿Es alergico a algun medicamento? Ingrese si o no");

        if (pregunta.equalsIgnoreCase("si")) {
            String medicamento="";
            String continuar="";
            do{
                medicamento=JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que es alergico");
                alergias.add(medicamento);

                continuar=JOptionPane.showInputDialog("Ingrese si, si desea continuar");
            }while(continuar.equalsIgnoreCase("si"));
        }

    }

    public String getNumeroHistoriaClinica() { return numeroHistoriaClinica; }
    public void setNumeroHistoriaClinica(String numeroHistoriaClinica) { this.numeroHistoriaClinica = numeroHistoriaClinica; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getGrupoSanguineo() { return grupoSanguineo; }
    public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }
    public ArrayList<String> getAlergias() { return alergias; }


}

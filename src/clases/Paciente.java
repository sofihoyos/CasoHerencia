package clases;

import java.util.ArrayList;
public class Paciente extends Persona {
    private String numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> alergias;

    public Paciente(String dni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia, String numeroHistoriaClinica, String sexo, String grupoSanguineo) {
        super(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.alergias = new ArrayList<>();
    }

    public String getNumeroHistoriaClinica() { return numeroHistoriaClinica; }
    public void setNumeroHistoriaClinica(String numeroHistoriaClinica) { this.numeroHistoriaClinica = numeroHistoriaClinica; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getGrupoSanguineo() { return grupoSanguineo; }
    public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }
    public ArrayList<String> getAlergias() { return alergias; }

    public void agregarAlergia(String alergia) {
        alergias.add(alergia);
    }

    @Override
    public void registrarDatos() {
        System.out.println("Registrando datos del paciente...");
    }
}

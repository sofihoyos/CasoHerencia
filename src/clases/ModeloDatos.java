package clases;

import empleado.EmpleadoPlanilla;
import empleado.EmpleadoEventual;
import empleado.Medico;
import clases.CitaMedica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ModeloDatos {
    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoPlanilla> empleadoPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadoEventualMap;
    HashMap<String, Medico> medicoMap;
    ArrayList<CitaMedica> citasList;

    public ModeloDatos(){
        pacientesMap = new HashMap<String, Paciente>();
        empleadoPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
        medicoMap = new HashMap<String, Medico>();
        citasList = new ArrayList<CitaMedica>();
    }

    public void registrarPersona(Paciente miPaciente){
        pacientesMap.put(miPaciente.getDni(), miPaciente);
        System.out.println("Se ha registrado el paciente " +miPaciente.getNombre()+ " ¡EXITOSAMENTE!");
    }

    public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla){
        empleadoPlanillaMap.put(miEmpleadoPlanilla.getDni(), miEmpleadoPlanilla);
        System.out.println("Se ha registrado el empleado por planilla " +miEmpleadoPlanilla.getNombre()+ " ¡EXITOSAMENTE!");
    }

    public void registrarPersona(EmpleadoEventual miEmpleadoEventual){
        empleadoEventualMap.put(miEmpleadoEventual.getDni(), miEmpleadoEventual);
        System.out.println("Se ha registrado el empleado eventual " +miEmpleadoEventual.getNombre()+ " ¡EXITOSAMENTE!");
    }

    public void registrarPersona(Medico miMedico){
        medicoMap.put(miMedico.getDni(), miMedico);
        System.out.println("Se ha registrado el medico " +miMedico.getNombre()+ " ¡EXITOSAMENTE!");
    }

    public void imprimirPacientes(){
        System.out.println("PACIENTES REGISTRADOS\n");
        Iterator<String> iterator=pacientesMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            pacientesMap.get(clave).imprimirDatosPersona();
        }
    }

    public void imprimirEmpleadoEventuales(){
        System.out.println("EMPLEADOS EVENTUALES REGISTRADOS\n");
        Iterator<String> iterator=empleadoEventualMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            empleadoEventualMap.get(clave).imprimirDatosPersona();
        }
    }

    public void imprimirEmpleadosPlanilla(){
        System.out.println("EMPLEADOS POR PLANILLA REGISTRADOS\n");
        Iterator<String> iterator=empleadoPlanillaMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            empleadoPlanillaMap.get(clave).imprimirDatosPersona();
        }
    }

    public void imprimirMedico(){
        System.out.println("MEDICOS REGISTRADOS\n");
        Iterator<String> iterator=medicoMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            medicoMap.get(clave).imprimirDatosPersona();
        }
    }

    public Medico consultaMedicoPorNombre(String nombreMedico) {
        for (Medico medico : medicoMap.values()) {
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
                return medico;
                //al retornar automaticamente termina el ciclo
            }
        }

        return null;
        //si no se encuentra medico retorna nulo
    }

    public Paciente consultarPacientePorDocumento(String dniPaciente){
        Paciente miPaciente= null;

        if (pacientesMap.containsKey(dniPaciente)){
            miPaciente=pacientesMap.get(dniPaciente);
        }

        //si el paciente existe lo retorna, sino retorna nulo
        return miPaciente;
    }

    public void registrarCitaMedica(CitaMedica miCita){
        citasList.add(miCita);
        System.out.println("Se ha registrado la cita exitosamente\n");
        System.out.println(miCita.informacionCitaMedica());
    }

    public void imprimirCitasMedicasProgramadas(){
        System.out.println("CITAS MEDICAS PROGRAMADAS\n");
        CitaMedica miCita = null;

        if (citasList.size()>0) {
            for (int i=0; i<citasList.size(); i++){
                miCita=citasList.get(i);
                System.out.println(miCita.informacionCitaMedica());
            }
        }else{
            System.out.println("No hay citas programadas");
        }
    }
}

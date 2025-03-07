package clases;

import clases.empleado.EmpleadoPlanilla;
import clases.empleado.EmpleadoEventual;
import clases.empleado.Medico;
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
        if (pacientesMap.containsKey(miPaciente.getDni())) {
            System.out.println("El paciente ya se encuentra registrado en el sistema");

        } else {
            pacientesMap.put(miPaciente.getDni(), miPaciente);
            System.out.println("Se ha registrado el paciente " +miPaciente.getNombre()+ " ¡EXITOSAMENTE!");
        }
    }

    public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla){
        if (empleadoPlanillaMap.containsKey(miEmpleadoPlanilla.getDni())){
            System.out.println("El empleado por planilla ya se encuentra registrado en el sistema");
        }else {
            empleadoPlanillaMap.put(miEmpleadoPlanilla.getDni(), miEmpleadoPlanilla);
            System.out.println("Se ha registrado el empleado por planilla " + miEmpleadoPlanilla.getNombre() + " ¡EXITOSAMENTE!");
        }
    }

    public void registrarPersona(EmpleadoEventual miEmpleadoEventual){
        if (empleadoEventualMap.containsKey(miEmpleadoEventual.getDni())){
            System.out.println("El empleado eventual ya se encuentra registrado en el sistema");
        } else {
            empleadoEventualMap.put(miEmpleadoEventual.getDni(), miEmpleadoEventual);
            System.out.println("Se ha registrado el empleado eventual " + miEmpleadoEventual.getNombre() + " ¡EXITOSAMENTE!");
        }
    }

    public void registrarPersona(Medico miMedico){
        if (medicoMap.containsKey(miMedico.getDni())){
            System.out.println("El medico ya se encuentra registrado en el sistema");
        } else {
            medicoMap.put(miMedico.getDni(), miMedico);
            System.out.println("Se ha registrado el medico " + miMedico.getNombre() + " ¡EXITOSAMENTE!");
        }
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
        System.out.println("\n");
        imprimirMedico();

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

    public EmpleadoPlanilla consultaEmpleadoPlanilla(String dniEmpleadoPlanilla) {
        EmpleadoPlanilla miEmpleadoPlanilla = null;

        if (empleadoPlanillaMap.containsKey(dniEmpleadoPlanilla)){
            miEmpleadoPlanilla=empleadoPlanillaMap.get(dniEmpleadoPlanilla);
            System.out.println("Empleado encontrado: " + miEmpleadoPlanilla.getNombre()); // Verificar si se obtiene un objeto válido
            miEmpleadoPlanilla.imprimirDatosPersona();
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }

        return miEmpleadoPlanilla;

    }
    public EmpleadoEventual consultaEmpleadoEventual(String dniEmpleadoEventual) {
        EmpleadoEventual miEmpleadoEventual = null;

        if (empleadoEventualMap.containsKey(dniEmpleadoEventual)){
            miEmpleadoEventual=empleadoEventualMap.get(dniEmpleadoEventual);
            System.out.println("Empleado encontrado: " + miEmpleadoEventual.getNombre()); // Verificar si se obtiene un objeto válido
            miEmpleadoEventual.imprimirDatosPersona();
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }

        return miEmpleadoEventual;

    }

    public Paciente consultaPaciente(String dniPaciente) {
        Paciente miPaciente = null;

        if (pacientesMap.containsKey(dniPaciente)){
            miPaciente=pacientesMap.get(dniPaciente);
            System.out.println("Empleado encontrado: " + miPaciente.getNombre()); // Verificar si se obtiene un objeto válido
            miPaciente.imprimirDatosPersona();
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }

        return miPaciente;

    }

    public Medico consultaMedico(String dniMedico) {
        Medico miMedico = null;

        if (medicoMap.containsKey(dniMedico)){
            miMedico=medicoMap.get(dniMedico);
            System.out.println("Empleado encontrado: " + miMedico.getNombre()); // Verificar si se obtiene un objeto válido
            miMedico.imprimirDatosPersona();
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }

        return miMedico;

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

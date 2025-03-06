package clases;
import empleado.EmpleadoPlanilla;
import empleado.EmpleadoEventual;
import empleado.Medico;

import java.util.HashMap;
import java.util.Iterator;

public class ModeloDatos {
    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoPlanilla> empleadoPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadoEventualMap;
    HashMap<String, Medico> medicoMap;

    public ModeloDatos(){
        pacientesMap = new HashMap<String, Paciente>();
        empleadoPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
        medicoMap = new HashMap<String, Medico>();
    }

    public void registrarPersona(Paciente miPaciente){
        pacientesMap.put(miPaciente.getDni(), miPaciente);
        System.out.println("Se ha registrado el paciente " +miPaciente.getNombre()+ "¡EXITOSAMENTE!");
    }

    public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla){
        empleadoPlanillaMap.put(miEmpleadoPlanilla.getDni(), miEmpleadoPlanilla);
        System.out.println("Se ha registrado el empleado por planilla " +miEmpleadoPlanilla.getNombre()+ "¡EXITOSAMENTE!");
    }

    public void registrarPersona(EmpleadoEventual miEmpleadoEventual){
        empleadoEventualMap.put(miEmpleadoEventual.getDni(), miEmpleadoEventual);
        System.out.println("Se ha registrado el empleado eventual " +miEmpleadoEventual.getNombre()+ "¡EXITOSAMENTE!");
    }

    public void registrarPersona(Medico miMedico){
        medicoMap.put(miMedico.getDni(), miMedico);
        System.out.println("Se ha registrado el medico " +miMedico.getNombre()+ "¡EXITOSAMENTE!");
    }

    public void imprimirPacientes(){
        String msj="PACIENTES REGISTRADOS\n";
        Iterator<String> iterator=pacientesMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            pacientesMap.get(clave).imprimirDatosPersona(msj);
        }
    }

    public void imprimirEmpleadoEventuales(){
        String msj="EMPLEADOS EVENTUALES REGISTRADOS\n";
        Iterator<String> iterator=empleadoEventualMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            empleadoEventualMap.get(clave).imprimirDatosPersona(msj);
        }
    }

    public void imprimirEmpleadosPlanilla(){
        String msj="EMPLEADOS POR PLANILLA REGISTRADOS\n";
        Iterator<String> iterator=empleadoPlanillaMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            empleadoPlanillaMap.get(clave).imprimirDatosPersona(msj);
        }
    }

    public void imprimirMedico(){
        String msj="MEDICOS REGISTRADOS\n";
        Iterator<String> iterator=medicoMap.keySet().iterator();

        while (iterator.hasNext()){
            String clave= iterator.next();
            medicoMap.get(clave).imprimirDatosPersona(msj);
        }
    }
}

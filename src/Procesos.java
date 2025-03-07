import javax.swing.JOptionPane;
import clases.ModeloDatos;
import clases.Paciente;
import clases.Persona;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;
import clases.CitaMedica;

public class Procesos {

    ModeloDatos miModeloDatos;

    public Procesos(){
        miModeloDatos = new ModeloDatos();
        presentarMenuOpciones();
    }

    private void presentarMenuOpciones() {

        String menu= "MENU HOSPITAL\n\n";
        menu+="1. Registrar Paciente\n";
        menu+="2. Registrar Empleado\n";
        menu+="3. Registrar Cita \n";
        menu+="4. Imprimir Informacion\n";
        menu+="5. Salir\n\n";
        menu+="Ingrese una opcion (1-5)\n";

        int opcion=0;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion){
                case 1: registrarPaciente(); break;
                case 2: registrarEmpleado(); break;
                case 3: registrarCitaMedica(); break;
                case 4: imprimirInformacion(); break;
                case 5: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opcion invalida, intente de nuevo"); break;
            }

        }while(opcion!=5);
        
    }
    private void registrarPaciente() {
        Paciente miPaciente = new Paciente();
        miPaciente.registrarDatos();;

        miModeloDatos.registrarPersona(miPaciente);
    }

    private void registrarEmpleado() {
        String menuTipoEmpleado = "Registro de empleado\n";
        menuTipoEmpleado+= "1. Empleado Eventual\n";
        menuTipoEmpleado+= "2. Empleado por Planilla\n";
        menuTipoEmpleado+= "Selecione el tipo de empleado a registrar\n";

        int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));

        switch (tipoEmpleado){
            case 1:
                //Registro del empleado eventual
                EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual();
                miEmpleadoEventual.registrarDatos();

                miModeloDatos.registrarPersona(miEmpleadoEventual);
                break;

            case 2:
                String opc=JOptionPane.showInputDialog("Ingrese si, si es un medico de lo contrario es otro tipo de empleado");

                if (opc.equalsIgnoreCase("si")){
                    //Registro de medico
                    Medico miMedico = new Medico();
                    miMedico.registrarDatos();

                    miModeloDatos.registrarPersona(miMedico);

                }else{
                    //Registro del empleado por planilla
                    EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla();
                    miEmpleadoPlanilla.registrarDatos();

                    miModeloDatos.registrarPersona(miEmpleadoPlanilla);
                }
                break;

            default: System.out.println("La opcion ingresada no corresponde a ningun tipo de empleado, intentelo de nuevo");
            break;
        }

    }

    private void imprimirInformacion() {
        String menuImprimir = "MENU DE INFORMACION.\n";
        menuImprimir+= "1. Listar Pacientes\n";
        menuImprimir+= "2. Listar Empleados Eventuales\n";
        menuImprimir+= "3. Listar Empleados Por Planilla\n";
        menuImprimir+= "4. Listar Medicos\n";
        menuImprimir+= "5. Listar Citas Programadas\n";
        menuImprimir+= "6. Consultas Individuales\n";
        menuImprimir+= "Ingrese una opcion (1-6)\n";

        int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));

        switch (opcion){
            case 1: miModeloDatos.imprimirPacientes(); break;
            case 2: miModeloDatos.imprimirEmpleadoEventuales(); break;
            case 3: miModeloDatos.imprimirEmpleadosPlanilla(); break;
            case 4: miModeloDatos.imprimirMedico(); break;
            case 5: miModeloDatos.imprimirCitasMedicasProgramadas(); break;
            case 6: imprimirInformacion2();break;

            default:System.out.println("No existe esa opcion");
        }
    }


    private void imprimirInformacion2() {
        String menuImprimir = "MENU DE CONSULTAS.\n";
        menuImprimir+= "1. Listar Pacientes por DNI\n";
        menuImprimir+= "2. Listar Empleados Eventuales por DNI\n";
        menuImprimir+= "3. Listar Empleados Planilla por DNI\n";
        menuImprimir+= "4. Listar Medicos por DNI\n";
        menuImprimir+= "Ingrese una opcion (1-4)\n";

        int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));

        switch (opcion){
            case 1: miModeloDatos.consultaPaciente(JOptionPane.showInputDialog("Ingrese el numero del documento")); break;
            case 2: miModeloDatos.consultaEmpleadoEventual(JOptionPane.showInputDialog("Ingrese el numero del documento"));break;
            case 3: miModeloDatos.consultaEmpleadoPlanilla(JOptionPane.showInputDialog("Ingrese el numero de documento")); break;
            case 4: miModeloDatos.consultaMedico(JOptionPane.showInputDialog("Ingrese el numero del documento")); break;

            default:System.out.println("No existe esa opcion");
        }
    }


    private void registrarCitaMedica() {
        String dniPaciente = JOptionPane.showInputDialog("Ingrese el numero del documento del paciente");

        Paciente pacienteEncontrado = miModeloDatos.consultarPacientePorDocumento(dniPaciente);

        if (pacienteEncontrado != null){
            String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del medico");
            Medico medicoEncontrado = miModeloDatos.consultaMedicoPorNombre(nombreMedico);
            if (medicoEncontrado != null){

                String servicio= JOptionPane.showInputDialog("Ingrese el motivo de la consulta");
                String fechaConsulta= JOptionPane.showInputDialog("Ingrese la fecha de la consulta (dd/mm/aaaa)");
                String horaConsulta = JOptionPane.showInputDialog("Ingrese la hora de la consulta (HH:MM)");
                String lugar = "La cita sera en el consultorio "+medicoEncontrado.getNumeroConsultorio();

                CitaMedica miCita = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
                miModeloDatos.registrarCitaMedica(miCita);

            }else{
                System.out.println("El medico no se encuentra registrado");
            }
        }else{
            System.out.println("El paciente no se encuentra registrado");
        }
    }




    
}

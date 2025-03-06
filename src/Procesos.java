import javax.swing.JOptionPane;

public class Procesos {
    public Procesos(){
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

    private void imprimirInformacion() {
    }

    private void registrarCitaMedica() {
    }

    private void registrarEmpleado() {
    }

    private void registrarPaciente() {
        
    }
    
}

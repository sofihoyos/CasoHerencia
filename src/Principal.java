import clases.Paciente;
import empleado.Empleado;
import empleado.EmpleadoPlanilla;
import empleado.Medico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<CitaMedica> citas = new ArrayList<>();

        System.out.print("Ingrese la cantidad de empleados a registrar: ");
        int numEmpleados = scanner.nextInt();
        System.out.print("Ingrese la cantidad de pacientes a registrar: ");
        int numPacientes = scanner.nextInt();
        System.out.print("Ingrese la cantidad de médicos a registrar: ");
        int numMedicos = scanner.nextInt();

        // Registro de empleados
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Registrando empleado " + (i + 1));
            System.out.print("Ingrese el DNI: ");
            String dni = scanner.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();
            empleados.add(new EmpleadoPlanilla(dni, nombre, "Apellido", "01/01/1980", "Direccion", "Ciudad", "E00" + i, 0, "01/01/2020", "Administración", "Cargo", 1000, 10));
        }

        // Registro de pacientes
        for (int i = 0; i < numPacientes; i++) {
            System.out.println("Registrando paciente " + (i + 1));
            System.out.print("Ingrese el DNI: ");
            String dni = scanner.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();
            pacientes.add(new Paciente(dni, nombre, "Apellido", "01/01/1990", "Direccion", "Ciudad", "H00" + i, "M", "O+"));
        }

        // Registro de médicos
        for (int i = 0; i < numMedicos; i++) {
            System.out.println("Registrando médico " + (i + 1));
            System.out.print("Ingrese el DNI: ");
            String dni = scanner.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();
            System.out.print("Ingrese la especialidad: ");
            String especialidad = scanner.next();
            medicos.add(new Medico(dni, nombre, "Apellido", "01/01/1985", "Direccion", "Ciudad", "M00" + i, 0, "01/01/2015", "Salud", "Doctor", 2000, 15, especialidad, 101));
        }

        // Registro de citas médicas
        System.out.print("¿Cuántas citas desea registrar? ");
        int numCitas = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < numCitas; i++) {
            System.out.println("Registrando cita " + (i + 1));
            System.out.print("Ingrese DNI del paciente: ");
            String dniPaciente = scanner.next();
            Paciente paciente = buscarPaciente(pacientes, dniPaciente);
            if (paciente == null) {
                System.out.println("clases.Paciente no encontrado.");
                continue;
            }

            System.out.print("Ingrese DNI del médico: ");
            String dniMedico = scanner.next();
            Medico medico = buscarMedico(medicos, dniMedico);
            if (medico == null) {
                System.out.println("Médico no encontrado.");
                continue;
            }

            System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
            String fechaStr = scanner.next();
            Date fecha;
            try {
                fecha = dateFormat.parse(fechaStr);
            } catch (ParseException e) {
                System.out.println("Formato de fecha incorrecto.");
                continue;
            }

            System.out.print("Ingrese la hora (HH:mm): ");
            String hora = scanner.next();
            System.out.print("Ingrese el servicio: ");
            String servicio = scanner.next();

            citas.add(new CitaMedica(paciente, medico, fecha, hora, servicio));
            System.out.println("Cita registrada con éxito.");
        }

        // Mostrar citas registradas
        System.out.println("\nCitas médicas registradas:");
        for (CitaMedica cita : citas) {
            cita.imprimirCita();
            System.out.println("--------------------------");
        }
    }

    public static Paciente buscarPaciente(ArrayList<Paciente> pacientes, String dni) {
        for (Paciente p : pacientes) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    public static Medico buscarMedico(ArrayList<Medico> medicos, String dni) {
        for (Medico m : medicos) {
            if (m.getDni().equals(dni)) {
                return m;
            }
        }
        return null;
    }
}

import java.util.Date;

class CitaMedica {
    private Paciente paciente;
    private Medico medico;
    private Date fecha;
    private String hora;
    private String servicio;

    public CitaMedica(Paciente paciente, Medico medico, Date fecha, String hora, String servicio) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.servicio = servicio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getServicio() {
        return servicio;
    }

    public void imprimirCita() {
        System.out.println("Cita Médica:");
        System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido());
        System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido());
        System.out.println("Especialidad: " + medico.getEspecialidad());
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Servicio: " + servicio);
    }
}

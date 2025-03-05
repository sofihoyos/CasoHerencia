class Medico extends EmpleadoPlanilla {
    private String especialidad;
    private int numeroConsultorio;

    public Medico(String dni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudadProcedencia, String codigoEmpleado, int horasExtras, String fechaIngreso, String area, String cargo, double salarioMensual, double porcentajeHoraExtra, String especialidad, int numeroConsultorio) {
        super(dni, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia, codigoEmpleado, horasExtras, fechaIngreso, area, cargo, salarioMensual, porcentajeHoraExtra);
        this.especialidad = especialidad;
        this.numeroConsultorio = numeroConsultorio;
    }

    @Override
    public void registrarDatos() {
        System.out.println("Médico registrado: " + getNombre() + " " + getApellido() + ", Especialidad: " + especialidad);
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
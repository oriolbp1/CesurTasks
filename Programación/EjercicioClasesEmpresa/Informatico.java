class Informatico extends Empleado {
    private String nivelExperiencia;
    private String especialidad;

    public Informatico() {
    }

    public Informatico(int id, String nombre, String apellido, int edad, int sueldo, String nivelExperiencia, String especialidad) {
        super(id, nombre, apellido, edad, sueldo);
        this.nivelExperiencia = nivelExperiencia;
        this.especialidad = especialidad;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
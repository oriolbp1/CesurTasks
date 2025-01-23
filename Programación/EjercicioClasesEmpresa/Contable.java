class Contable extends Empleado {
    private String certificaciones;
    private String puesto;

    public Contable() {
    }

    public Contable(int id, String nombre, String apellido, int edad, int sueldo, String certificaciones, String puesto) {
        super(id, nombre, apellido, edad, sueldo);
        this.certificaciones = certificaciones;
        this.puesto = puesto;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

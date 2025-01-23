class Administrativo extends Empleado {
    private boolean senior;
    private String oficina;

    // Constructor sin parámetros
    public Administrativo() {
    }

    // Constructor con parámetros
    public Administrativo(int id, String nombre, String apellido, int edad, int sueldo, boolean senior, String oficina) {
        super(id, nombre, apellido, edad, sueldo);
        this.senior = senior;
        this.oficina = oficina;
    }

    // Getters y Setters
    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }
}

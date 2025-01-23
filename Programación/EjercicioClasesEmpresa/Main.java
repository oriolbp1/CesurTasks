public class Main {
    public static void main(String[] args) {

    	Administrativo admin = new Administrativo(1, "María", "Pérez", 30, 2000, true, "Zaragoza");
        System.out.println("Administrativo - Id Empleado: " + admin.getId() + ", " + admin.getNombre() + " " + admin.getApellido() + ", " + admin.getEdad() + " años, Sueldo: " + admin.getSueldo() + "€, ¿Es senior? " + admin.isSenior() + ", Oficina: " + admin.getOficina());

        Contable contable = new Contable();
        contable.setId(2);
        contable.setNombre("Oriol");
        contable.setApellido("Ballesteros Pujol");
        contable.setEdad(29);
        contable.setSueldo(3000);
        contable.setCertificaciones("CPA");
        contable.setPuesto("Auditor");
        System.out.println("Contable - Id Empleado: " + contable.getId() + ", " + contable.getNombre() + " " + contable.getApellido() + ", " + contable.getEdad() + " años, Sueldo: " + contable.getSueldo() + "€, Certificaciones: " + contable.getCertificaciones() + ", Puesto: " + contable.getPuesto());

        Informatico informatico = new Informatico(3, "Ana", "García", 23, 1500, "Junior", "Desarrollo Web");
        System.out.println("Informático - Id Empleado: " + informatico.getId() + ", " + informatico.getNombre() + " " + informatico.getApellido() + ", " + informatico.getEdad() + " años, Sueldo: " + informatico.getSueldo() + "€, Experiéncia: " + informatico.getNivelExperiencia() + ", Especialización: " + informatico.getEspecialidad());
    }
}

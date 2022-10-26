package Tema8;
public class Main {
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.setNombre("Jose");
        persona1.setEdad(22);
        persona1.setTelefono(26934);
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Telefono: "+persona1.getTelefono());
    }
}

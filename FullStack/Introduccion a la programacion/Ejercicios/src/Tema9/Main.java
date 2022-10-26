package Tema9;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Joselito");
        cliente1.setEdad(22);
        cliente1.setTelefono(26934);
        cliente1.setCredito(999);
        System.out.println("Nombre: "+cliente1.getNombre());
        System.out.println("Edad: "+cliente1.getEdad());
        System.out.println("Telefono: "+cliente1.getTelefono());
        System.out.println("Credito: "+cliente1.getCredito());
        //---
        System.out.println("----------");
        //---
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Jordi");
        trabajador1.setEdad(36);
        trabajador1.setTelefono(777);
        trabajador1.setSalario(999);
        System.out.println("Nombre: "+ trabajador1.getNombre());
        System.out.println("Edad: "+trabajador1.getEdad());
        System.out.println("Telefono: "+trabajador1.getTelefono());
        System.out.println("Credito: "+trabajador1.getSalario());

    }
}

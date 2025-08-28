package tp2;

public class testPersona {
    public static void main(String[] args) {

        Persona persona1, persona2;

        persona1 = new Persona("Franco", "Herrera", 42, 1234);

        persona2 = new Persona("Felipe", "Costa", 38, 1255);

        System.out.println(persona1.mayorDeEdad());
    }
}

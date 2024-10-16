public class Main {
    public static void main(String[] args) {
        
        Level easyLevel = new Level("fácil", "1");
        
        Exercise exercise10 = new Exercise("Ejercicio 10: dame patatas", "10", easyLevel);

        
        System.out.println("Antes del cambio:");
        System.out.println(exercise10.toString());

        
        System.out.println("Me he equivocado, el ejercicio 10 no es fácil, debería ser difícil.");

        
        Level difficultLevel = new Level("difícil", "2");
        exercise10.setLevel(difficultLevel);

        
        
        
        System.out.println("Después del cambio:");
        System.out.println(exercise10.toString());
    }
}

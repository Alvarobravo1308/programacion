
public class Main {
    public static void main(String[] args) {

        // Crear instancias de Category, Level, y Content
        Category category = new Category("futsal", "3");
        Level level = new Level("easy", "1");
        Content content = new Content("football", "1");

        // Imprimir las categorías, niveles y contenidos creados
        System.out.println("Categories");
        System.out.println(category.toString());

        System.out.println("Levels");
        System.out.println(level.toString());

        System.out.println("Contents");
        System.out.println(content.toString());

        // Crear la instancia de Exercise usando las variables existentes
        Exercise exercise = new Exercise("resistance", "4", "football", "futsal", level, content, category);

        // Imprimir el ejercicio creado
        System.out.println("Exercise (before change)");
        System.out.println(exercise.toString());

        // Cambiar el content y category
        Content newContent = new Content("basketball", "2");
        Category newCategory = new Category("outdoor", "5");
        
        exercise.setContent(newContent);
        exercise.setCategory(newCategory);

        // Imprimir el ejercicio nuevamente para ver los cambios
        System.out.println("Exercise (after change)");
        System.out.println(exercise.toString());
    }
}

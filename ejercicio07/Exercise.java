public class Exercise {
    private String title;
    private String idExercise;
    private Level level;  

    
    public Exercise(String title, String idExercise, Level level) {
        this.title = title;
        this.idExercise = idExercise;
        this.level = level;
    }

    
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

  
    public String toString() {
        return "Exercise{" +
                "title='" + title + '\'' +
                ", idExercise='" + idExercise + '\'' +
                ", level=" + level.toString() +
                '}';
    }
}

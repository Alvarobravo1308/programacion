public class Level {
    private String difficulty;
    private String idLevel;

    
    public Level(String difficulty, String idLevel) {
        this.difficulty = difficulty;
        this.idLevel = idLevel;
    }

    
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    /*public String getDifficulty(){
        return.this.difficulty
        }
     */

   @Override
    public String toString() {
        return "Level{" +
                "difficulty='" + difficulty + '\'' +
                ", idLevel='" + idLevel + '\'' +
                '}';
    }
}

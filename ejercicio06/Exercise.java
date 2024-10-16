public class Exercise {
  private String title;
  private String idExercise;
  private String sport;
  private String categoryName;
  private Level level;
  private Content content;
  private Category category;

  // Constructor
  public Exercise(String title, String idExercise, String sport, String categoryName, Level level, Content content, Category category) {
      this.title = title;
      this.idExercise = idExercise;
      this.sport = sport;
      this.categoryName = categoryName;
      this.level = level;
      this.content = content;
      this.category = category;
  }

  // Getters and Setters
  public void setContent(Content content) {
      this.content = content;
  }

  public void setCategory(Category category) {
      this.category = category;
  }

  @Override
  public String toString() {
      return "{" +
              "title='" + title + '\'' +
              ", idExercise='" + idExercise + '\'' +
              ", sport='" + sport + '\'' +
              ", categoryName='" + categoryName + '\'' +
              ", level=" + level +
              ", content=" + content +
              ", category=" + category +
              '}';
  }
}

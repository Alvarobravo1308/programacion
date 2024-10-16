public class Category {
    private String Type;
    private String Id_cat;


    public Category( String Type, String Id_cat){
      this.Type=Type;
      this.Id_cat=Id_cat;
      
    }
    public String toString() {
      return "{" +
              "Type='" + Type + '\'' +
              ", Id_cat='" + Id_cat + '\'' +
              '}';
  }
}

  
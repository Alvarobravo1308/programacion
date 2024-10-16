class Level {
    private String Type;
    private String Id_level;

    public Level( String Type, String Id_level){
      this.Type=Type;
      this.Id_level=Id_level;
      
    }
    public String toString() {
      return "{" +
              "Type='" + Type + '\'' +
              ", Id_level='" + Id_level + '\'' +
              '}';
  }
}

  
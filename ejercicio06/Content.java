class Content {
    private String Type;
    private String Id_cont;

    public Content( String Type, String Id_cont){
      this.Type=Type;
      this.Id_cont=Id_cont;
      
    }
    public String toString() {
      return "{" +
              "Type='" + Type + '\'' +
              ", Id_cat='" + Id_cont + '\'' +
              '}';
  }
}
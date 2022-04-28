public class Coordenada {
  private Double x, y, magnitud;
  public Coordenada(Double x, Double y) {
      this.x = x;
      this.y = y;
      this.magnitud = Math.sqrt((x * x) + (y * y));
  }
  public Coordenada() {
      
  }
  public void setCoordenadas(double x, double y) {
      this.x = x;
      this.y = y;
  }
  //Metodo getter de x
  public Double abcisa( ) { return x; }

  //Metodo getter de y
  public Double ordenada( ) { return y; }
  public Double magnitud( ) { return magnitud; }
  
  //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )
  @Override
  public String toString( ) {
      return "[" + x + "," + y + "]";
  }
}
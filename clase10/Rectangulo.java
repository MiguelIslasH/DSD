public class PruebaRectangulo {
    
  public static void main(String[] args) {
      long time1 = System.currentTimeMillis();
      PoligonoIrreg poligonoIrreg = new PoligonoIrreg();
      for (int i = 0; i < 100000; i++) {
          Coordenada coord = new Coordenada();
          coord.setCoordenadas(Math.random() * 100, Math.random() * 100 );
          poligonoIrreg.anadeVertice(coord);   
      }
      long time2 = System.currentTimeMillis();
      System.out.println(poligonoIrreg);
      System.out.println((time2 - time1) + " Milisegundos");
  }
}
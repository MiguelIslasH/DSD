public class PruebaRectangulo {
  public static Double generatRandomPositiveNegitiveValue(Double max , Double min) {
  //Random rand = new Random();
      return (Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
  }
  
  public static void main(String[] args) {

      long time1 = System.currentTimeMillis();
      PoligonoIrreg poligonoIrreg = new PoligonoIrreg();
      Coordenada coord;
      for (int i = 0; i < 10; i++) {
          coord = new Coordenada(generatRandomPositiveNegitiveValue(100.00, -100.00), generatRandomPositiveNegitiveValue(100.00, -100.00));
          poligonoIrreg.anadeVertice(coord);   
      }
      long time2 = System.currentTimeMillis();
      System.out.println(poligonoIrreg.toString());
      poligonoIrreg.ordenaVertices();
      System.out.println(poligonoIrreg.toString());
      System.out.println((time2 - time1) + " Milisegundos");
  }
}
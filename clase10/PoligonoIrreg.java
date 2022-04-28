import java.util.*;

class PoligonoIrreg {
  private List<Coordenada> vertices;
  private String poligIrregToString;
  private int noVertices;
  public PoligonoIrreg() {
    this.poligIrregToString = "";
    this.vertices = new ArrayList<Coordenada>();
    this.noVertices = 1;
  }
  public void anadeVertice(Coordenada vertice) {
    this.vertices.add(vertice);
  }
  public void ordenaVertices() {
    Comparator<Coordenada> compareById = (Coordenada o1, Coordenada o2) -> o1.magnitud().compareTo(o2.magnitud());
    Collections.sort(vertices, compareById);
  }
  @Override
  public String toString() {
    this.poligIrregToString = "";
    for (Coordenada coordenada : vertices) {
      this.poligIrregToString += "Vertice " + noVertices + "(" + coordenada.abcisa() + ", " + coordenada.ordenada() 
          + ") "+ " Magnitud: " + coordenada.magnitud() + "\n";
      this.noVertices += 1;
    }
    return this.poligIrregToString;
    }
}
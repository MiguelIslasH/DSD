import java.util.ArrayList;
import java.util.List;

public class Triangulo {
  List<Coordenada> vertices;
  
  Triangulo(Coordenada vertice1, Coordenada vertice2, Coordenada vertice3) {
    vertices = new ArrayList<Coordenada>();
    vertices.add(vertice1);
    vertices.add(vertice2);
    vertices.add(vertice3);
  }

  double getPerimetro() {
    return vertices.get(0).distancia(vertices.get(1)) + 
           vertices.get(1).distancia(vertices.get(2)) + 
           vertices.get(2).distancia(vertices.get(0));
  }

  @Override
  public String toString() {
    return "Triangulo: \nVertice 1: " + vertices.get(0).toString() + "\nVertice 2: "+ vertices.get(1).toString() + "\nVertice 3: " + vertices.get(2).toString();
  }

}

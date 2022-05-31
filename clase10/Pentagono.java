import java.util.*;

public class Pentagono {
    List<Coordenada> vertices;
    
    Pentagono(Coordenada vertice1, Coordenada vertice2, Coordenada vertice3, Coordenada vertice4, Coordenada vertice5) {
      vertices = new ArrayList<Coordenada>();
      vertices.add(vertice1);
      vertices.add(vertice2);
      vertices.add(vertice3);
      vertices.add(vertice4);
      vertices.add(vertice5);
    }
  
    double getPerimetro() {
      return vertices.get(0).distancia(vertices.get(1)) + 
             vertices.get(1).distancia(vertices.get(2)) + 
             vertices.get(2).distancia(vertices.get(3)) +
             vertices.get(3).distancia(vertices.get(4)) +
             vertices.get(4).distancia(vertices.get(5)) +
             vertices.get(5).distancia(vertices.get(0));
    }
  
    @Override
    public String toString() {
      return "Pentagono: \nVertice 1: " + vertices.get(0).toString() 
      + "\nVertice 2: "+ vertices.get(1).toString() 
      + "\nVertice 3: " + vertices.get(2).toString()
      + "\nVertice 4: " + vertices.get(3).toString()
      + "\nVertice 5: " + vertices.get(4).toString();
    }
  
  }
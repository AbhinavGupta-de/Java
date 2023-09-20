package graphs;

import java.util.List;

public class BasicGraphs {

 public static int degree(int vertex, List<Integer> vertices, List<List<Integer>> edges) {
  int degree = 0;
  for (int i = 0; i < edges.size(); i++) {
   if (edges.get(i).contains(vertex)) {
    degree++;
   }
   if (edges.get(i).get(0) == vertex && edges.get(i).get(1) == vertex) {
    degree++;
   }
  }
  return degree;
 }

 public static boolean isConnected(int vertex1, int vertex2, List<List<Integer>> adjacency) {
  for (int i = 0; i < adjacency.size(); i++) {
   if (adjacency.get(i).contains(vertex1) && adjacency.get(i).contains(vertex2)) {
    return true;
   }
  }
  return false;
 }

 public static void main(String[] args) {
  List<List<Integer>> edges = List.of(List.of(1, 2), List.of(2, 2), List.of(3, 4), List.of(4, 5), List.of(5, 6),
    List.of(6, 7), List.of(7, 8), List.of(8, 9), List.of(9, 1), List.of(1, 3), List.of(3, 5), List.of(5, 7),
    List.of(7, 9), List.of(9, 2), List.of(2, 4), List.of(4, 6), List.of(6, 8), List.of(8, 1));
  if (isConnected(2, 2, edges))
   System.out.println("True!!");
  else
   System.out.println("False!!");
 }

}

import java.util.*;
import java.io.*;
import javafx.util.Pair;

public class Solution {
  public static void main(String[] args) {
    //// Vector ////
    // v.add(alvue);
    // v.set(index, value);
    // v.remove(index);

    Vector<Integer> v = new Vector<Integer>();
    Write.println("\n\nVector");
    v.add(1); // add at the end
    v.add(3);
    v.add(8);
    v.add(6);
    v.add(5);
    v.add(8);
    v.set(1, 5); // changing value at index 1
    v.remove(v.size() - 1); // remove from the end
    for (int i = 0; i < v.size(); i++) {
      Write.print(v.get(i));
    }

    Write.println("\n\nPair");
    Pair p1 = new Pair(3, 7);
    Write.print(p1.first);
    Write.println(p1.second);
    Pair p2 = new Pair(3, 'c');
    Write.print(p2.first);
    Write.println(p2.second);
    Pair p3 = new Pair("abcd", 'e');
    Write.print(p3.first);
    Write.println(p3.second);

    //// Set ////
    Set<Integer> s = new TreeSet<Integer>();
    s.add(5);
    s.add(5);
    s.add(3);
    s.add(4);
    s.add(5);
    s.add(2);
    s.add(6);
    Write.println(s);
    Set<String> hash_Set = new HashSet<String>();
    // elements are arranged according to the hash value
    hash_Set.add("Geeks");
    hash_Set.add("For");
    hash_Set.add("Geeks");
    hash_Set.add("Example");
    hash_Set.add("Set");
    System.out.println(hash_Set);

    Set<String> tree_set = new TreeSet<String>();
    // elements are arranged in sorted order
    tree_set.add("Geeks");
    tree_set.add("For");
    tree_set.add("Geeks");
    tree_set.add("Example");
    tree_set.add("Set");
    System.out.println(tree_set);

  }

  //// Pair ////
  static class Pair<T1, T2> {
    T1 first;
    T2 second;

    Pair(T1 f, T2 s) {
      first = f;
      second = s;
    }
  }

  // Comparator for sort
  static class comp implements Comparator<myPair> {
    public int compare(myPair p1, myPair p2) {
      return (p1.first - p2.first);
    }
  }

  // Reading Input
  static class Read {
    static Scanner scan = new Scanner(System.in);

    static int Int() {
      return scan.nextInt();
    }

    static long Long() {
      return scan.nextLong();
    }

    static double Double() {
      return scan.nextDouble();
    }

    static String Str() {
      return scan.next();
    }
  }

  // Writing Output
  static class Write {
    static void print(Object obj) {
      System.out.printf("%s,  ", obj);
    }

    static void print(char str[]) {
      System.out.printf("%s,  ", str);
    }

    static void println(Object obj) {
      System.out.printf("%s\n", obj);
    }

    static void println(char str[]) {
      System.out.printf("%s\n", str);
    }
  }
}

/**
 * vector pair map set stack queue deque
 */

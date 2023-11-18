import java.lang.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Stack<Integer> A = new Stack<Integer>();
    Stack<Integer> B = new Stack<Integer>();
    Stack<Integer> C = new Stack<Integer>();

    A.push(3);
    A.push(2);
    A.push(1);

    System.out.println("Start of game");
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();
    int index = 0;
    boolean completed = false;

    Scanner scanner = new Scanner(System.in);

    while (!completed) {
      System.out.println(++index + ": Next move (from - to)");

      String input = scanner.nextLine();

      String[] parts = input.split(" ");

      String from;
      String to;

      if (parts.length == 2) {
        from = new String(parts[0]);
        to = new String(parts[1]);
      } else if (parts.length == 3) {
        from = new String(parts[0]);
        to = new String(parts[2]);
      } else {
        System.out.println("Bad input!");
        index -= 1;
        continue;
      }

      if ((!isStackname(from)) || (!isStackname(to))) {
        System.out.println("Bad input! Values");
        index -= 1;
        continue;
      }

      if (from.equals(to)) {
        System.out.println("Cannot move to the same place");
        index -= 1;
        continue;
      }

      if (from.toLowerCase().equals("a")) {
        if (A.isEmpty()) {
          System.out.println("A is empty!");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("b") && (B.isEmpty() || (A.peek() < B.peek()))
        ) {
          B.push(A.pop());
        } else if (to.toLowerCase().equals("b")) {
          System.out.println("Cannot move A  to B");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("c") && (C.isEmpty() || (A.peek() < C.peek()))
        ) {
          C.push(A.pop());
        } else if (to.toLowerCase().equals("c")) {
          System.out.println("Cannot move  A to C");
          index -= 1;
          continue;
        }
      }

      if (from.toLowerCase().equals("b")) {
        if (B.isEmpty()) {
          System.out.println("B is empty!");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("a") && (A.isEmpty() || (B.peek() < A.peek()))
        ) {
          A.push(B.pop());
        } else if (to.toLowerCase().equals("a")) {
          System.out.println("Cannot move B to A");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("c") && (C.isEmpty() || (B.peek() < C.peek()))
        ) {
          C.push(B.pop());
        } else if (to.toLowerCase().equals("c")) {
          System.out.println("Cannot move B to C");
          index -= 1;
          continue;
        }
      }

      if (from.toLowerCase().equals("c")) {
        if (C.isEmpty()) {
          System.out.println("C is empty!");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("a") && (A.isEmpty() || (C.peek() < A.peek()))
        ) {
          A.push(C.pop());
        } else if (to.toLowerCase().equals("a")) {
          System.out.println("Cannot move C to A");
          index -= 1;
          continue;
        }

        if (
          to.toLowerCase().equals("b") && (B.isEmpty() || (C.peek() < B.peek()))
        ) {
          B.push(C.pop());
        } else if (to.toLowerCase().equals("b")) {
          System.out.println("Cannot move C to B");
          index -= 1;
          continue;
        }
      }

      A.print("A");
      B.print("B");
      C.print("C");
      System.out.println();

      if (A.isEmpty() && B.isEmpty() && !C.isEmpty()) {
        completed = true;
      }
    }

    System.out.println("End of game");
    /*
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    int value = A.pop();
    C.push(value);

    System.out.println(2);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = A.pop();
    B.push(value);

    System.out.println(3);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = C.pop();
    B.push(value);

    System.out.println(4);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = A.pop();
    C.push(value);

    System.out.println(5);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = B.pop();
    A.push(value);

    System.out.println(6);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = B.pop();
    C.push(value);

    System.out.println(7);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();

    value = A.pop();
    C.push(value);

    System.out.println(8);
    A.print("A");
    B.print("B");
    C.print("C");
    System.out.println();*/
  }

  private static boolean isStackname(String name) {
    return (
      name.equals("A") ||
      name.equals("B") ||
      name.equals("C") ||
      name.equals("a") ||
      name.equals("b") ||
      name.equals("c")
    );
  }
}

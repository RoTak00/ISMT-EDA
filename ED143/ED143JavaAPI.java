import java.util.Scanner;
import java.util.LinkedList;

class Account {
    double balance;               // O saldo da conta
    LinkedList<Double> movements; // Os movimentos

    Account() {
	balance = 0;
	movements = new LinkedList<Double>();
    }	
}

class LibAccount {
    public static void deposit(Account a, double m) {
	a.balance += m;
	a.movements.addLast(m);
    }

    public static void withdraw(Account a, double m) {
	a.balance -= m;
	a.movements.addLast(-m);
    }

    public static void movements(Account a) {
      double sum = 0;
      int  nmovs = a.movements.size();
      System.out.printf("Saldo: %.2f\n", a.balance);
      System.out.printf("Numeros de movimentos: %d\n", nmovs);
      for (double x: a.movements) {
	  System.out.printf("%.2f -> %.2f\n", x, sum + x);
      }

    }
    
}

class ED143JavaAPI {
    public static void main(String[] args) {
	
	Account a = new Account();
	
	Scanner in = new Scanner(System.in);	
	int n = in.nextInt();
	for (int i=0; i<n; i++) {
	    String op = in.next();
	    if (op.equals("depositar"))     LibAccount.deposit(a, in.nextDouble());
	    else if (op.equals("levantar")) LibAccount.withdraw(a, in.nextDouble());
	}
	LibAccount.movements(a);
    }
}

import java.util.Scanner;

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
	LibLinkedList.addLast(a.movements, m);
    }

    public static void withdraw(Account a, double m) {
	a.balance -= m;
	LibLinkedList.addLast(a.movements, -m);
    }

    public static void movements(Account a) {
      double sum = 0;
      int  nmovs = LibLinkedList.size(a.movements);
      System.out.printf("Saldo: %.2f\n", a.balance);
      System.out.printf("Numeros de movimentos: %d\n", nmovs);
      for (int i = 0; i < nmovs; i++) {
	  double x = LibLinkedList.get(a.movements,i);
	  System.out.printf("%.2f -> %.2f\n", x, sum + x);
      }

    }
    
}

class ED143 {
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

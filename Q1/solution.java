import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number N (1 ≤ N ≤ 1000), the total number of T-shirts in shop.");
        int n = scanner.nextInt(); //The first line contains a number N (1 ≤ N ≤ 1000), the total number of T-shirts in shop.

        System.out.println("Enter N strings representing the T-shirt sizes in shop.");
        String[] sizesinshop = new String[n];
        for(int i=0; i<n; i++) {
            sizesinshop[i] = scanner.next(); //The second line contains N strings representing the T-shirt sizes in shop.
        }

        System.out.println("Enter a number M (1 ≤ M ≤ N), the total number of requests");
        int m = scanner.nextInt(); // The third line contains a number M (1 ≤ M ≤ N), the total number of requests.

        System.out.println("Enter M strings representing the requested sizes");
        String[] requestedsizes = new String[m];
        for(int i=0; i<m; i++) {
            requestedsizes[i] = scanner.next(); //The forth line contains M strings representing the requested sizes.
        }

        Arrays.sort(sizesinshop); // sort the sizes in shop
        Arrays.sort(requestedsizes); // sort the requested size

        int i = 0, y = 0;
        while(i < n && y < m) { // while have the remaining checking then do
            if(sizesinshop[i].compareTo(requestedsizes[y]) >= 0) {
                y++;
            }
            i++;
        }

        if(y == m) { // checked all
            System.out.println("Yes");
        } else {
            System.out.println("No");
            System.exit(1);
        }
    }
}
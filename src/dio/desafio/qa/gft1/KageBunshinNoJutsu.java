package dio.desafio.qa.gft1;

import java.util.Scanner;

public class KageBunshinNoJutsu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            System.out.println((int) (Math.log(N) / Math.log(2)));
        }
        sc.close();
    }
}

package avs.practice.algorithms;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List items = new ArrayList<>();
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        items.add(a);
        items.add(a1);
        items.add(a2);
        int alice = 0;
        int bob = 0;
        if (items != null && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {

                int b = scanner.nextInt();
                int al = (Integer) items.get(i);

                if (al > b) {
                    alice++;
                } else if (al < b) {
                    bob++;
                }

            }

            System.out.println(alice + " " + bob);
        }
    }
}

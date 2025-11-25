public class Kolokwium1 {
    public static void main(String[] args) {
        IO.println("Witam, ten program generuje hasło, które będzie zawarało minimum 1 literę dużą,\n1 małą, znak specjalny od ! do +, a także numer od 0 do 9.");
        IO.println();
        IO.println("Maksymalna długość hasła = 200 znaków.");
        char[] tab = new char[200];
        IO.println();

        IO.println("Wprowadź z ilu znaków chcesz mieć hasło.");
        IO.println();


        java.util.Scanner sc = new java.util.Scanner(System.in);
        int passwordMax = sc.nextInt();

        IO.println("Dziekuę, twoje hasło jest stworzone, za chwile program sprawdzi\n czy hasło odpowiada wszystkim warunkom.");
        while (true) {
            for (int i = 0; i < passwordMax; i++) {
                tab[i] = (char) (int) ('!' + (Math.random() * ('z' - '!' + 1)));
                IO.print(tab[i] + ", ");
            }
            IO.println();
            boolean litDuza = false;
            boolean litMala = false;
            boolean nr = false;
            boolean znakSpec = false;

            for (int i = 0; i < passwordMax; i++) {
                if (tab[i] >= 'A' && tab[i] <= 'Z') {
                    litDuza = true;
                } else if (tab[i] >= 'a' && tab[i] <= 'z') {
                    litMala = true;
                } else if (tab[i] >= '0' && tab[i] <= '9') {
                    nr = true;
                } else if (tab[i] >= '!' && tab[i] <= '+') {
                    znakSpec = true;
                }
            }
            if ((litDuza && litMala && nr && znakSpec) == true) {
                IO.println("Hasło spełnia warunki");
                IO.println();
                IO.print("Hasło:\n");
                for (int i = 0; i < passwordMax; i++) {
                    tab[i] = (char) (int) ('!' + (Math.random() * ('z' - '!' + 1)));

                    IO.print(tab[i] + ", ");
                }
                break;
            } else {
                //algorytm programu nie przewiduje,żeby ten warunek się spełnił
                IO.println("Hasło nie spełnia warunków, prosze spróbować jeszcze raz");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int wynik = sumaDoN(n);
        System.out.println("Suma liczb od 1 do " + n + " to: " + wynik);
    }

    public static int sumaDoN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}

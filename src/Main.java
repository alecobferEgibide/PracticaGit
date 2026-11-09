public class Main {

    public static boolean esPrimo(int n) {
        boolean retorno;
        int i;

        if (n <= 1) {
            retorno = false;
        } else {
            retorno = true;
            i = 2;
            while (i * i <= n && retorno) {
                if (n % i == 0) {
                    retorno = false;
                }
                i++;
            }
        }

        return retorno;
    }

    public static void main(String[] args) {

    }
}
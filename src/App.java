public class App {
    public static void main(String[] args) throws Exception {
        int[] main = new int[20];

        System.out.println("Array original:");

        for (int i = 0; i < main.length; i++) {
            main[i] = (int)(Math.random()*101);
            System.out.print(main[i] + " ");
        }

        System.out.println();
        System.out.println("Array con los pares al principio:");

        int[] end = new int[20];
        int contador = 0;

        for (int i = 0; i < end.length; i++) {
            if (main[i]%2==0) {
                end[contador] = main[i];
                contador++;
            }
        }

        for (int i = 0; i < main.length; i++) {
            if (main[i]%2!=0) {
                end[contador] = main[i];
                contador++;
            }
        }

        for (int i = 0; i < end.length; i++) {
            System.out.print(end[i] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        //( Math.random() * (b-a) ) + a

        int a = 0; // Начальное значение диапазона - "от"
        int b = 1000; // Конечное значение диапазона - "до"
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.println(" " + random_number1);
        }

        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }
    }
}

public class HomeWork_lesson_01 {
    public static void main(String[] args) {

        // Завдання 1
        byte myByteNumber = 117;
        short myShortNumber = 6546;
        int myIntNumber = 95655644;
        long myLongNumber = 654654321654651L;
        float myFloatNumber = 8.9965f;
        double myDoubleNumber = 8.9968413;
        char myLetter = 'A';
        boolean myBoolean = true;

        // Завдання 2
        System.out.println("byte = " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short = " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int = " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long = " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float = " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double = " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("char = " + Character.MIN_VALUE + " до " + Character.MAX_VALUE);
        System.out.println("");

        // Завдання 3
        int[] mas = new int[10];
        System.out.print("Масив випадкових чисел: ");
        for(int i=0; i<mas.length;) {
            mas[i] = (int) (Math.random() * 300 + 10);
            System.out.print(mas[i] + ", ");
            i++;
        }

        System.out.println("");

        int max = 0;

        for(int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }

        int min = mas[0] + 1;

        for(int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }

        System.out.println("Найбільше число масиву - " + max);
        System.out.println("Найменше число масиву - " + min);
    }
}

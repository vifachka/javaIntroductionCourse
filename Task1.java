public class Task1 {

    public static void main(String[] args){
        System.out.println("---- Задание 1 ----");
        Task1(12,23,45);  //  вывод результата выполнения задания 1 с неравными числами
        Task1(5,5,5);     //  вывод результата выполнения задания 1 с равными числами
        Task2(1234.9876f);
        System.out.println("---- Задание 3 ----");
        Task3(3, 5);
        Task3(5, 3);
        System.out.println("---- Задание 4 ----");
        Task4(1234);
        Task4(6578);
        Task4(678);
        Task4(1234567);
        Task4(126578);
        Task4(1265);
        System.out.println("---- Задание 5 ----");
        Task5(1234567);
        Task5(8888);
        Task5(126578);
        System.out.println("---- Задание 6 ----");
        Task6(1234);
        Task6(12345678);
        Task6(1234567);
        Task7(45, 78);
    }

    /*  задание 1 */
    public static void Task1 (int a, int b, int c){
        String Mess = ((a == b) && (b == c)) ? "равны" : "неравны";
        System.out.println("Числа a = " + a + ", b = " + b + ", c = " + c + " " + Mess + ".");
    }

    /*  задание 2 */
    public static void Task2 (float DinoMass) {
        System.out.println("---- Задание 2 ----");
        System.out.println("Масса динозавра = " + DinoMass + ", что составляет:");
        System.out.println((int) (DinoMass / 1000) + " т, " + (int) DinoMass + " кг, "
                + (long) (DinoMass * 1_000_000) + " мг");
    }

    public static double CircleSquare (float R){
        return (double) (Math.PI * R * R);
    }
    /*  задание 3 */
    public static void Task3 (float R1, float R2) {
        if (R1 < R2){
            System.out.print  ("Неверно введены значения: радиус R1 = " + R1 + " должен быть больше R2 = " + R1);
            System.out.println(". Значение площади кольца не будет рассчитано.");
            return;
        }
        double Result = CircleSquare(R1) - CircleSquare(R2);
        System.out.print  ("Площадь кольца, внешний радиус которого равен " + R1);
        System.out.println(", а внутренний радиус равен " + R2 + ", равна " + Result);
    }

    /*  задание 4 */
    public static void Task4(int Number) {
        int[] ArrOfNumbers = new int[4];
        int SavedNumber = Number;
        for (int i = 3; i >= 0; i--){
            ArrOfNumbers[i] = Number % 10;
            if (Number < 1) {
                System.out.println("Введенное число " + SavedNumber + " некорректно, дальнейшая работа невозможна.");
                return;
            }
            Number /= 10;
        }
        if (Number >= 1) {
            System.out.println("Введенное число " + SavedNumber
                             + " некорректно, оно будет обрезано до 4 младших разрядов.");
            SavedNumber %= 10000;
        }

        String Mess = "";
        for (int i = 0; i < 3; i++)
            if (ArrOfNumbers[i] > ArrOfNumbers[i + 1]) {
                Mess = " не";
                break;
            }
        System.out.println("Цифры числа " + SavedNumber +  Mess + " идут в порядке возрастания");
    }

    /*  задание 5 */
    public static void Task5(int Number) {
        int[] ArrOfNumbers = new int[6];
        int SavedNumber = Number;
        float  ArithmeticMean = 0;
        double GeometricMean  = 1;

        for (int i = 5; i >= 0; i--){
            ArrOfNumbers[i] = Number % 10;
            if (Number < 1) {
                System.out.println("Введенное число " + SavedNumber + " некорректно, дальнейшая работа невозможна.");
                return;
            }
            Number /= 10;
            ArithmeticMean += ArrOfNumbers[i];
            GeometricMean  *= ArrOfNumbers[i];
        }
        if (Number >= 1) {
            System.out.print  ("Введенное число " + SavedNumber);
            System.out.println(" некорректно, оно будет обрезано до 6 младших разрядов:");
            SavedNumber %= 1000000;
        }
        ArithmeticMean  = ArithmeticMean / 6;
        GeometricMean   = Math.pow(GeometricMean, -6);
        System.out.print  ("Для " + SavedNumber + " среднее арифметическое =" + ArithmeticMean);
        System.out.println(", среднее геометрическое = " + GeometricMean);
    }

    /*  задание 6 */
    public static void Task6(int Number) {
        int[] ArrOfNumbers = new int[7];
        int SavedNumber = Number;
        int NewNumber   = 0;
        for (int i = 6; i >= 0; i--){
            ArrOfNumbers[i] = Number % 10;
            if (Number < 1) {
                System.out.println("Введенное число " + SavedNumber + " некорректно, преобразование осуществлено не будет.");
                return;
            }
            Number /= 10;
            NewNumber += ArrOfNumbers[i] * Math.pow(10, i);
        }
        if (Number >= 1) {
            System.out.println("Введенное число " + SavedNumber
                    + " некорректно, будет обрезано до 7 младших разрядов.");
            SavedNumber %= 10000000;
        }
        System.out.println("Число " + SavedNumber +  " реверсировано в " + NewNumber);
    }

    /*  задание 7 */
    public static void Task7(int a, int b) {
        System.out.println("---- Задание 7 ----");
        System.out.println("входящие значения : a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("исходящие значения: a = " + a + " b = " + b);
    }
}

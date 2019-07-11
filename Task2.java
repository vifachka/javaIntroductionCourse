import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Task2_1(-150);          // сначала неправильный аргумент
        Task2_1(1000);
        Task2_1(10);

        System.out.println("");
        Task2_2_1(-194564370);  // сначала неправильный аргумент
        Task2_2_1(194564370);

        System.out.println("");
        Task2_2_2(-12345678);   // сначала неправильный аргумент
        Task2_2_2(12345678);    // НЕ палиндром
        Task2_2_2(123454321);   // палиндром с нечетным количеством цифр
        Task2_2_2(123321);      // палиндром с четным количеством цифр

        System.out.println("");
        Task2_2_3(-17);         // сначала неправильный аргумент
        Task2_2_3(12234);       // не простое
        Task2_2_3(17);          // простое

        System.out.println("");
        Task2_2_4(360);
        Task2_2_4(3);
        Task2_2_5(66,55);

        Task2_2_7(1223334444909L);

    }

    // Is the number natural?
    public static boolean IsNatural(long Number){
        if (Number < 0) {
            System.out.println("Number " + Number + " is not natural, exit task.");
            return false;
        }
        else return true;
    }

    // Is the number Positive?
    public static boolean IsPositive(long Number){
        if (Number <= 0) {
            System.out.println("Number " + Number + " is not positive, exit task.");
            return false;
        }
        else return true;
    }

    // 2.1. Heads or Tails?
    public static void Task2_1(int quantity){
        System.out.print("2.1. ");
        if (!IsPositive(quantity))
            return;

        int Heads = 0;
        int Tails = 0;
        Random RandomNum = new Random();
        for (int i = 0; i < quantity; i++) {
            if (RandomNum.nextInt(2) == 0) {
                ++Heads;
                continue;
            }
            ++Tails;
        }
        System.out.println("Statistics: Heads = " + Heads + ", Tails = " + Tails + " out of " + quantity + ".");
    }

    // 2.2.1. To find max numeral of the natural Number (0 including)
    public static void Task2_2_1(long Number) {
        System.out.print("2.2.1. ");
        if (!IsNatural(Number))
            return;

        int MaxNumeral = 0;
        int Numeral = 0;
        long SavedNumber = Number;
        do {
            Numeral = (int) Number % 10;
            if (MaxNumeral < Numeral)
                MaxNumeral = Numeral;
            Number /= 10;
        }
        while (Number > 1);
        System.out.println("Number " + SavedNumber + ": the max numeral is " + MaxNumeral);
    }

    // 2_2.2. Is the number palindrome
    public static void Task2_2_2(long Number) {
        System.out.print("2.2.2. ");
        if (!IsNatural(Number))
            return;

        int n = 0;  // количество разрядов в числе Number
        int Numeral      = 0;
        long NewNumber   = 0;
        long SavedNumber = Number;
        String Mess      = " not";
        do {
            Numeral = (int) (Number % 10);
//            NewNumber += Numeral * Math.pow(10, n);
            NewNumber = NewNumber * 10 + Numeral;
            Number /= 10;
            if ((NewNumber == Number) || (NewNumber == Number / 10)){
                Mess = "";
                break;
            }
            n++;
        }
        while (Number >= 1);
        System.out.println("Number " + SavedNumber + " is" + Mess + " a palindrome.");
    }

    // 2_2.3. Is the number simple
    public static void Task2_2_3(long Number) {
        System.out.print("2.2.3. ");
        if (!IsNatural(Number))
            return;

        String Mess = "";
        long Half   = Number / 2;
        if (Number > 2)
            for(int i = 3; i <= Half; i++){
                if ((Number % i) == 0){
                    Mess = " not";
                    break;
                }
            }
        System.out.println("Number " + Number + " is" + Mess + " simple.");
    }

    public static boolean IsSimple(long Number){
        boolean IsSimple = true;
        long Half = Number / 2;
        if (Number > 2)
            for(int i = 3; i <= Half; i++){
                if ((Number % i) == 0){
                    IsSimple = false;
                    break;
                }
            }
        return IsSimple;
    }

    // 2_2.4. Find all simple dividers of the number
    public static void Task2_2_4(long Number) {
        System.out.print("2.2.4. ");
        if (!IsNatural(Number))
            return;

        long Half = Number / 2;
        for(int i = 1; i <= Half; i++) {
            if ((Number % i) == 0) {
                if (IsSimple(i))
                    System.out.print(" " + i);
            }
        }
        if (IsSimple(Number))
            System.out.print(" " + Number);
        System.out.println("");
    }

    // 2_2.5_6. Find НОК and НОД as russians say
    public static void Task2_2_5(int a, int b) {
        System.out.print("2.2.5. ");
        if (!IsNatural(a))
            return;
        if (!IsNatural(b))
            return;

        int SavedA = a;
        int SavedB = b;
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("НОД(" + SavedA + ", " + SavedB + ") = " + b);
        System.out.println("2.2.6. НОK(" + SavedA + ", " + SavedB + ") = " + b * (SavedA / b) * (SavedB / b));
    }

    public static void PrintNum(int Ind, int Num){
        if (Num > 0)
            System.out.println( " numeral " + Ind + ": " + Num + " times");
    }
    // 2_2.5_7. Find НОК and НОД as russians say
    public static void Task2_2_7(long Number) {
        System.out.print("2.2.7. ");
        if (!IsNatural(Number))
            return;

        int a0 = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        int a8 = 0;
        int a9 = 0;
        int Numeral = 0;
        long SavedNumber = Number;

        do {
            Numeral = (int) (Number % 10);
            switch (Numeral){
                case 0: a0++; break;
                case 1: a1++; break;
                case 2: a2++; break;
                case 3: a3++; break;
                case 4: a4++; break;
                case 5: a5++; break;
                case 6: a6++; break;
                case 7: a7++; break;
                case 8: a8++; break;
                case 9: a9++; break;
            }
            Number /= 10;
        }
        while (Number >= 1);

        System.out.println(" Number " + SavedNumber + ":");
        PrintNum(0, a0);
        PrintNum(1, a1);
        PrintNum(2, a2);
        PrintNum(3, a3);
        PrintNum(4, a4);
        PrintNum(5, a5);
        PrintNum(6, a6);
        PrintNum(7, a7);
        PrintNum(8, a8);
        PrintNum(9, a9);
     }
} 

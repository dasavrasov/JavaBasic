import java.io.Console;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyProg {

    public static double fraction(double x){
        return x - (int)x;
    }

    public static int sumLastNums(int x){
        return x%10 + (x/10%10);
    }

    public static int charToNum(char x){
        return x - '0';
    }

    public static boolean isPositive(int x){
        return x > 0;
    }

    public static boolean is2digits(int x){
        return x > 9 && x < 100;
    }

    public static boolean isUpperCase(char x){
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num){
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    public static boolean isDivisor(int a, int b){
        return a % b == 0;
    }

    public static boolean isEqual(int a, int b, int c){
        return a == b && b == c;
    }

    public static int lastNumSum(int a, int b){
        return a%10 + b%10;
    }

    public static String day(int x){
        switch (x){
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
        }
        return "нет такого дня";
    }

    public static String listNums(int x){
        String res = "";
        for (int i=0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }

    public static int pow(int x, int y){
        int res = 1;
        for (int i=0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static String chet(int x){
        String res = "";
        for (int i=0; i <= x; i++) {
            if (i % 2 == 0) {
                res += i + " ";
            }
        }
        return res;
    }
    public static void printDays(String x){
        switch (x){
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
        }
    }
    public static int numLen(long x){
        int res = 0;
        while (x > 0) {
            x = x / 10;
            res++;
        }
        return res;
    }

    public static boolean equalNum(int x){
        boolean res = true;
        do {
            if (x % 10 != x / 10 % 10) {
                res = false;
            }
            x = x / 10;
        } while (x/10 > 0);
        return res;
    }

    public static void leftTriangle(int x){
        for (int i=0; i < x; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        while(true) {
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                break;
            }
        }
    }
    public static void rightTriangle(int x){
        for (int i=1; i <= x; i++) {
            for (int j=1; j <= x; j++) {
                if (j<=x-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void square(int x){
        for (int i=0; i < x; i++) {
            for (int j=0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    public static int findFirst(int[] arr, int x){
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public static int maxAbs(int[] arr){
        int max = Math.abs(arr[0]);
        int val = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                val = arr[i];
            }
        }
        return val;
    }

    public static boolean palindrom(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static int countPositive(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static int[] reverseBack(int[] arr){
        int [] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - 1 - i] = arr[i];
        }
        return res;
    }

    public static int findFirst(int[] arr, int x){
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] concat(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length + i] = arr2[i];
        }
        return res;
    }

    public static int[] findAll(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x) {
                res[j] = i;
                j++;
            }
        }
        return res;
    }

//    public static int[] add(int[] arr, int x, int pos){
//        int[] res = new int[arr.length + 1];
//        for (int i = 0; i < pos; i++) {
//            res[i] = arr[i];
//        }
//        res[pos] = x;
//        for (int i = pos + 1; i < res.length; i++) {
//            res[i] = arr[i - 1];
//        }
//        return res;
//    }
    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos + ins.length; i < res.length; i++) {
            res[i] = arr[i - ins.length];
        }
        return res;
    }

    public static int[] deleteNegative(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] res = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }

    public static boolean sum3(int x, int y, int z){
        return x + y == z || x + z == y || y + z == x;
    }

    public static boolean magic6(int x, int y){
        return x == 6 || y == 6 || x + y == 6 || y - x == 6 ||  x - y == 6;
    }

    public static String age(int x){
        switch (x %10) {
            case 1:
                return "год";
            case 2:
            case 3:
            case 4:
                if  (!(x %100 == 12 || x %100 == 13 || x %100 == 14)) {
                    return "лет";
                }
                return "года";
            default:
                return "лет";

        }
    }

    public static int abs(int x){
        return x > 0 ? x : -x;
    }

    public static int safeDiv(int x, int y){
        return y == 0 ? 0 : x / y;
    }

    public static int max(int x, int y){
        return x > y ? x : y;
    }
    public static String makeDecision(int x, int y){
        return x > y ? "x > y" : x < y ? "x < y" : "x = y";
    }

    public static int max3(int x, int y, int z){
        return max(max(x,y),z);
    }

public static int sum2(int x, int y){
    return x + y >=10 && x + y <= 19 ? 20 : x + y;
}

public static boolean is35(int x){
    if (x%3 == 0 && x%5 == 0) {
        return true;
    }
    return false;
}


        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int[] ins ={7,8,9};
            int[] arr2=add(arr, ins,3);
            System.out.println(Arrays.toString(arr2));
//            System.out.println(equalNum(1211));
//            System.out.println(listNums(5));
//            printDays("четверг");

//            int x, y;
//            x=5;
//            y=lastNumSum(x,11); //y=6
//            System.out.println(x+"+11 это " + y);  //5+11=6
//            x=lastNumSum(y,123);
//            System.out.println(y+"+123 это " + x);
//            y=lastNumSum(x,14);
//            System.out.println(x+"+14 это " + y);
//            x=lastNumSum(y,1);
//            System.out.println(y+"+1 это " + x);

//            System.out.println(charToNum('3'));
//            System.out.println(sumLastNums(4568));
//            System.out.println(fraction(5.3));
//            System.out.println(findFirst(arr,2));

//            ExecutorService executor = Executors.newFixedThreadPool(3);
//
//            // Submitting 3 tasks that return results
//            Future<String> futureResult1 = executor.submit(new CallableTask());
//            Future<String> futureResult2 = executor.submit(new CallableTask());
//            Future<String> futureResult3 = executor.submit(new CallableTask());
//
//            // Attempt to retrieve the results of the tasks
//            try {
//                String result1 = futureResult1.get();
//                String result2 = futureResult2.get();
//                String result3 = futureResult3.get();
//                System.out.println("Task 1 returned: " + result1);
//                System.out.println("Task 2 returned: " + result2);
//                System.out.println("Task 3 returned: " + result3);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            executor.shutdown();
        }

        static class CallableTask implements Callable<String> {
            @Override
            public String call() throws Exception {
                // Simulate a time-consuming computation
                Thread.sleep(2000);
                return "Task completed";
            }
        }
    }

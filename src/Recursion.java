import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("\n\nHello, Nodes!\n");
        Scanner kb = new Scanner(System.in);
        System.out.println("What number do you want to use?: ");
        int num = kb.nextInt();

        //Question1
        int fact = getFactoral(num);
        System.out.println("This is the factorial " + fact);

        //Question2
        int fib = getFibonacci(num);
        System.out.println("This is the fibonacci: " + fib);

        //Question3
        System.out.println("What name do you want to use?: ");
        String name = kb.next();
        System.out.println("How many times to print name?: ");
        int num2 = kb.nextInt();
        String end = getName(num2, name);
        System.out.println(end);

        //Question4
        Random ran = new Random();
        ArrayList<String> randomlist = new ArrayList<String>();
        randomlist.add("a");
        randomlist.add("b");
        randomlist.add("c");

        System.out.println("This is the list " + randomlist);
        int finalSize = getSize(randomlist);
        System.out.println("This is the size of your list: " + finalSize);

        //Question5
        System.out.println("What is your first number: ");
        int a = kb.nextInt();
        System.out.println("What is your second number: ");
        int b = kb.nextInt();

        int sum = getSum(a, b);
        System.out.println("This is the sum: " + sum);

        //Question6
        System.out.println("What is your first number: ");
        double base = kb.nextDouble();
        System.out.println("What is your second number: ");
        double power = kb.nextDouble();

        double product = getExponential(base, power);
        System.out.println("This is the product: " + product);

        //Question 7
        String example = "dbbacca";
        char ch = 'a';

        int occurance = getChar(example, ch);
        System.out.println(occurance);

        //Question 8
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("This is your original list: " + list);

        ArrayList<String> reverse = reverseArrayList(list);
        System.out.println("This is your reverse: " + reverse);

        //Question 9
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        System.out.println("This is the list: " + list2);

        boolean answer = isPalindrome(list2);
        System.out.println(answer);

        //Question 12
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(4);
        list3.add(3);
        list3.add(26);
        list3.add(5);
        System.out.println("This is the list: " + list3);

        int evens = even(list3);
        System.out.println(evens);




    }

    private static int getFactoral(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * getFactoral(num - 1);
        }
    }

    private static int getFibonacci(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return getFibonacci(num - 1) + getFibonacci(num - 2);
        }
    }

    private static String getName(int num2, String name) {
        if (num2 == 1) {
            return name;
        } else {
            return name + getName(num2 - 1, name);
        }
    }

    private static int getSize(ArrayList<String> randomlist) {
        if (randomlist.isEmpty()) {
            return 0;
        } else {
            randomlist.remove(0);
            return 1 + getSize(randomlist);
        }
    }

    private static int getSum(int a, int b) {
        if (b <= 1) {
            return 1;
        } else {
            return a + getSum(a, b - 1);
        }
    }

    private static double getExponential(double base, double power) {
        if (power < 1)
            return 1;
        else
            return base * getExponential(base, power - 1);
    }

    private static int getChar(String example, char ch) {
        int count = 0;
        if (example.isEmpty()) {
            return 0;
        } else if (example.charAt(example.length()-1) == ch) {
            count++;
           example = String.valueOf(example.length()-1);
           return getChar(example,ch);

        } else {
            return count;
        }
    }

    private static ArrayList<String> reverseArrayList(ArrayList<String> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            String a = list.remove(0);
            list = reverseArrayList(list);
            list.add(a);
            return list;
        }
    }

    public static boolean isPalindrome(ArrayList<Integer> list2) {
        if (list2.size() <= 1) {
            return true;
        } else if (list2.get(0) == list2.get(list2.size() - 1)) {
            list2.remove(0);
            list2.remove(list2.size()-1);
            return isPalindrome(list2);
        } else {
            return false;
        }
    }

    private static int even(ArrayList<Integer> list3) {
       int count = 0;
        if (!list3.isEmpty()) {
            int a = list3.get(0);
            if (a % 2 == 0) {
                count++;
                list3.remove(0);
                return even(list3);
            } else {
                list3.remove(0);
                return even(list3);
            }
        }
            return count;
    }
}


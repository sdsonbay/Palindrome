import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> digits = getDigits(number);
        List<Integer> reversedDigits = reverseList(digits);

        boolean palindrome = isPalindrome(digits, reversedDigits);

        if(palindrome){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(List<Integer> list, List<Integer> reversedList){

        boolean palindrome = true;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != reversedList.get(i)){
                palindrome = false;
                break;
            }
        }

        return palindrome;

    }

    public static List<Integer> reverseList(List<Integer> list){

        List<Integer> reversedList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            reversedList.add(list.get(list.size() - i - 1));
        }

        System.out.println("Reversed: " + reversedList);

        return reversedList;

    }

    public static List<Integer> getDigits(int number){

        List<Integer> digits = new ArrayList<>();
        int temp = number;

        do{
            digits.add(temp % 10);
            temp /= 10;
        }while(temp > 0);

        System.out.println("Digits: " + digits);

        return digits;
    }
}

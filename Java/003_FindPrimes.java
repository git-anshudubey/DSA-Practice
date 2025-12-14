import java.util.*;

class Solution03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for(int i = 2; i < number; i++){
            if(checkPrime(i) == true){
                System.out.print(i + " ");
            }
        }
        
    }

    static boolean checkPrime(int number){
        if(number == 2 || number == 3) return true;
        else if(number % 2 == 0 || number % 3 == 0) return false;
        for(int i = 5; i*i < number; i += 6){
            if(number % i == 0 || number % (i+2) == 0) return false;
        }
        return true;
    }
}

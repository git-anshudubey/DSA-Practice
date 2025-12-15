
class Solution04 {
    public static void main(String[] args){
        int arr[] = {52, 55, 41,85, 74, 96, 55};

        int n = arr.length;

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < n; i++){
            if( arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
                
            } else if( arr[i] != largest){

                if (arr[i] > secondLargest || secondLargest == -1){
                    secondLargest = arr[i];
                }
                
            }
        }
        System.out.print("Largest is: " + largest + " and SecondLargest is: " + secondLargest);
    }
}
class NumbersStringOperationsRunner{

    public static void main(String[] args){

        NumbersStringOperations stringoperation = new NumbersStringOperations();

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5};

        
        System.out.println("Even & Odd Sum");
        stringoperation.findEvenOddSum(array1);

        
        System.out.println("\n Reverse String ");
        String reversed = stringoperation.reverseString("hello");
        System.out.println("Reversed String: " + reversed);

       
        System.out.println("\n Palindrome Check ");
        System.out.println("121 is Palindrome? " + stringoperation.isPalindrome(121));
        System.out.println("122 is Palindrome? " + stringoperation.isPalindrome(122));

        
        System.out.println("\n Total Sum");
        int totalSum = stringoperation.findTotalSum(array2);
        System.out.println("Total Sum = " + totalSum);
    }
}
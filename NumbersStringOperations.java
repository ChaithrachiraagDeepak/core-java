class NumbersStringOperations{

    
    void findEvenOddSum(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Even Sum:" + evenSum);
        System.out.println("Odd Sum:" + oddSum);
    }

   
    String reverseString(String str){
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }

   
    int findTotalSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
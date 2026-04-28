import java.util.Arrays;

public class Strawberry {

    public static void main(String[] args) {

       char[] name= {'c','h','a','i'};
       String result = String.copyValueOf(name);
        System.out.println("result:"+result);

        String result1 = String.copyValueOf(name, 0, 2);
        System.out.println(result1);

        char[] name3 = {'d', 'e', 'e','p','u'};
        String result3= String.valueOf(name3);
        System.out.println("result3:"+result3);

        String result4 = String.valueOf(name3,3,1);
        System.out.println("result4:"+result4);

        String result5 = String.join(" ", "Cat","is","on","the","table.");
        System.out.println("result5:"+result5);


        int age = 21;
        String result6 = String.format("my name is %s and I am %d years old.", Arrays.toString(name), age);
        System.out.println("message:"+result6);








    }
}

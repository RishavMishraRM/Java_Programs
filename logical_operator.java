public class logical_operator {
    public static void main(String[] args) {
        

    int num1 = 7;
    int num2 = 5;
    int num3 = 5;
    int num4 = 9;
    
    boolean result = num1 > num2 && num3 < num4;
    System.out.println(result);

    boolean result1 = num1 > num2 || num3 > num4;
    System.out.println(result1);

    boolean result2 = num1 > num2 && num3 > num4;
    System.out.println(result2);

    boolean result3 = num1 > num2 && num3 > num4;
    System.out.println(!result3);

}
    }
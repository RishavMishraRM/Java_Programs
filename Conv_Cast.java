class Conv_Cast
{
    public static void main(String args[]) 
    {
        // Casting
        byte b = 126;
        System.out.println(b);
        int a = b;
        System.out.println(a+1);

        // this is not working as byte can only store value till 127
        //byte c = 267;
        //System.out.println(c);

        // Conversion
        int m = 256;
        byte k = (byte) a;
        System.out.println(k);


        int mt = 257;
        byte kt = (byte) mt;
        System.out.println(kt);


        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        byte p = 10;
        byte q = 20;
        int r = p * q;

        System.out.println(r);

    }
}
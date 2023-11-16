class Conv_Cast
{
    public static void main(String args[]) 
    {
        byte b = 126;
        System.out.println(b);

        // this is not working as byte can only store value till 127
        //byte c = 267;
        //System.out.println(c);

        int a = b;
        System.out.println(a);

    }
}
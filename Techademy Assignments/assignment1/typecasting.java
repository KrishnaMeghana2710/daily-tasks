class typecasting{
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a+" is an int type");
        float f=  10.0f;
        System.out.println(f+" is a float type");
        double d= 10.0;
        System.out.println(d+" is a double type");
        String s= "this is a String";
        System.out.println(s+ " is a string type");
        float f1= a;
        System.out.println(f1+ " this is a type casted float");
        int b= (int) f1;
        System.out.println(b+ " this is a typecasted int from float");
    }
}
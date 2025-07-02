package com.xworksz.wrap;

public class wrapper {
    public static void main(String[] args) {
        //boxing
        int a =10;
        Integer b=Integer.valueOf(a);
        System.out.println(b);

        float d = 12086;
        Float c=Float.valueOf(d);
        System.out.println(d);

        double e = 12.98;
        Double g=Double.valueOf(e);
        System.out.println(g);

        //unboxing
        int k =b.intValue();
        System.out.println(k);

        String h = "true";
        Boolean j=Boolean.parseBoolean(h);
        System.out.println(j);

        String z = "908";
        Integer y=Integer.parseInt(z);
        System.out.println(y);

        String x="90";
        Float w=Float.parseFloat(x);
        System.out.println(w);

        String s = w.toString();
        System.out.println(s);
        
        String u = "0";
        Boolean v=Boolean.parseBoolean(u);
        System.out.println(v);


    }

}
